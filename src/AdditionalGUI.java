import javax.swing.*;

public class AdditionalGUI extends JOptionPane {
    public static void main(String[] args) {
        String fNumber ,sNumber;
        int firstNum , secondNum , sum;

        fNumber = JOptionPane.showInputDialog("Enter First Number:");
        sNumber = JOptionPane.showInputDialog("Enter Second Number: ");

        firstNum = Integer.parseInt(fNumber);
        secondNum = Integer.parseInt(sNumber);

        sum = firstNum+secondNum;

        JOptionPane.showMessageDialog(null,"The sum of the integers is: " + sum, "Sum of integers",JOptionPane.PLAIN_MESSAGE);



    }

}
