import javax.swing.*;
import java.awt.*;
//JFrame class needs to be inherited to create the app
public class Login extends JFrame {
    //All the initiations we are writing in constructor. We get frame as soon as object is created
    Login(){
        //setting title of the frame
        setTitle("Banking System");
        //size of the frame
        setSize(800,400);
        //so that frame is displayed
        setVisible(true);
        //if this not given, the frame opens at left corner. Below values make it open at center
        setLocation(350,200);
        //change frame background to white
        getContentPane().setBackground(Color.WHITE);

        //BANK ICON Code start
        /*Below ImageIcon object created to add an image to frame.
        ClassLoader.getSystemResource() is required to fetch bank Icon*/
        ImageIcon bankIcon= new ImageIcon(ClassLoader.getSystemResource("images/bankIcon.jpg"));
        //need to reduce the size of image. Image class is from awt and not in JFrame
        Image imgBank = bankIcon.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        //JLabel wont accept Image so we change it back to ImageIcon.
        ImageIcon adjustedIcon= new ImageIcon(imgBank);
        /*we cannot add icon directly to frame. So we store icon in JLabel first.
        JLabel is actually used to write txt on frame*/
        JLabel iconLabel= new JLabel(adjustedIcon);
        //The code below below code wont work unless we keep default layout as null
        setLayout(null);
        /* By default icons comes in center so we change it to top-left.
        Last 2 parameters are for size of label, so same as above*/
        iconLabel.setBounds(150,10,100,100);
        //add icon to frame.
        add(iconLabel);
        //BANK ICON Code end

        //WELCOME heading start
        //JLabel is used write text to frame
        JLabel heading=new JLabel("Welcome to Chase");
        //placement of text and label size
        heading.setBounds(270,40,400,40);
        //setting the font and text size
        heading.setFont(new Font("Times New Roman", Font.BOLD, 38));
        add(heading);
        //WELCOME heading end

        //Account Number label
        JLabel acntNo=new JLabel("Account Number");
        acntNo.setBounds(150,150,250,30);
        acntNo.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(acntNo);
        //Account Number label end

        //Password label
        JLabel passwd=new JLabel("Password");
        passwd.setBounds(225,210,100,30);
        passwd.setFont(new Font("Times New Roman", Font.BOLD, 25));
        add(passwd);
        //Password label end

        //Account number textField
        //JTextField is to create text field
        JTextField acntField = new JTextField();
        acntField.setBounds(370,150,250,30);
        acntField.setFont(new Font("Times New Roman",Font.PLAIN,18));
        add(acntField);
        //Account number textField end

        //Password textField
        JTextField pwdField = new JTextField();
        pwdField.setBounds(370,210,250,30);
        pwdField.setFont(new Font("Times New Roman",Font.PLAIN,18));
        add(pwdField);
        //Password textField end

        //Login button
        JButton inBtn=new JButton("Login");
        inBtn.setBounds(370,270,100,30);
        inBtn.setFont(new Font("Raleway",Font.PLAIN,15));
        add(inBtn);
        //Login button end

        //SignUp button
        JButton signBtn=new JButton("Sign Up");
        signBtn.setBounds(500,270,100,30);
        signBtn.setFont(new Font("Raleway",Font.PLAIN,15));
        add(signBtn);
        //SignUp button end


    }
    public static void main(String[] args) {
        new Login();
    }
}
