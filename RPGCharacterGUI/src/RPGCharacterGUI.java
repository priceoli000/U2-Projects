import javax.swing.*;

public class RPGCharacterGUI {

    JFrame frame;
    JPanel panel;
    JButton strength;
    JButton speed;
    JButton iq;
    JButton willPower;
    JButton strikeSpd;
    JButton fightingTech;
    JButton attackDmg;
    JButton spellStrength;


    public RPGCharacterGUI(){
        frame = new JFrame("RPG Character");
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
    }
}

