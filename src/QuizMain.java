import java.util.Scanner;


public class QuizMain {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");

        int userNumber = reader.nextInt();

        while  ((userNumber % 3) != 0){
            if (userNumber < 100) {
                System.out.println("Podana liczba jest za mała, podaj inną");
                userNumber = reader.nextInt();
            } else if (userNumber > 200) {
                System.out.println("Podana liczba jest za duża");
                userNumber = reader.nextInt();
            } else if (userNumber % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
                userNumber = reader.nextInt();
            }


        }
        System.out.println("Ta liczba jest OK");


    }
}

