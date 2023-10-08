import java.util.Scanner;

public class Gun {
    public String name;
    public int bullets;
     public Gun riffle;
    public Gun pistol;
    public int riffleBullets;
    public int pistolBullets;
    public Gun gun;
    public int gunBullets;
    Scanner sc = new Scanner(System.in);


    public Gun(int bullets, String name) {
        this.bullets = bullets;
        this.name = name;
    }

    public static Player findExhausted(Player a, Player b, Player c) {

        return a;
    }

    public void fire_bullet() {
        System.out.println("Enter r for riffle and p for pistol");
        char gunType = sc.next().charAt(0);
        switch (gunType) {
            case 'r':
                // this.riffleBullets = this.riffleBullets - 1;
                // if (this.riffleBullets < 0) {
                // System.out.println("ERROR: no more bullets in " + this.riffle.name);
                // } else {
                // System.out
                // .println(this.name + " has fired " + this.riffle.name + " and total bullets
                // remaining are: "
                // + this.riffleBullets);
                // }
                this.gun = this.riffle;
                this.gunBullets = this.riffleBullets;
                break;
            case 'p':
                // this.pistolBullets = this.pistolBullets - 1;
                // if (this.pistolBullets < 0) {
                // System.out.println("ERROR: no more bullets in " + this.pistol.name);
                // } else {
                // System.out
                // .println(this.name + " has fired " + this.pistol.name + " and total bullets
                // remaining are: "
                // + this.pistolBullets);
                // }
                gun = pistol;
                gunBullets = this.pistolBullets;
                break;

            // if (this.bullets1 == 0) {
            // this.hasBullets = false;
            // }
            default:
                System.out.println("Wrong input");
        }
        if (gunType == 'r' | gunType == 'p') {

            this.gunBullets = this.gunBullets - 1;

            if (this.gunBullets < 0) {
                System.out.println("ERROR: no more bullets in " + this.gun.name);
            } else {
                System.out
                        .println(this.name + " has fired " + this.gun.name + " and total bullets remaining are: "
                                + this.gunBullets);
            }
            if (gunType == 'r') {
                this.riffleBullets = this.gunBullets;
            }
            if (gunType == 'p') {
                this.pistolBullets = this.gunBullets;
            }
        }
    }
    // public int fire_bullet() {
    //     this.bullets = this.bullets - 1;

    //     return this.bullets;
    // }
}
