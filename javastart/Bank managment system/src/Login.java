import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame  implements ActionListener {
        JButton login, clear, signup;
        JTextField cardtext;
        JPasswordField pintext;

    Login() {
        setLayout(null);

        // Load image
        ImageIcon il = new ImageIcon(
                ClassLoader.getSystemResource("ICON/logo.jpg")
        );

        // Resize image
        Image i2 = il.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        // Image label
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);

        // Text label
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Arial", Font.BOLD, 22));
        text.setBounds(200, 40, 300, 40);
        add(text);
 // Card No label
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 22));
        cardno.setBounds(120, 150, 150, 30);
        add(cardno);
        JTextField cardtext = new JTextField();
        cardtext.setFont(new Font("Arial", Font.BOLD, 14));
        cardtext.setBounds(300, 150, 230, 30);
        add(cardtext);


        //pin label
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(120, 220, 150, 30);
        add(pin);
        JPasswordField pintext = new JPasswordField();
        pintext.setFont(new Font("Arial", Font.BOLD, 14));
        pintext.setBounds(300, 220, 230, 30);
        add(pintext);

        // login button
        JButton login = new JButton("LOGIN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        // clear button
        JButton clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
 

        // signup button
        JButton signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this); 
        add(signup);




        getContentPane().setBackground(Color.WHITE);

        setTitle("ATM");
        setSize(800, 480);
        setLocation(350, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        // Handle button actions here

        if (ae.getSource() == login) {
            // Handle login action
        } else if (ae.getSource() == clear) {
            // Handle clear action]
            cardtext.setText("");
            pintext.setText("");
            cardtext.requestFocus();
            

        } else if (ae.getSource() == signup) {
            // Handle signup action
        }   

    }
    public static void main(String[] args) {
        new Login();
    }
}
