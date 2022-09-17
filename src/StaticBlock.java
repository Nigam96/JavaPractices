
public class StaticBlock {
	
	static int a=10;
	static int b;
	
	static {
		System.out.println(b);
		b=4*a;
		System.out.println(b);
		System.out.println("This is StaticBlock");
	}

	public static void main(String[] args) {
		StaticBlock sb= new StaticBlock();
		System.out.println(sb.a+" "+sb.b);
		b+=5;
		System.out.println(sb.b);
		StaticBlock sb1= new StaticBlock();
        System.out.println(sb1.a+" "+sb1.b);
	}

}
