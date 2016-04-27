package lab1;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageGreeter
{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL(
         "http://horstmann.com/cay-tiny.gif");
      
      
      
      JOptionPane.showMessageDialog(null, "Hey, whats up?", "Title",
         JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
      System.exit(0);
   }
}
