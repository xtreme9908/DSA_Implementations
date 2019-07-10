public class Driver {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.Push(10);
		list1.Push(11);
		list1.Push(17);
		list1.Scrape();
		list1.Pop();
		list1.CheckHeadNull();
		list1.Pop();
		String s = list1.checkBalance("01");
		System.out.println(s);
	}
}