
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Apple[] apples = new Apple[2];
        Orange[] oranges = new Orange[2];

        apples[1].getTax();

        apples[0] = new Apple(0.2F);
        apples[1] = new Apple(0.2F);

        oranges[0] = new Orange(0.1F);
        oranges[1] = new Orange(0.15F);

    }
}

