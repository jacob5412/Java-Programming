/*
 * Create a class Film with string objects which stores name, language and lead_actor and
 * category (action/drama/fiction/comedy). Also include an integer data member that stores the
 * duration of the film. Include parameterized constructor, default constructor and accessory
 * functions to film class. Film objects can be initialized either using a constructor or accessor functions.
 */

class Film{
    String name;
    String language;
    String lead_actor;
    String category;
    int duration;

    Film(){
        name = null;
        language = null;
        lead_actor = null;
        category = null;
        duration = 0;
    }

    Film(String n, String lang, String actor, String cat, int dur){
        name = n;
        language = lang;
        lead_actor = actor;
        category = cat;
        duration = dur;
    }
}

public class FilmMain {
    public static void main(String[] args) {

        Film[] films = new Film[4];

        films[0] = new Film();
        films[0].name = "Terminator";
        films[0].language = "English";
        films[0].lead_actor = "Arnold";
        films[0].duration = 10;
        films[0].category = "Action";

        films[1] = new Film();
        films[1].name = "Terminator 2";
        films[1].language = "English";
        films[1].lead_actor = "Arnold";
        films[1].duration = 20;
        films[1].category = "Action";

        films[2] = new Film();
        films[2].name = "Robot 1";
        films[2].language = "Tamil";
        films[2].lead_actor = "Rajini";
        films[2].duration = 10;
        films[2].category = "Comedy";

        films[3] = new Film();
        films[3].name = "Robot 2";
        films[3].language = "Tamil";
        films[3].lead_actor = "Rajini";
        films[3].duration = 30;
        films[3].category = "Comedy";

        int min = 9999999;
        int imin = 0;

        for(int i = 0; i < 4; i++){
            if(films[i].lead_actor.equals("Arnold"))
                if(films[i].duration < min){
                    min = films[i].duration;
                    imin = i;
                }
            if(films[i].category.equals("Comedy"))
                System.out.println(films[i].name + " is a Comedy movie");
        }

        System.out.println("Shortest Arnold film is " + films[imin].name + " and duration: " + min);
    }
}
