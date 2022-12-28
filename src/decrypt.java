import java.util.*;

public class decrypt {
    public static void decryption(){
        final String WHITE_BOLD = "\033[1;37m";  // WHITE
        final String GREEN_BOLD = "\033[1;32m";  // GREEN
        final String BLUE_BOLD = "\033[1;34m";   // BLUE

        List<String> lst = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println(WHITE_BOLD + "Enter the encrypted message ;");
        String encryptedtxt = scanner.nextLine();

        int a = 0, i = encryptedtxt.split(" ").length;
        lst.add(Arrays.toString(encryptedtxt.split(" ")));
        lst.remove(0);

        String[] split = encryptedtxt.split(" ", 0);
        Collections.addAll(lst, split);
        String solvedtxt = "";

        while (a < i) {
            int encryptedtxtint = Integer.parseInt(lst.get(a));
            String str = Character.toString((char) encryptedtxtint);
            solvedtxt += str;
            a++;
        }

        System.out.println(BLUE_BOLD + "\nYour resolved message ; \n" + GREEN_BOLD + solvedtxt);

    }
}
