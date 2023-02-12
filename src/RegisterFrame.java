import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterFrame extends JFrame implements ActionListener {
    private JLabel labelMessage;
    private JTextField fName,sName;
    private JButton btnRegister;
    public RegisterFrame(){

        //Set the layout manager i.e Grid\Vertical Flow\Border
        setLayout(new FlowLayout());
        // First thing you want to show
        labelMessage = new JLabel("Welcome");
        add(labelMessage);
        fName = new JTextField("First Name",15);
        add(fName);
        sName= new JTextField("Second Name",15);
        add(sName);
        btnRegister = new JButton("Register");
        add(btnRegister);
        btnRegister.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==btnRegister){
                String firstName= fName.getText();
                labelMessage.setText("Welcome "+firstName);
                JOptionPane.showMessageDialog(null,"Registration Successful","Success",JOptionPane.PLAIN_MESSAGE);
            }
    }

    public static void main(String[] args) {
        RegisterFrame registeruser = new RegisterFrame();
        registeruser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registeruser.setSize(200,300);
        registeruser.setVisible(true);

    }




}
