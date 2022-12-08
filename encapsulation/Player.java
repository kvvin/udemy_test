package encapsulation;

//class without encapsulation
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health-damage;
        if(this.health<=0){
            System.out.println("Player dead ");
            //Reduce no.of lives remaining for player
        }
    }

    public int healthRemaining(){
        return this.health;
    }

}
