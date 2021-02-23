import java.util.Scanner;

public class DniTygodnia {
    public static void main(String[] args) {
        System.out.println("Podaj dzien tygodnia");
        Scanner scanner = new Scanner(System.in);
        int dzienTygodnia = scanner.nextInt();
        switch (dzienTygodnia){
            case 1: System.out.println("Dzien 1 to Poniedzialek");
                break;
            case 2:System.out.println("Dzien 2 to Wtorek");
                break;
            case 3:System.out.println("Dzien 3 to Sroda");
                break;
            case 4:System.out.println("Dzien 4 to Czwartek");
                break;
            case 5:System.out.println("Dzien 5 to Piatek");
                break;
            case 6: System.out.println("Dzien 6 to Sobota");
                break;
            case 7: System.out.println("Dzien 7 to Niedziela");
            break;


        }

    }
}

