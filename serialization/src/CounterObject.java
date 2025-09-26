public class CounterObject {
    public static int count = 0;
    public CounterObject() {
        count++;
    }

    public int getCount(){
        return count;
    }

}
