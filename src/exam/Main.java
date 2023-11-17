package exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TextPrinter newLines = new TextPrinter();
        TextPrinter.printCatAscii();
        System.out.println("Hej, Bamse! :) \nWrite as many words as you want to calculate the statistics about those " +
                "words.\nIf you " +
                "want to" +
                " finish, " +
                "type - STOP");

        String line;
        do {
            line = input.nextLine();
            newLines.readAndOutputText(line); //repeat the line
            newLines.getTextInfo(line); //calculate
        }
        while ( ! newLines.enteredStop ); //not equal false which means if stop entered print the statistic
        newLines.printMessage();
    }
}



