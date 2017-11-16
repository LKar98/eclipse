package operacjawalkiria;

public class odwrotnosc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double suma = 1;
		for(int i = 1; i < 10; i++)
		{
			suma = suma+(double)1/i;
			System.out.print(i+", ");
			
		}
		System.out.println("");
		System.out.print(suma);

	}

}
