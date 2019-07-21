class MyLinkedList {
    class Node {
	    public int data;
	    public Node next;
	
	    public Node(int input){
		    data = input ;
		    next = null ;
	    }
    }
    public Node head = null;
    public int size;
    
    public MyLinkedList() {
        
    }
    
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        if(size==1) return head.data;
        Node temp = head ;
		for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    
   
    public void addAtHead(int val) {
        addAtIndex(0,val);  
    }
    
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    
    public void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index <= 0) {
            Node prev = head;
            head = new Node(val);
            head.next = prev;
            size++;
        }
        else{
            size++;
            Node newnode = new Node(val) ;
		    Node temp = head ;
		    for(int i=0 ; i<index-1 ; i++) {
			    temp = temp.next ;
		    }
		    newnode.next = temp.next ;
		    temp.next = newnode ;
        }   
    }
    
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size) return ;
        size--;
        if(index==0){
            head = head.next;
            return;
        }
        
        Node temp = head ;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */