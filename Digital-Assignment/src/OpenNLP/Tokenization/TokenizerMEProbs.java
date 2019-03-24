import java.io.FileInputStream;
import java.io.InputStream;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;

public class TokenizerMEProbs {

    public static void main(String args[]) throws Exception{
        String sent = "Hello John how are you welcome to Tutorialspoint";

        //Loading the Tokenizer model
        InputStream inputStream = new FileInputStream("resources/en-token.bin");
        TokenizerModel tokenModel = new TokenizerModel(inputStream);

        //Instantiating the TokenizerME class
        TokenizerME tokenizer = new TokenizerME(tokenModel);

        //Retrieving the positions of the tokens
        Span tokens[] = tokenizer.tokenizePos(sent);

        //Getting the probabilities of the recent calls to tokenizePos() method
        double[] probs = tokenizer.getTokenProbabilities();

        //Printing the spans of tokens
        for(Span token : tokens)
            System.out.println(token +" "+sent.substring(token.getStart(), token.getEnd()));
        System.out.println("  ");
        for(int i = 0; i<probs.length; i++)
            System.out.println(probs[i]);
    }
}    