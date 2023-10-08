import java.util.Scanner;

public class Player {
    public String name;
    public Gun riffle;
    public Gun pistol;
    public int riffleBullets;
    public int pistolBullets;
    // public boolean hasBullets = true;
    public Location location;
    public Gun gun;
    public int gunBullets;
    Scanner sc = new Scanner(System.in);

    public Player(Gun riffle, Gun pistol, String name, int x, int y) {
        this.riffle =new Riffle(y, name);
        this.pistol = pistol;
        this.name = name;
        this.riffleBullets = this.riffle.bullets;
        this.pistolBullets = this.pistol.bullets;
        this.location = new Location(x, y);
    }

    // public void fire_bullet() {
    //     System.out.println("Enter r for riffle and p for pistol");
    //     char gunType = sc.next().charAt(0);
    //     switch (gunType) {
    //         case 'r':
    //             // this.riffleBullets = this.riffleBullets - 1;
    //             // if (this.riffleBullets < 0) {
    //             // System.out.println("ERROR: no more bullets in " + this.riffle.name);
    //             // } else {
    //             // System.out
    //             // .println(this.name + " has fired " + this.riffle.name + " and total bullets
    //             // remaining are: "
    //             // + this.riffleBullets);
    //             // }
    //             this.gun = this.riffle;
    //             this.gunBullets = this.riffleBullets;
    //             break;
    //         case 'p':
    //             // this.pistolBullets = this.pistolBullets - 1;
    //             // if (this.pistolBullets < 0) {
    //             // System.out.println("ERROR: no more bullets in " + this.pistol.name);
    //             // } else {
    //             // System.out
    //             // .println(this.name + " has fired " + this.pistol.name + " and total bullets
    //             // remaining are: "
    //             // + this.pistolBullets);
    //             // }
    //             gun = pistol;
    //             gunBullets = this.pistolBullets;
    //             break;

    //         // if (this.bullets1 == 0) {
    //         // this.hasBullets = false;
    //         // }
    //         default:
    //             System.out.println("Wrong input");
    //     }
    //     if (gunType == 'r' | gunType == 'p') {

    //         this.gunBullets = this.gunBullets - 1;

    //         if (this.gunBullets < 0) {
    //             System.out.println("ERROR: no more bullets in " + this.gun.name);
    //         } else {
    //             System.out
    //                     .println(this.name + " has fired " + this.gun.name + " and total bullets remaining are: "
    //                             + this.gunBullets);
    //         }
    //         if (gunType == 'r') {
    //             this.riffleBullets = this.gunBullets;
    //         }
    //         if (gunType == 'p') {
    //             this.pistolBullets = this.gunBullets;
    //         }
    //     }
    // }
    // public static Player findExhausted(Player a, Player b, Player c) {

    // return a;
    // }

    public void change_location() {
        System.out.println("Enter 4 for left, 2 for down, 8 for top and 6 for right");
        int loc = sc.nextInt();
        ;

        switch (loc) {
            case 4:
                this.location.x_axis--;
                break;
            case 8:
                this.location.y_axis++;
                break;
            case 6:
                this.location.x_axis++;
                break;
            case 2:
                this.location.y_axis--;
                break;
            default:
                System.out.println("wrong input");

        }
        if (this.location.x_axis < 0) {
            System.out.println("Cannot go further");
            this.location.x_axis = 0;
        }
        if (this.location.y_axis < 0) {
            System.out.println("Cannot go further");
            this.location.y_axis = 0;
        }
        System.out.println(
                "the location of  " + this.name + " is: (" + this.location.x_axis + "," + this.location.y_axis + ")");

    }
}
