import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Runner {
    public Runner(){
       VirtualPet v1 = new VirtualPet();
        //String a = getOption("", new Object[]{"", "",  ""});
        //takeABeat(10000);

        v1.sad();
        takeABeat(1000);
        String t = getOption("I'm sorry", new Object[]{"Why what did you do", "That was the last straw",  "It's ok"});

        if(t.equals("That was the last straw")){
            v1.shocked();
            String a = getOption("Please don't kill me", new Object[]{"BANG", "I would never"});

            if(a.equals("BANG")){
                v1.die();
                takeABeat(10000);
                v1.skeleton();
                takeABeat(10000);
                v1.grave();
                takeABeat(10000);
                v1.angel();
            }else{
                if(a.equals("I would never")){
                    v1.joyful();
                    takeABeat(1000);
                    v1.love();
                }
            }
        }else if(t.equals("It's ok")){
                v1.joyful();
                takeABeat(10000);
                v1.love();
                takeABeat(1000);
                v1.hungry();
                takeABeat(1000);
                String c = getOption("I'm hungry", new Object[]{"Shut up", "Have some food"});;
                if(c.equals("Shut up")){
                    v1.starving();
                    takeABeat(10000);
                    String d = getOption("", new Object[]{"Fine eat this", "I said shut up"});
                    if(d.equals("Fine eat this")){
                        v1.feed();
                        takeABeat(1000);
                        v1.sick();
                        takeABeat(1000);
                        v1.verysick();
                        takeABeat(10000);
                        v1.die();
                        takeABeat(10000);
                        v1.skeleton();
                        takeABeat(10000);
                        v1.grave();
                        takeABeat(10000);
                        v1.angel();
                    }else{
                        if(d.equals("I said shut up")){
                            v1.starving();
                            takeABeat(10000);
                            v1.die();
                            takeABeat(10000);
                            v1.skeleton();
                            takeABeat(10000);
                            v1.grave();
                            takeABeat(10000);
                            v1.angel();
                        }
                    }
                }else{
                    if(c.equals("Have some food")){
                        v1.surprised();
                        takeABeat(10000);
                        v1.feed();
                        takeABeat(1000);
                        String e = getOption("How did you know that it's my favorite", new Object[]{"It's my favorite too", "Lucky guess"});
                        if(e.equals("It's my favorite too")){
                        v1.joyful();
                        }else{
                            if(e.equals("Lucky guess")){
                                v1.feed();
                            }
                        }
                    }
               }


        }
        else if(t.equals("Why what did you do")){
            String f = getOption("I accidentally ate your sister", new Object[]{"How dare you", "Okey dokey", "Good ridance"});
            if(f.equals("How dare you")){
                v1.depressed();
                takeABeat(10000);
                v1.die();
                takeABeat(10000);
                v1.skeleton();
                takeABeat(10000);
                v1.grave();
                takeABeat(10000);
                v1.angel();
            }else if(f.equals("Okey dokey")){
                   String g = getOption("Are you not mad", new Object[]{"Not really", "I could never be mad at you"});
                   if(g.equals("Not really")){
                    v1.shocked();
                    takeABeat(10000);
                    v1.die();
                    takeABeat(10000);
                    v1.skeleton();
                    takeABeat(10000);
                    v1.grave();
                    takeABeat(10000);
                    v1.angel();
                   }else{
                    if(g.equals("I could never be mad at you")){
                        v1.love();

                    }
                   }

            }else if(f.equals("Good ridance")){
                        v1.joyful();

            }
        }
    }


    

    public String getAnswer(String q) {
        String s = (String) JOptionPane.showInputDialog(
                new JFrame(),
                q,
                "Get a Response",
                JOptionPane.PLAIN_MESSAGE);
        return s;

    }

    public String getOption(String question, Object[] possibilities) {

        String s = (String) JOptionPane.showInputDialog(
                new JFrame(),
                question,
                "Customized Dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                "ham");
        return s;
    }

    public void takeABeat(int milliseconds) {
        try {
            Thread.sleep(1000); // milliseconds
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {
        new Runner();
    }
}
