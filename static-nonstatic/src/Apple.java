public class Apple {
    private float weight;
    private static boolean isTaxFree = true ;
    public Apple(float weight) {
        this.weight = weight;
    }

    public float getWeight(){
        return weight;
    }

    public static boolean getTaxFree() {
        return isTaxFree;
    }
}
