import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Riffle ak47 = new Riffle(30, "AK47");
        Riffle m4 = new Riffle(25, "M4");
        Pistols desert_eagle = new Pistols(6, "Desert Eagle");
        Pistols p250 = new Pistols(10, "P250");

        Terrorist terrorist1 = new Terrorist(m4, p250, "Terrorist 1", 1, 1);
        Terrorist terrorist2 = new Terrorist(ak47, desert_eagle, "Terrorist 2", 1, 1);
        Terrorist terrorist3 = new Terrorist(ak47, desert_eagle, "Terrorist 3", 1, 1);
        Terrorist terrorist4 = new Terrorist(ak47, desert_eagle, "Terrorist 4", 1, 1);
        Terrorist terrorist5 = new Terrorist(ak47, desert_eagle, "Terrorist 5", 1, 1);

        Counter_terrorist counter_t1 = new Counter_terrorist(m4, desert_eagle, "Counter Terrorist 1", 2, 2);
        Counter_terrorist counter_t2 = new Counter_terrorist(ak47, p250, "Counter Terrorist 2", 2, 2);
        Counter_terrorist counter_t3 = new Counter_terrorist(ak47, p250, "Counter Terrorist 3", 2, 2);
        Counter_terrorist counter_t4 = new Counter_terrorist(ak47, p250, "Counter Terrorist 4", 2, 2);
        Counter_terrorist counter_t5 = new Counter_terrorist(ak47, p250, "Counter Terrorist 5", 2, 2);

        Player player = terrorist1;

        while (true) {
            // System.out.println("Enter 1 to shoot, 2 for change location and 3 for exit");
            // int move = sc.nextInt();
            // if (move == 1) {

            System.out.println(
                    "Choose your terrorist or counter terrorist(1 to 5{terrorist}, 6 to 10{counter terorist}) and 0 for exit");
            int chosen = sc.nextInt();

            switch (chosen) {

                case 1:
                    player = terrorist1;
                    break;
                case 2:
                    player = terrorist2;
                    break;
                case 3:
                    player = terrorist3;
                    break;
                case 4:
                    player = terrorist4;
                    break;
                case 5:
                    player = terrorist5;
                    break;
                case 6:
                    player = counter_t1;
                    break;
                case 7:
                    player = counter_t2;
                    break;
                case 8:
                    player = counter_t3;
                    break;
                case 9:
                    player = counter_t4;
                    break;
                case 10:
                    player = counter_t5;
                    break;
                default:
                    System.out.println("Wrong input.");
            }

            if (chosen > 0 && chosen < 11) {

                System.out.println("Enter 1 to shoot, 2 for change location");
                int move = sc.nextInt();

                if (move == 1) {
                    player.fire_bullet();
                }
                if (move == 2) {
                    player.change_location();
                }
            }
            // if (!(terrorist1.hasBullets && terrorist2.hasBullets &&
            // counter_t1.hasBullets)) {

            // System.out.println(Gun.findExhausted(terrorist1, terrorist2, counter_t1).name
            // + " exhausted all his bullets. Game Over.");
            // break;
            // }
            if (chosen == 0) {
                break;
            }
        }
    }
}
