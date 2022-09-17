
public class StaticExample {
	static class Test{
		static String name;
		public Test(String name) {
			this.name=name;
		}
	}

	public static void main(String[] args) {
		Test a =new Test("Nigam");
		Test b =new Test("Susmita");
		System.out.println(a.name+" and  "+b.name);
 
		
	}

}
