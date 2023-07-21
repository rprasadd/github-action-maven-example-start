import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
public class App
{
    public static void main( String[] args )
    {
        //Instantiating the File class
        File file = new File(".github\\output");
        //Instantiating the PrintStream class
        PrintStream stream = new PrintStream(file);
        System.setOut(stream);
        //Printing values to file    

        System.out.println("I am your awesome Java application!");

        DeepThought ourSuperComputer = new DeepThought();
        int ans = ourSuperComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything();
        System.out.println(ans);
    }
}