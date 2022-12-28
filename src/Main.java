import java.util.*;

public class Main {
    public static void main(String[] args) {
        final String BLACK_BOLD = "\033[1;30m";  // BLACK
        final String RED_BOLD = "\033[1;31m";    // RED
        final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
        final String CYAN_BOLD = "\033[1;36m";   // CYAN
        final String BLUE_BOLD = "\033[1;34m";   // BLUE

        encrypt encrypt = new encrypt();
        decrypt cozum = new decrypt();
        Scanner scanner = new Scanner(System.in);
        System.out.println(BLUE_BOLD+"Welcome to the program! \n");

        boolean loop = true;
        while (loop) {

            System.out.println(PURPLE_BOLD + "If the operation you want to do is to encrypt (1) \nIf it is to decrypt (2)");
            int operation = scanner.nextInt();

            if (operation < 1 || operation > 2) {
                System.out.println(RED_BOLD + "İncorrect entry");
            }
            switch (operation) {
                case 1:
                    encrypt.encryption();
                    break;
                case 2:
                    decrypt.decryption();
                    break;
            }
            System.out.println(CYAN_BOLD + "\nTo continue processing (1) to finish (2) ");
            int status = scanner.nextInt();

            switch (status) {
                case 2:
                    System.out.println(BLACK_BOLD + "The system is shutting down...");
                    loop = false;
                    break;
            }
        }


    }
}

