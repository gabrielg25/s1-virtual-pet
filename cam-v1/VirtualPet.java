/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal2");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }
    public void die(){
        face.setImage("dead2");
    }
    public void sad(){
        face.setImage("sad2");
    }
    public void angel(){
        face.setImage("angel2");
        face.setMessage("GAME OVER");
    }
    public void shocked(){
        face.setImage("shocked2");
    }
    public void skeleton(){
        face.setImage("skeleton2");
    }
    public void grave(){
        face.setImage("grave");
    }
    public void joyful(){
        face.setImage("happy2");
    }
    public void love(){
        face.setImage("love2");
    }
    public void hungry(){
        face.setImage("hungry2");
    }
    public void starving(){
        face.setImage("veryhungry2");
    }
    public void sick(){
        face.setImage("sick2");
    }
    public void verysick(){
        face.setImage("sick2");
    }
    public void surprised(){
        face.setImage("shocked2");
        face.setMessage("Wow that's my favorite food!");
    }
    public void depressed(){
        face.setImage("verysad2");
    }

} // end Virtual Pet
