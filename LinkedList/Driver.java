package project_LL;

public class Driver {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.InsertAtHead(5);
		list1.InsertAtEnd(7);
		list1.Scrape();
		list1.Search(5);
		list1.InsertAtPosition(4,2);
		list1.PrintAllEven();
		list1.PrintAllOdd();
		list1.PrintMiddle(6);
		list1.SortedInsert(8);
	}
}
