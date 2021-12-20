import java.util.ArrayList;

public class Character {
    private String name;
    private int age;
    private double weight;
    private String password;
    String Pcheck;

    Dice d1 = new Dice(1);

    public Character(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChp1() {
        return chp1.get();
    }

    public String getChp2() {
        return chp2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String chp2 = "You live in a small town in california "
            +"\nYour name is " + getName()
            +"\nYou are " + getAge() + " years old."
            +"\nyou have a dice and a coin that your uncle gave you."
            +"\nThese two items, will be the key to your adventure."
            +"\nIf at any point you wish to leave, press -1";

    public ArrayList<String> a1 = new ArrayList<String>();


    private final ThreadLocal<String> chp1 = ThreadLocal.withInitial(() -> "You live in a small town in california "
            +"\nYour name is " + getName()
            +"\nYou are " + getAge() + " years old."
            +"\nyou have a dice and a coin that your uncle gave you."
            +"\nThese two items, will be the key to your adventure."
            +"\nIf at any point you wish to leave, press -1"
            +"\n Press Y to continue"


    );

//    public final ThreadLocal<Integer> u = ThreadLocal.withInitial(()->
//
//            );


    public int h (){
//        d1.roll();
       int i = d1.getNum();
        switch (i){
            case 1:
                System.out.println(getChp1());
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 4:
                System.out.println("case 4");
                break;
            case 5:
                System.out.println("case 5");
            case 6:
                System.out.println("case 6");
                break;
            default:
                System.out.println("No dice input registered");
                break;



        }
        return i;
    }


    // I will have to add that later


    //alright a note for later
    // what I want for this is a way to switch threadlocal scenes and to make a easy way to get from story blob to story blob
    // I want to make a arraylist called "Index" that can switch scenes fluidly and be called on easily
    // however, it seems threadlocal and Arraylist don't mesh toghether
}// end Public Character

