package linkedlist;

public class InsertAtEndOfCLLEff {
	
	static Node insertAtEnd(Node head, int x) {
		Node temp= new Node(x);
		if(head == null) {
			temp.next= temp;
			return temp;
		} else {
			temp.next= head.next;
			head.next= temp;
			int d= temp.data;
			temp.data= head.data;
			head.data= d;
			return temp;
			
		}
	}
	
	static void print(Node head) {
		if(head == null)
			
			return;
		System.out.println(head.data + " ");
		for(Node r= head.next; r!= head; r=r.next) {
			System.out.println(r.data + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Node head= new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
	//	Node temp= new Node(40);
		insertAtEnd(head, 40);
		print(head);
	}

}
