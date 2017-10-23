import java.util.Scanner;

//Програма, що виводть в консоль слово, що було введено із консолі
//В консолі потрібно ввести тідбки одне слово JAVA
public class Main {
    public static void main(String[] args) {
        
        String word;
        Scanner inputDevise=new Scanner(System.in);

        System.out.print("Введіть слово");
        word = inputDevise.next();

        //Виведення слова
        System.out.println("      J\t     A    \t V       V\t     A    ");
        System.out.println("      J\t    A A   \t  V     V \t    A A   ");
        System.out.println("      J\t   A   A  \t   V   V  \t   A   A  ");
        System.out.println("J     J\t  AAAAAAA \t    V V   \t  AAAAAAA ");
        System.out.println("JJJJJJJ\t A       A\t     V    \t A       A");

    }
}
