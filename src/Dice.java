public class Dice {
     int num;

     public Dice (){
         this.num = num;
     }
     int roll() {
        num = (int)(Math.random() * 7 - 1) + 1;
         return 0;
     }

    public int getNum() {
        return num;
    }

}
