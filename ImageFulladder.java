import javax.swing.*;

public class Imageadder {
    public static void main(String[] args) {

        JFrame frame;
        JLabel Mlabel;


        frame= new JFrame("Mars");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Mlabel = new JLabel(new ImageIcon("C:\\Users\\Prime Com\\IdeaProjectsh\\imageadder\\picture\\hailey-kean-AKuzZrpJJew-unsplash.jpg"));
        frame.add(Mlabel);
        frame.setVisible(true);

    }
}
