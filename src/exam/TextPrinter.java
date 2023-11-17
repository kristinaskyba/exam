package exam;

class TextPrinter {
    public static void printCatAscii() {
        String catAscii =
                " /\\_/\\\n" +
                        "( o.o )\n" +
                        " > ^ <";

        System.out.println(catAscii);
    }

    public String readAndOutputText(String line) {
        //print line after user
        // Recently learned ternary operator, using it to practice :)
        System.out.println(! line.equalsIgnoreCase("stop") ? line : "");
        return ! line.equalsIgnoreCase("stop") ? line : "";
        /*  if (! line.equalsIgnoreCase("stop")) {
            System.out.println(line);
        }
        return line;*/
    }


    int lineCount = 0;
    int totalCharacters = 0;
    String[] totalWords;
    int wordCount = 0;
    String longest = "";
    boolean enteredStop;

    public void getTextInfo(String line) {
        if (! line.equalsIgnoreCase("stop")) {
            lineCount++;
            totalCharacters += line.length();
            totalWords = line.split("\\s+");//split with space
            wordCount += totalWords.length;
            for (String word : totalWords) {
                longest = (word.length() > longest.length()) ? word : longest;
                //Wrote with ternary operator as has been
                // shown recently :)
              /*  if (word.length() > longest.length()) {
                    longest = word;
                }*/
            }
        } else {
            enteredStop = true; //while loop will print till it's true
        }
    }

    public void printMessage() {
        System.out.println("Here is the statistics for your text: ");
        System.out.println("\nAmount of lines: " + lineCount);
        System.out.println("Amount of symbols: " + totalCharacters);
        System.out.println("Amount of words: " + wordCount);
        System.out.println("The longest word is: " + longest);
    }

    private boolean stopBoolean; //this one is for testing if STOP word is working

    public void setStopWord(boolean value) { //setting boolean in test
        stopBoolean = value;
    }

    public boolean isOne() { //actual in test
        return stopBoolean;
    }
}


