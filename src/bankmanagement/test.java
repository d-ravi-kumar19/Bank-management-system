package bankmanagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class test extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15,l16;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b;
    JRadioButton r1, r2, r3, r4, r5;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    test() {
        setTitle("Register");

        l1 = new JLabel("APPLICATION FORM NO. " + first);
        l1.setFont(new Font("Raleway", Font.BOLD, 30));

        l2 = new JLabel("Page 1: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));

        l3 = new JLabel("Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));

        l4 = new JLabel("Father's Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));

        l5 = new JLabel("Date of Birth:");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));

        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));

        l7 = new JLabel("Email Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));

        l8 = new JLabel("Marital Status:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));

        l9 = new JLabel("Address:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));

        l10 = new JLabel("City:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));

        l11 = new JLabel("Pin Code:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));

        l12 = new JLabel("State:");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));

        l13 = new JLabel("Date");
        l13.setFont(new Font("Raleway", Font.BOLD, 14));

        l14 = new JLabel("Month");
        l14.setFont(new Font("Raleway", Font.BOLD, 14));

        l15 = new JLabel("Year");
        l15.setFont(new Font("Raleway", Font.BOLD, 14));

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));

        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));

        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));

        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));

        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.WHITE);

        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 35, 10, 35)); // 10-pixel padding on all sides

        JPanel topPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        // JPanel topPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        topPanel1.add(l1);
        // topPanel2.add(l2);

        JPanel contentPanel = new JPanel(new GridLayout(13, 2, 10, 10));
        contentPanel.add(l3);
        contentPanel.add(t1);

        contentPanel.add(l4);
        contentPanel.add(t2);

        contentPanel.add(l5);
        contentPanel.add(t3);

        contentPanel.add(l6);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(r1);
        genderPanel.add(r2);
        contentPanel.add(genderPanel);

        contentPanel.add(l7);
        contentPanel.add(t4);

        contentPanel.add(l8);
        JPanel maritalPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maritalPanel.add(r3);
        maritalPanel.add(r4);
        maritalPanel.add(r5);
        contentPanel.add(maritalPanel);

        contentPanel.add(l9);
        contentPanel.add(t5);

        contentPanel.add(l10);
        contentPanel.add(t6);

        contentPanel.add(l11);
        contentPanel.add(t7);

        contentPanel.add(l12);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(b);

        mainPanel.add(topPanel1, BorderLayout.CENTER);
        // mainPanel.add(topPanel2, BorderLayout.CENTER);

        mainPanel.add(contentPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        getContentPane().setBackground(Color.WHITE);
        add(mainPanel); // Add the main panel with padding

        setSize(800, 700);
        setLocation(300, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String formNo = first;
        String name = t1.getText();
        String fname = t2.getText();
        String dob = "";
        String gender = null;
        if (r1.isSelected())   gender = "Male";
        else if (r2.isSelected())  gender= "Female";

        String email = t3.getText();
        String marital = null;
        if(r3.isSelected())    marital = "Married";
        else if(r4.isSelected())   marital = "Unmarried";
        else if(r5.isSelected())    marital = "Other";

        String address = t4.getText();
        String city = t5.getText();
        String pincode = t6.getText();
        String state = t7.getText();

        try{
           
            if(t6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+formNo+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c1.s.executeUpdate(q1);
                
                new Register2(first).setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception e){
             e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new test().setVisible(true);
    }
}
