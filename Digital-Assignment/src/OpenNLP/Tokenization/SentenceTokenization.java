package OpenNLP.Tokenization;

import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.tokenize.WhitespaceTokenizer;

public class SentenceTokenization {
    public static void main(String[] args) {
        String sentence = "Hi. How are you? Welcome to Tutorialspoint. "
                + "We provide free tutorials on various technologies";

        //Instantiating SimpleTokenizer class
        SimpleTokenizer simpleTokenizer = SimpleTokenizer.INSTANCE;

        //Tokenizing the given sentence
        String tokens[] = simpleTokenizer.tokenize(sentence);

        //Printing the tokens
        for(String token :tokens){
            System.out.println(token);
        }

        //Instantiating whitespaceTokenizer class
        WhitespaceTokenizer whitespaceTokenizer = WhitespaceTokenizer.INSTANCE;

        //Tokenizing the given paragraph
        String whitetokens[] = whitespaceTokenizer.tokenize(sentence);

        //Printing the tokens
        for(String token : whitetokens)
            System.out.println(token);
    }
}
