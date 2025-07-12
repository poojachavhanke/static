package xyz;

class TY{
	static int studmark=95;
	static String studname="pooja";
	static float percentage=94.38f;
	 static void info() {
		System.out.println("TY.studmark "+studmark);
		System.out.println("TY.studname "+studname);
		System.out.println("TY.percentage "+percentage);
	}
	
	
}
   
public class Static {
	String classname = "tybcs";
	static String Teachername = "Tycomputerscience";
	public static void main(String[] args)
	{
		Static s1 = new Static();
		System.out.println(s1.classname);
		System.out.println(Teachername);
		TY.info();
	}

}
