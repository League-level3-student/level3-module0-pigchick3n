package _03_More_Array_Fun;

public class MoreArrayFunRunner {
	public static void main(String[] args) {
		String[] strings={"hi","hey","wassup","sup","hello","nicetomeetyou","HEHEXD"};
		
		MoreArrayFun maf = new MoreArrayFun(strings);
		maf.print();
		maf.backwards();
		maf.printother();
		maf.printrand();
		
	}
}
