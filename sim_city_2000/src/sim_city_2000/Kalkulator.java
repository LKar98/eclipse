package sim_city_2000;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        
        System.out.print("Podaj liczb� a:");
        int a = odczyt.nextInt();
        
        System.out.print("Podaj liczb� b:");
        int b = odczyt.nextInt();
        
        System.out.print("Podaj liczb� c:");
        int c = odczyt.nextInt();
        odczyt.close();
        
        
        int suma = a+b;
        int mn = a*b;
        double dz = a*1.0/b;
        int odejmowanie = a-b;
        int sumac  = a+b+c;
        double pierw = Math.sqrt(a);
        double potega = Math.pow(a, b);
        int f = Math.floorMod(a, b);
        int R = Math.round(a);
        int dzCalk = a/b;
        int reszta = a%b;
        
        System.out.println("a / b "+dzCalk);
        System.out.println("reszta z dziel a / b "+reszta);
        System.out.println("Liczba z Floor:"+f);
        System.out.println("Pi wynosi: "+Math.E);
        System.out.println("Liczba z Round: "+R);
        System.out.println("Suma z liczb� c wynosi: "+sumac);
        System.out.println("Suma wynosi: "+suma);
        System.out.println("Roznica wynosi: "+odejmowanie);
        System.out.println("iloczyn wynosi: "+mn);
        System.out.println("iloraz wynosi: "+dz);
        System.out.println("Pierwiastek wynosi: "+pierw);
        System.out.println("Potega wynosi: "+potega);
	}

}
