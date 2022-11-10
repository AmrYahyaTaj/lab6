/**
 * Created by learn on 10/11/22.
 */
import javax.swing.*;
import java.awt.*;

public class Qu9  extends JFrame{

    public Qu9() {
        setSize(630, 630);
        setTitle("Checker board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



    public void paint(Graphics g) {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if ((i + j) % 2 == 0) {
                    g.setColor(Color.BLACK);

                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(i * 75, j * 75, 75, 75);
            }
        }
    }

    public static void main(String[] args) {
        new Qu9();
    }
}
