import java.util.Scanner;
public class pemilihanbilangan13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

int angka = 4;
String hasil;

hasil = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
System.out.println(angka + " adalah " + hasil);


}

    }


