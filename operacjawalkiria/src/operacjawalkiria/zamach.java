package operacjawalkiria;

public class zamach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
		int mnoznik = 1;
		for(int i = 1; i < 10000; i=i*2)
			{
				System.out.print(i+"("+mnoznik+ ")," );
				suma = suma + i*mnoznik;
				mnoznik = mnoznik * (-1);
			}
           System.out.println("");
           System.out.println("Suma:"+suma);

	    }
	}
