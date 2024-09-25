import java.util.Scanner;
public class pemilihanharidenganIf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayName;
        String dayType;

        System.out.println ("Input day: ");
        dayName = sc.nextInt();
        
        if (dayName >= 1 && dayName <= 5) {
            dayType = "weekday";
        } else if (dayName == 6 || dayName == 7) {
            dayType = "weekend";
        } else {
            dayType = "invalid number";
        }
        System.out.println(dayName + " adalah " + dayType);
}
}