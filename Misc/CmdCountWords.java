class CountWords {
    String[] args;

    CountWords(String[] args) {
        this.args = args;
    }

    void countWords()
    {
        System.out.println("Number of Words " + args.length);
    }
}

class CmdCountWords {
    public static void main(String[] args) {
        CountWords cw = new CountWords(args);

        cw.countWords();
    }
}

//javac Main.java
//java Main arguments