import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner{
    public Runner(){
       VirtualPet v1 = new VirtualPet();
    v1.exercise();
    takeABeat(1000);
    v1.feed();

    }
    public String getAnswer(String q){
      String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    "Your Message",
                    "Your Title",
                    JOptionPane.PLAIN_MESSAGE
);
if(s.equals(“Yes”) ....


    }
    public void takeABeat(int milliseconds){
           try {
            Thread.sleep(1000); //milliseconds
        } catch(Exception e){
        
        }
    }
    public static void main(String[] args){
        new Runner();
    }
}
