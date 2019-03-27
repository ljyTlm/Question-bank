package º¼µçoj;

import java.util.Scanner;

public class hdu1736{

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String string = "";
        while (scanner.hasNext()) {
             string += scanner.nextLine();
        }
        string.replace(",", "£¬");
        string.replace(".", "¡£");
        string.replace("", "");
        System.out.println(string);
    }

}