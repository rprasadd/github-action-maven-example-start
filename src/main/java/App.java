import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import org.openqa.selenium.WebDriver;
public class App
{
    static int screenshotNum=0;
    static WebDriver driver=null;
        
    public static void main( String[] args ) throws IOException
    {
        //Instantiating the File class
        //File file = new File("out.log");
        //Instantiating the PrintStream class
        //PrintStream stream = new PrintStream(file);
        //System.setOut(stream);
        //Printing values to file    

        System.out.println("I am your awesome Java application!");

        DeepThought ourSuperComputer = new DeepThought();
        int ans = ourSuperComputer.answer_to_the_ultimate_question_of_life_the_universe_and_everything();
        System.out.println(ans);

        UrlSelenium selenium = new UrlSelenium(0, null);
       
        selenium.initDriver();
        selenium.capture("https://www.google.com");
        selenium.capture("https://facebook.com");
        selenium.destroy();
       
    }
}