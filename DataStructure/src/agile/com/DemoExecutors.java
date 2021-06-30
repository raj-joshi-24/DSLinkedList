package agile.com;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutors {
    public static int sum(int start,int end){
	int s=0;
	for(int i=start;i<=end;i++)
		s=s+i;
	return s;
	}
    public static void main(String[] args) throws InterruptedException, ExecutionException {  
        ExecutorService executorService = Executors.newSingleThreadExecutor();  
        Set<Callable<Integer>> callables = new HashSet<Callable<Integer>>();  
        callables.add(new Callable<Integer>() {  
            public Integer call() throws Exception {  
                return sum(1,250);  
            }  
        });  
        callables.add(new Callable<Integer>() {  
            public Integer call() throws Exception {  
                return sum(251,500);  
            }  
        });  
        callables.add(new Callable<Integer>() {  
            public Integer call() throws Exception {  
                return sum(501,1000);  
            }  
        });  
  
    	int finalSum=0;
        java.util.List<Future<Integer>> result = executorService.invokeAll(callables);  
        for(Future<Integer> f:result)  {
        	finalSum+=f.get();
	}

        System.out.println("result1 = " + finalSum);  
          
  
        executorService.shutdown();  	
        }

}
