package sergiomips;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class sergioMIPS {
    
    private final  Random rd = new Random();
    private final  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private final int width = (int) screenSize.getWidth();
    private final int height = (int) screenSize.getHeight();
  
    public void Popup() {
        JWindow win = new JWindow();
        JLabel label = new JLabel("INVADIDO POR SERGIO MIPS",JLabel.CENTER);
        
        win.add(label);
        win.setSize(200, 75);
        win.setLocation(rd.nextInt(width), rd.nextInt(height));
        win.setVisible(true);
    }
    
    public void ImagePopup(){
        JFrame f = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        f.setUndecorated(true);
        ImageIcon image = new ImageIcon("sergioMIPS.jpeg");
        JLabel lbl = new JLabel(image);
        
        f.getContentPane().add(lbl);
        f.setSize(image.getIconWidth(), image.getIconHeight());
        
        
        f.setLocation(rd.nextInt(width), rd.nextInt(height));
        f.setVisible(true);
    }
    
    public static void main(String[] args) throws AWTException, InterruptedException {
        sergioMIPS fv = new sergioMIPS();
        String filepath = "hackerDoAmor.wav";
        hackerDoAmor musicObject = new hackerDoAmor();
        musicObject.playSound(filepath);
        
        while(true){
            fv.Popup();
            fv.ImagePopup();
        } 
        
    }
    
}
