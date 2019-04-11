import javax.swing.*;

public class RandomGuess {
    public static void main(String [] args)
    {
        JOptionPane.showMessageDialog(null,"The number is " +
            ((int) (Math.random() * 10)));


}
}
