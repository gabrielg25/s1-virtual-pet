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
        face.setImage("normal");
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
        face.setImage("dead");
    }
    public void sad(){
        face.setImage("sad");
    }
    public void angel(){
        face.setImage("angel");
    }
    public void shocked(){
        face.setImage("shocked");
    }
    public void skeleton(){
        face.setImage("skeleton");
    }
    public void grave(){
        face.setImage("pushingdaisies");
    }
    public void joyful(){
        face.setImage("joyful");
    }
    public void love(){
        face.setImage("love");
    }
    public void hungry(){
        face.setImage("hungry");
    }
    public void starving(){
        face.setImage("starving");
    }
    public void sick(){
        face.setImage("sick");
    }
    public void verysick(){
        face.setImage("verysick");
    }

} // end Virtual Pet
