public class Orange {
    private float weight;
    private static boolean isTaxFree = false;
    public Orange(float weight) {
        this.weight = weight;
    }

    public float getWeight(){
        return weight;
    }

    public static boolean getTaxFree() {
        return isTaxFree;
    }
}
