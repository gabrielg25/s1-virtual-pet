import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner{
    public Runner(){
       VirtualPet v1 = new VirtualPet();
    
    
       v1.sad();
    takeABeat(1000);
    String b = getAnswer("I'm sorry");
    if(b.equals("That was the last straw")){
v1.shocked();
     String a = getAnswer("Please don't kill me");
     if(a.equals("BANG")){
        v1.die();
        takeABeat(10000);
        v1.skeleton();
         takeABeat(10000);
         v1.grave();
          takeABeat(10000);
        v1.angel();
     }
    }else{
        if(b.equals("I'm in a good mood")){
            v1.joyful();
             takeABeat(10000);
             v1.love();
              takeABeat(1000);
              v1.hungry();
               takeABeat(1000);
               String c = getAnswer("I'm hungry");
               if(c.equals("Shut up")){
                v1.starving();
                 takeABeat(10000);
                 String d = getAnswer("Please I'm starving");
                 if(d.equals("fine eat this"));
                 v1.feed();
                  takeABeat(1000);
                  v1.sick();
                   takeABeat(1000);
                   v1.verysick();
               }


        }
    }

    }
    public String getAnswer(String q){
      String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a Response",
                    JOptionPane.PLAIN_MESSAGE
);
return s;


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
