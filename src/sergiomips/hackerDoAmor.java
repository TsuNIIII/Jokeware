package sergiomips;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

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
