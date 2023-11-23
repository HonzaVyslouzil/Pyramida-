import java.util.Scanner;

/*
     *
    ***
   *****
  *******
*
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vstup = sc.nextInt();
        int vyska = 1;
        for (int radek = vstup; radek > 0; radek--){
            for (int mezera = 1; mezera <= radek; mezera++){
                System.out.print(" ");
            }
            for (int hvezda = 1; hvezda <= vyska; hvezda++){
                System.out.print("* ");
            }
            System.out.println();
            vyska++;
        }

    }
}