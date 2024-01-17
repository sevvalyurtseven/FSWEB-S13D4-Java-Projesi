import com.workintech.encapsulation.Player;
import com.workintech.encapsulation.Point;
import com.workintech.encapsulation.Weapon;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        Player player = new Player("Sevval", 90, Weapon.AXE);
        System.out.println("healthRemaining: " + player.healthRemaining());
        player.loseHealth(30);
        System.out.println("healthRemaining: " + player.healthRemaining());
        player.restoreHealth(20);
        System.out.println("healthRemaining: " + player.healthRemaining());

        Player testPlayer = new Player("Test", 10, Weapon.AXE);
        System.out.println("healthRemaining: " + testPlayer.healthRemaining());
        testPlayer.loseHealth(30);
        System.out.println("healthRemaining: " +testPlayer.healthRemaining());
        testPlayer.restoreHealth(20);
        System.out.println("healthRemaining: " + player.healthRemaining());

        System.out.println(testPlayer.toString());


    }
}