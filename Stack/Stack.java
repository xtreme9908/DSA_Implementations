public void DeleteFirst() {
		head = head.next;
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

public void Push(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode ;
}
	
public int Pop() {
	if(head == null) {
		return 9999999;
	}
	else {
		int key = head.data;
		DeleteFirst();
		return key ;
	}
		
}
	
public void CheckHeadNull() {
	if(head == null) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
}
	
boolean IsEmpty() {
	if(head == null) {
		return true;
	}
	else {
		return false;
	}
}
	
public void peek() {
	Node temp = head ;
	temp = temp.next;
}
	
	
public String checkBalance(String str) {
	LinkedList stack = new LinkedList() ;
	int m=0;
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		if (ch == '0') {
			stack.Push(ch);
		}
		else if ((ch == '1')
			&& stack.head==null) {
			m=1;
		} else {
			stack.Pop();
		}
		}
		if (stack.head==null & m==0)
			return "Balanced Parenthisis";
		else
			return "Not Balanced";		
}

}
