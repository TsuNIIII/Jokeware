package sergiomips;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//this class is mainly for aquiring a sound to play during the excution of the virus, choose anything in wav format
public class hackerDoAmor {
    
    void playSound(String audioLocation){
        try{
            File audioPath = new File(audioLocation); 
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(audioPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
