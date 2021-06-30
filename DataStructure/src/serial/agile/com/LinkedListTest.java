package serial.agile.com;
class Node{
	int data;
	Node next;

}
public class LinkedListTest {
	Node start;
	LinkedListTest()
	{
		start=null;
	}
	void insert(int val) {
		Node new1=new Node();
		new1.data=val;
		new1.next=null;
		Node t=start;
		if(t==null)
			start=new1;
		else {
			while(t.next!=null)
			{
				t=t.next;
			}
			t.next=new1;
		}
		
	}
	void show() {
		if(start==null)
			System.out.println("Your list is empty ");
		else
		{
			Node p=start;
			while(p!=null) {
				System.out.println(p.data);
				p=p.next;
			}
		}
	}
	public static void main(String[] args) {
		LinkedListTest t1=new LinkedListTest();
		t1.insert(10);
		t1.insert(20);
		t1.insert(30);
		t1.insert(40);
		t1.show();

	}
}
