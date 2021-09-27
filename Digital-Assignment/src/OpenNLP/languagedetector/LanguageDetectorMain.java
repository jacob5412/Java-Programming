package OpenNLP.languagedetector;

import opennlp.tools.langdetect.Language;
import opennlp.tools.langdetect.LanguageDetector;
import opennlp.tools.langdetect.LanguageDetectorME;
import opennlp.tools.langdetect.LanguageDetectorModel;

import java.io.File;
import java.io.IOException;

public class LanguageDetectorMain {

    public static void main(String[] args) throws IOException{

        LanguageMapper languageMapper = new LanguageMapper();

        // load the trained Language Detector Model file
        File modelFile = new File("resources/langdetect-183.bin");

        LanguageDetectorModel trainedModel = new LanguageDetectorModel(modelFile);

        // load the model
        LanguageDetector languageDetector = new LanguageDetectorME(trainedModel);

        // use the model for predicting the language
        //Spanish
        Language[] languages = languageDetector.predictLanguages("Puedo darte ejemplos de los métodos");

        System.out.println("Predicted language: "+ languageMapper.getLanguage(languages[0].getLang()));

        // French
        languages = languageDetector.predictLanguages("Je peux vous donner quelques exemples de méthodes qui ont fonctionné pour moi.");

        System.out.println("Predicted language: "+ languageMapper.getLanguage(languages[0].getLang()));

        // English
        languages = languageDetector.predictLanguages("I can give you some examples of methods that have worked for me.");

        System.out.println("Predicted language: "+ languageMapper.getLanguage(languages[0].getLang()));

        // confidence for rest of the languages
	       for(Language language:languages){
	            System.out.println(language.getLang()+"  confidence:"+language.getConfidence());
	        }
    }
}