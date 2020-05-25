import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.IOException;

public class BusinessPageBase {

    protected static final class Selector {
        public static final String BUSINESS_TITLE = "Breaking News, Latest News and Videos - CNN";
        public static final String URL = "https://edition.cnn.com/business";
    }

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws IOException {
        app.init();
        //open(Selector.URL);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        //app.stop();
    }

    public void playSound(String musicLocation) {
        try {
           File musicPath = new File(musicLocation);
           if(musicPath.exists())
           {
               AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
               Clip clip = AudioSystem.getClip();
               clip.open(audioInput);
               clip.start();

               //JOptionPane.showMessageDialog(null, "Press OK to stop playing");
           }
           else {
               System.out.println("Can't fine file");
           }


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }





}