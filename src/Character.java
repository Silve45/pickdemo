public class Character {
    private String name;
    private int age;
    private double weight;
    private String password;
    String Pcheck;


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



    public final ThreadLocal<String> chp1 = ThreadLocal.withInitial(() -> "You live in a small town in california "
            +"\nYour name is " + getName()
            +"\nYou are " + getAge() + " years old."
            +"\nyou have a dice and a coin that your uncle gave you."
            +"\nThese two items, will be the key to your adventure."
            +"\nIf at any point you wish to leave, press -1"
            +"\n Press Y to continue"






    ); // I will have to add that later



}// end Public Character

