
package patepeli;

import java.util.Random;
public class RandomGen {
    
    private Random randomi;

    public RandomGen() {
        randomi = new Random();
    }
    
    public int giveRandomInt(int min, int max) {
        int randomLuku = randomi.nextInt(1+max-min) + min;
        return randomLuku;
}
    
}
