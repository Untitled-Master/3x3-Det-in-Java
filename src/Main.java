import org.w3c.dom.Text;

import java.awt.*;
import java.io.*;
import java.util.Arrays;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Row r1 = new Row(1, 2, 3);
        Row r2 = new Row(0, 1, 4);
        Row r3 = new Row(5, 6, 0);

        Row[] rows = { r1, r2, r3 };

        Matrix matrix = new Matrix(rows);
        matrix.Display();
        matrix.Det();

        // Creating instance of JFrame
        JFrame frame = new JFrame();

        TextArea textArea = new TextArea(matrix.sRow);
        textArea.setBounds(150, 300, 220, 100);
        frame.add(textArea);

        // 400 width and 500 height
        frame.setSize(500, 600);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);
    }
}