public class Main {
    public static void main(String[] args) {

        Row r1 = new Row(1, 2, 3);
        Row r2 = new Row(0, 1, 4);
        Row r3 = new Row(5, 6, 0);

        Row[] rows = { r1, r2, r3 };

        Matrix matrix = new Matrix(rows);
        matrix.Display();
        matrix.Det();
    }
}