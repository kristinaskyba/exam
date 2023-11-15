package exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TextPrinter newLines = new TextPrinter();

        System.out.println("Write as many words as you want to calculate the statistics about those words.  If you " +
                "want to" +
                " finish, " +
                "type - STOP");
        String line;
        do {
            line = input.nextLine();
            newLines.readAndOutputText(line);
            newLines.getTextInfo(line);
        }
        while ( ! newLines.enteredStop );
        newLines.printMessage();
    }
}



