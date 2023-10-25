import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //container: JFrame, JPanel
        //component: JButton, JLabel, JCheckBox 

        JFrame jFrame = new JFrame("Game Tic_Tac_Toe");
        jFrame.setSize(600, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);
        jFrame.setLocation(0, 0);
        jFrame.setVisible(true);
        
    }
}