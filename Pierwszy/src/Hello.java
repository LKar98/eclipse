
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum =0;
		for (int i=1000; i <=10000; i++)
        {	
		System.out.print(sum);
		System.out.print(" ");
		System.out.println(i);
		sum = sum + i;	
        } // for...
		System.out.print("Ostateczny Wynik: ");
		System.out.println(sum);
		
		System.out.println( Integer.MAX_VALUE);
		System.out.println( Integer.MIN_VALUE);

	}

}