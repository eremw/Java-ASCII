import java.util.*;

public class encrypt {
    public static void encryption() {
        final String WHITE_BOLD = "\033[1;37m";  // WHITE
        final String GREEN_BOLD = "\033[1;32m";  // GREEN
        final String BLUE_BOLD = "\033[1;34m";   // BLUE

        Scanner scanner = new Scanner(System.in);

        System.out.println(WHITE_BOLD+"Enter the message to be encrypted;");
        String message = scanner.nextLine(), resolvedtxt="";

        int a=0 , ascii;
        int lenght = message.length();

        while (a<lenght) {

            ascii = message.charAt(a);
            resolvedtxt += ascii + " ";
            a++;

        }

        System.out.println(BLUE_BOLD+"\nYour ascii encryption ;\n"+GREEN_BOLD+resolvedtxt);
    }
}
