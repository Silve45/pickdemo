import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dice d2 = new Dice();
        String i;



        //added for testing, can delete later
        Character c1 = new Character("m",1,1);

        // I made this, because I needed to test myself. The test is over
       c1.h();



        ArrayList<String> num = new ArrayList<>();

        num.add(c1.getChp1());

        System.out.println(num.get(0));


        boolean b;
        while (true){
            System.out.println("Roll?");
            i = sc.nextLine();
            if (i.equalsIgnoreCase("Y")){
                d2.roll();
                System.out.println(d2.getNum());
                continue;}
            else if ( i.equalsIgnoreCase("N")){
                System.out.println("see ya!");
                break;
            }
            else{
                System.out.println("Use Y or N");
                continue;
            }
        }

        // I switched it to an enhanced switch statement, because it offered it. I don't really know the difference...
        // I can probably just infer it
        switch (d2.num) {
            case 1 -> {
                b = d2.num == 1;
                System.out.println("You live a happy life");
            }
            case 2 -> {
                b = d2.num == 2;
                System.out.println("you live a sad life");
            }
            case 3 -> {
                b = d2.num == 3;
                System.out.println("you live a bold life");
            }
            case 4 -> {
                b = d2.num == 4;
                System.out.println("you live a determined life");
            }
            case 5 -> {
                b = d2.num == 5;
                System.out.println("you live a based and AmongUs pilled life");
            }
            case 6 -> {
                b = d2.num == 6;
                System.out.println("you just die in a car accident");
            }
            default -> System.out.println("where the dice at?");
        }
    }
}
