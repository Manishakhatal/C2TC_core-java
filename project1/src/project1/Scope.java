package project1;

public class Scope {

public static void main(string[] args)  {
      // TODO Auto-generation method stub
      int outer = 1;
     {
      int inner = 2;
      System.out.print("inner = " + inner);
      System.out.print("outer = " + outer);
     }
      int inner = 3;
      System.out.print("inner =" + inner);
      System.out.print("outer =" + outer);
     }
}


public class RelationalAndLogicalOperators  {
public static void main(String[] args) {
    Random rand = new Random();
int i = rand.nextInt(100);
int j = rand.nextInt(100);
System.out.println("i = " + i);
System.out.println("j = " + j);
System.out.println("i > j is " + (i > j));
System.out.println("i < j is " + (i < j));
System.out.println("i >= j is " + (i >= j));
System.out.println("i <= j is " + (i <= j));
System.out.println("i == j is " + (i == j));
System.out.println("i != j is " + (i != j));
System.out.println("(i < 10) && (j < 10) is " + ((i < 10)
&& (j < 10)));
System.out.println("(i < 10) || (j < 10) is " + ((i < 10)
|| (j < 10)));
}
}
public class TernaryOperator{
	public static void main(String[] args) {
		int v = 1;
		System.out.println(v == 1 ? "A" : "B");
		v++;
		System.out.println(v == 1 ? "A" : "B");
		}
		}
		public class PrefixPostfix {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numA = 5;
		int numB = 10;
		int numC = 0;
		numC = --numC + numB--;
		System.out.println(numA);
		System.out.println(numC);
		System.out.println(numB);
		}
		}
		public class LeftShift {
		public static void main(String[] args) {
			
		}