import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Main {

    public static int[] array = new int[9];
    public int finish = 0;
    public Main() {
    }
    public static void main(String[] args) {

        Check  check= new Check();

        JFrame farme = new JFrame("tic-tac-toe");
        JButton[] button = new JButton[9];

        //
        farme.setSize(500,500);
        farme.setLocationRelativeTo(null);
        farme.getContentPane().setBackground(Color.RED);
        farme.getContentPane().setLayout(new GridLayout(3 ,3,15,15));
        farme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //
        for (int i = 0; i < 9; i++) {

            button[i] = new JButton();
            button[i].setSize(30,30);
            button[i].setBackground(Color.white);
            farme.getContentPane().add(button[i]);

        }

         for(int i = 0 ;i < 9 ;i++){
             int finalI = i;

             button[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    if (check.setPosition(finalI)){
                        String text = String.valueOf(check.getPiece());
                        button[finalI].setFont(new Font(text, 180, 180));
                        button[finalI].setText(text);
                        if(check.test()){
                           System.exit(0);
                        }
                    }

                }
            });
        }
        farme.setVisible(true);
    }



}
