import java.util.Arrays;

public class Matrix {

    Row r1 = new Row(1,2,3);
    Row r2 = new Row(1,2,3);
    Row r3 = new Row(1,2,3);
    Row[] rows = {r1, r2, r3};

    int Det;
    int detA;
    int detB;

    Matrix(Row[] rows){
        this.rows[0] = rows[0];
        this.rows[1] = rows[1];
        this.rows[2] = rows[2];
    }

    public void Display(){
        rows[0].Display();
        rows[1].Display();
        rows[2].Display();
    }

    public void Det() {
        detA = rows[0].cel[0] * rows[1].cel[1] * rows[2].cel[2]
                + rows[0].cel[1]*rows[1].cel[2]*rows[2].cel[0]
                + rows[0].cel[2]*rows[1].cel[0]*rows[2].cel[1];
        detB = rows[2].cel[0] * rows[1].cel[1] * rows[0].cel[2]
                + rows[2].cel[1]*rows[1].cel[2]*rows[0].cel[0]
                + rows[2].cel[2]*rows[1].cel[0]*rows[0].cel[1];
        Det = detA - detB;
        System.out.println(Det);
    }
}
