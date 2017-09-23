
public class ImplicitCastingDemo {
	 
	
	
	public static void main(String[] args) {
		int a =100;
		byte b = (byte) a;
		
		System.out.println("byte b "+b);
		
		int c = 98;
		char d = (char) c;
		
		System.out.println("char d "+d);
		
//		out of range
		
		int e =140;
		byte f = (byte) e;
		
		System.out.println("byte f "+f);
		
		int g =410;
		byte h = (byte) g;
		char i = (char) h;
		System.out.println("char h "+h);
		System.out.println("char i "+i);
	}
}
