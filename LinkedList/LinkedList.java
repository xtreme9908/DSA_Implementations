package project_LL;

public class LinkedList {
	public Node head = null ;
	
	public void InsertAtHead(int data) {
		Node newnode = new Node(data) ;
		newnode.next = head ;
		head = newnode ;
		
	}
	
	public void InsertAtEnd(int data) {
		Node newnode = new Node(data) ;
		Node temp = head ;
		while(temp.next != null) {
			temp = temp.next ;
		}
		temp.next = newnode ;
	}
	
	public void Scrape() {
		Node temp = head ;
		while(temp != null) {
			System.out.print(temp.data + " , ") ;
			temp = temp.next ;
		}
		System.out.println();
		
	}
	
	public void Search(int data) {
		Node temp = head ;
		int index = 0 ;
		boolean status = false ;
		while( temp.data != data) {
			if(temp.data == data) {
				status = true ;
				break;
			}
			temp = temp.next ;
			index++ ;
		}
		if(status == true) {
			System.out.println("Element found at index " + index);
		}
		
	}
	
	public void Count() {
		Node temp = head ;
		int count = 0 ;
		if(temp.next == null) {
			count = 1 ;
		}
		else {
			while(temp.next != null) {
				count ++ ;
			}
		}
		System.out.println("Number of Elements : " + count);
		
	}
	
	public void InsertAtPosition(int data , int pos) {
		Node newnode = new Node(data) ;
		Node temp = head ;
		for(int i=0 ; i<pos-1 ; i++) {
			temp = temp.next ;
		}
		newnode.next = temp.next ;
		temp.next = newnode ;
	}
	
	public void PrintAllEven() {
		Node temp = head ;
		while(temp.next != null) {
			if(temp.data%2 == 0) {
				System.out.println(temp.data + " , ");
			}
			temp = temp.next ;
		}
	}
	
	public void PrintAllOdd() {
		Node temp = head ;
		while(temp.next != null) {
			if(temp.data%2 != 0) {
				System.out.println(temp.data + " ");
			}
			temp = temp.next ;
		}
	}
	
	public void PrintMiddle(int Scrape) {
		int count = Scrape ;
		if(count%2 == 0) {
			Node tempeven = head ;
			for(int i=0 ; i<count/2 ; i++) {
				tempeven = tempeven.next;
			}
			System.out.print("Middle Elements are : " + tempeven.data + " , ");
			tempeven = tempeven.next ;
			System.out.print(tempeven.data);
			System.out.println();
		}
		else {
			Node tempodd = head ;
			for(int i=0 ; i<count/2 ; i++) {
				tempodd = tempodd.next ;
			}
			System.out.println("Middle Element is : " + tempodd.data);
		}
		
	}
	
	public void SortedInsert(int data) {
		Node temp = head ;
		Node newnode = new Node(data);
		try {while(!(temp.data<data && temp.next.data>= data)) {
			temp = temp.next ;
		}
		newnode.next = temp.next ;
		temp.next = newnode ;
		}
		
		catch(NullPointerException e) {
			newnode.next = temp.next ;
			temp.next = newnode;
		}
		
	}
}
