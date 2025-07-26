package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {

    JTextField textFieldName;
    JPasswordField passwordField;
    JButton b1,b2;
    Login(){

        JLabel labelName = new JLabel("Username");
        labelName.setBounds(40,20,100,30);
        add(labelName);

        textFieldName  = new JTextField();
        textFieldName.setBounds(150,20,150,30);
        add(textFieldName);

        JLabel pass = new JLabel("Password");
        pass.setBounds(40,70,100,30);
        add(pass);

         passwordField  = new JPasswordField();
        passwordField.setBounds(150,70,150,30);
        add(passwordField);

         b1 = new JButton("Login");
        b1.setBounds(40,170,100,30);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

         b2 = new JButton("Exit");
        b2.setBounds(250,170,100,30);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/second.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(360,20,200,200);
        add(img);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/a5.jpg"));
        Image i22 = i11.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0,0,600,300);
        add(image);

        setSize(600, 300);
       setLocation(500,200);
       setLayout(null);
       setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1)
        {
            String username = textFieldName.getText();
            String password = passwordField.getText();
            String query = "select * from login where username='"+username+"' and password = '"+password+"'";
            try {
                connect c = new connect();
                ResultSet resultSet = c.statement.executeQuery(query);
                if(resultSet.next()) {
                    setVisible(false);
                    new menu();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                }

            }catch(Exception E){
               E.printStackTrace();
            }
        }
        else {
            setVisible(false);
        }

    }


public static void main(String[] args)
{
    new Login();
}

}