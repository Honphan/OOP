public class Dice {
    int number ;

    public int Roll(){
        number = (int)(Math.random()*6)+1;
        return number ;
    }
}
