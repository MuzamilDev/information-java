import javax.swing.*;

public class MLabel {
    public static void main(String[] args) {

        JFrame frameOne;
        JLabel labelOne;

        frameOne = new JFrame("MARS PHOTO OF WEEK");
        frameOne.setSize(600,700);
        frameOne.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        labelOne = new JLabel(new ImageIcon("C:\\Users\\Prime Com\\IdeaProjectsh\\imageadder\\picture\\NLF_0714_0730336979_160ECM_N0334752NCAM13714_04_195J01_1200.jpg"));


        frameOne.add(labelOne);
        frameOne.setVisible(true);

    }
}
