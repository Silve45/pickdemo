import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] check = new String[5];
        int Icheck;
        int free = 0;


        String N = "N";
        String Y = "Y";
        String R = "R";
        String O = "O";
        boolean b;


        Character c1 = new Character("Default",100,50);
        MathWords mw = new MathWords("beans", 6, 50);
        Coin c2 = new Coin();
        Dice d1 = new Dice();





        System.out.println("Welcome to the show! Enter your name");
        while (true){
           while (true){
               if (sc.hasNext()){
                   c1.setName(sc.nextLine());
                   if (c1.getName().length() > 10){
                       System.out.println("Name can't be that big ( Name < 10 )");
                   }
                   else{
                       break;
                   }// end small if
               }//end big if
           }//end small while


           /*end result*/ System.out.println("Is this your name?: (" + c1.getName() + ") Y or N");

            while (true){
            check[0] = sc.nextLine();
            if (check[0].equalsIgnoreCase(Y)){
                System.out.println("Alright then");
                break;
            }
            else if (check[0].equalsIgnoreCase(N)){
                System.out.println("Re-enter name");
                break;
            }
            else{
                System.out.println("what was that?");
//                continue; it told me that continue was unnecessary here, so I removed it
            }
                }// small while loop
            if (check[0].equalsIgnoreCase(N)){
//                continue; it told me that continue was unnecessary here, so I removed it
            }
            else {
                break;
            }
        }// big while loop



        System.out.println("What is your Age? Must be less than 22 and greater than 10");
        while (true){
            while (true){
                if (sc.hasNextInt()){
                    c1.setAge(sc.nextInt());
                    if (c1.getAge() <= 10 || c1.getAge() >= 22){
                        System.out.println("Please enter a number less than 22 and greater than 10");
                        //                continue; it told me that continue was unnecessary here, so I removed it
                    }
                    else {
                        break;
                    }
                }
                else {
                    System.out.println("Please enter a number less than 22 and greater than 10");
                    sc.next();
                    //                continue; it told me that continue was unnecessary here, so I removed it
                }

            }// end small while loop ( I fixed it! I am a genius )

            System.out.println("Is this your Age?: (" + c1.getAge() + ") Y or N");



            while (true){
                check[1] = sc.next();

                if (check[1].equalsIgnoreCase(Y)){
                    System.out.println("Alright then");
                    break;
                }
                else if (check[1].equalsIgnoreCase(N)){
                    System.out.println("Re-enter Age");
                    break;
                }
                else{
                    System.out.println("what was that?");
                    //                continue; it told me that continue was unnecessary here, so I removed it
                }
            }// small while loop
            if (check[1].equalsIgnoreCase(N)){
                //                continue; it told me that continue was unnecessary here, so I removed it
            }
            else {
                break;
            }
        }// big while loop and asking for age


        System.out.println("And Finally, what is your password?");
        while (true){
            c1.setPassword(sc.next());




            System.out.println("Is this your Password?: (" + c1.getPassword() + ") Y or N");



            while (true){
                check[1] = sc.next();

                if (check[1].equalsIgnoreCase(Y)){
                    System.out.println("Alright, this may be used later, so remember it");
                    break;
                }
                else if (check[1].equalsIgnoreCase(N)){
                    System.out.println("Re-enter Password");
                    break;
                }
                else{
                    System.out.println("what was that?");
                    //                continue; it told me that continue was unnecessary here, so I removed it
                }
            }// small while loop
            if (check[1].equalsIgnoreCase(N)){
                //                continue; it told me that continue was unnecessary here, so I removed it
            }
            else {
                break;
            }
        }// big while loop


        System.out.println("Alright Big guy ( or gal, I don't discriminate ), re-enter that password that you just made.");

        c1.Pcheck = sc.next();
        if (c1.Pcheck.equals(c1.getPassword())){
            System.out.println("Alright big guy, looks like I can let you through");
        }
        else {
            System.out.println("You could literally just read it in the console. Sorry, looks like you can't continue in this program");
            System.exit(3);
        }


        System.out.println("\n\n\n");
// only disabled until I finishing checking
        System.out.println("Roll a dice to determine your destiny ( press [R] to Roll )");
        while (true){
            check[2] = sc.next();
            if (check[2].equalsIgnoreCase(R)) {
                d1.roll();
                break;
            }
            if (check[2].equalsIgnoreCase(O)){
                System.out.println("Override Accepted");
                break;
            }
            else {
                System.out.println(" Just press [R] please");
                //                continue; it told me that continue was unnecessary here, so I removed it
            }

        }

        System.out.println("You rolled a " + d1.getNum());
        while (free != -1){
//            free = sc.nextInt(); // not working right now so I disabled it
            switch (d1.num) {
                case 1 -> {
                    b = d1.num == 1;
                    System.out.println("Initiating roll 1");
                    System.out.println(c1.getChp1());
                    free = -1;
                }
                case 2 -> {
                    b = d1.num == 2;
                    System.out.println("Initiating roll 2");
                    System.out.println(c1.getChp1());
                    free = -1;
                }
                case 3 -> {
                    b = d1.num == 3;
                    System.out.println("Initiating roll 3");
                    System.out.println(c1.getChp1());
                    free = -1;
                }
                case 4 -> {
                    b = d1.num == 4;
                    System.out.println("Initiating roll 4");
                    System.out.println(c1.getChp1());
                    free = -1;
                }
                case 5 -> {
                    b = d1.num == 5;
                    System.out.println("Initiating roll 5");
                    System.out.println(c1.getChp1());
                    free = -1;
                }
                case 6 -> {
                    b = d1.num == 6;
                    System.out.println("Initiating roll 6");
                    System.out.println(c1.getChp1());
                    free = -1;
                }
                default -> {
                    System.out.println("where the dice at?");
                    free = -1;
                }
            }// end switches
        }// end the biggest while



    }// end psvm
}// end Main.Java
