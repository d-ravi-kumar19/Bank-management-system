package bankmanagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Register2 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
    JTextField t1, t2, t3, t4;
    JButton b;
    JRadioButton r1, r2, r3, r4, r5;
    JComboBox<String> c1, c2, c3, c4, c5;
    String formNo;

    Register2(String formNo) {
        setTitle("Register page-2");
        this.formNo = formNo;

        l1 = new JLabel("Page 2: Additional Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));

        l2 = new JLabel("Religion:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));

        l3 = new JLabel("Category:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));

        l4 = new JLabel("Income:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));

        l5 = new JLabel("Educational Qualification:");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));

        l11 = new JLabel("Qualification:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));

        l6 = new JLabel("Occupation:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));

        l7 = new JLabel("PAN Number:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));

        l8 = new JLabel("Aadhar Number:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));

        l9 = new JLabel("Senior Citizen:");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));

        l10 = new JLabel("Existing Account:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));

        l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway", Font.BOLD, 13));

        l13 = new JLabel(formNo);
        l13.setFont(new Font("Raleway", Font.BOLD, 13));

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));

        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);

        String religion[] = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
        c1 = new JComboBox<>(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));

        String category[] = { "General", "OBC", "SC", "ST", "Other" };
        c2 = new JComboBox<>(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));

        String income[] = { "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000" };
        c3 = new JComboBox<>(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));

        String education[] = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others" };
        c4 = new JComboBox<>(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));

        String occupation[] = { "Salaried", "Self-Employed", "Business", "Student", "Retired", "Others" };
        c5 = new JComboBox<>(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));

        // Set layout managers and add padding
        setLayout(new BorderLayout());

        JPanel contentPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 35, 10));
        contentPanel1.add(l1);
        contentPanel1.add(new JLabel("  ")); // Empty label for padding
        contentPanel1.add(l12);
        contentPanel1.add(l13);

        JPanel contentPanel2 = new JPanel(new GridLayout(11, 2, 10, 10));
        contentPanel2.add(l2);
        contentPanel2.add(c1);
        contentPanel2.add(l3);
        contentPanel2.add(c2);
        contentPanel2.add(l4);
        contentPanel2.add(c3);
        contentPanel2.add(l5);
        contentPanel2.add(c4);
        contentPanel2.add(l11);
        contentPanel2.add(new JLabel()); // Empty label for padding
        contentPanel2.add(l6);
        contentPanel2.add(c5);
        contentPanel2.add(l7);
        contentPanel2.add(t1);
        contentPanel2.add(l8);
        contentPanel2.add(t2);
        contentPanel2.add(l9);
        JPanel seniorCitizenPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        seniorCitizenPanel.add(r1);
        seniorCitizenPanel.add(r2);
        contentPanel2.add(seniorCitizenPanel);
        contentPanel2.add(l10);
        JPanel existingAccountPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        existingAccountPanel.add(r3);
        existingAccountPanel.add(r4);
        contentPanel2.add(existingAccountPanel);

        JPanel contentPanel3 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 35, 10));
        contentPanel3.add(b);

        // Add content panels to main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(contentPanel1, BorderLayout.NORTH);
        mainPanel.add(contentPanel2, BorderLayout.CENTER);
        mainPanel.add(contentPanel3, BorderLayout.SOUTH);

        getContentPane().setBackground(Color.WHITE);
        add(mainPanel);

        setSize(800, 700);
        setLocation(300, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        String religion = (String) c1.getSelectedItem();
        String category = (String) c2.getSelectedItem();
        String income = (String) c3.getSelectedItem();
        String education = (String) c4.getSelectedItem();
        String occupation = (String) c5.getSelectedItem();

        String pan = t1.getText();
        String aadhar = t2.getText();

        String scitizen = "";
        if (r1.isSelected()) {
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";
        }

        String eaccount = "";
        if (r3.isSelected()) {
            eaccount = "Yes";
        } else if (r4.isSelected()) {
            eaccount = "No";
        }

        try {
            if (t2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            } else {
                Conn c1 = new Conn();
                String q1 = "insert into signup2 values('" + formNo + "','" + religion + "','" + category + "','"
                        + income + "','" + education + "','" + occupation + "','" + pan + "','" + aadhar + "','"
                        + scitizen + "','" + eaccount + "')";
                c1.s.executeUpdate(q1);

                new Register3(formNo).setVisible(true);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Register2("").setVisible(true);
    }
}
