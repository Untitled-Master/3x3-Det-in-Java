import java.util.Arrays;

public class Row {
    int[] cel = {0, 0, 0};

    Row(int a, int b, int c){
        this.cel[0] = a;
        this.cel[1] = b;
        this.cel[2] = c;
    }

    public void Display(){
        System.out.println(Arrays.toString(cel));
    }
}
