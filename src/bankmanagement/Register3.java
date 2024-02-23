package bankmanagement;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class Register3 extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
    JRadioButton r1, r2, r3, r4;
    JButton b1, b2;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    String formNo;

    Register3(String formNo) {
        this.formNo = formNo;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));

        l2 = new JLabel("Account Type:");
        l2.setFont(new Font("Raleway", Font.BOLD, 18));

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);

        l3 = new JLabel("Card Number:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));

        l4 = new JLabel("XXXX-XXXX-XXXX-4184");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));

        l5 = new JLabel("(Your 16-digit Card number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));

        l6 = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        l6.setFont(new Font("Raleway", Font.BOLD, 12));

        l7 = new JLabel("PIN:");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));

        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));

        l9 = new JLabel("(4-digit password)");
        l9.setFont(new Font("Raleway", Font.BOLD, 12));

        l10 = new JLabel("Services Required:");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));

        l11 = new JLabel("Form No:" + formNo);
        l11.setFont(new Font("Raleway", Font.BOLD, 14));

        // l12 = new JLabel(formNo);
        // l12.setFont(new Font("Raleway", Font.BOLD, 14));

        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of my knowledge.",
                true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));

        setLayout(new BorderLayout());

        // Panel for Account Type
        JPanel accountTypePanel = new JPanel(new GridLayout(4, 1));
        accountTypePanel.add(l2);
        accountTypePanel.add(new JLabel());
        accountTypePanel.add(r1);
        accountTypePanel.add(r2);
        accountTypePanel.add(r3);
        accountTypePanel.add(r4);

        // Panel for Card Details
        JPanel cardDetailsPanel = new JPanel(new GridLayout(6, 1));
        cardDetailsPanel.add(l3);
        cardDetailsPanel.add(l4);
        cardDetailsPanel.add(l5);
        cardDetailsPanel.add(l6);
        cardDetailsPanel.add(l7);
        cardDetailsPanel.add(l8);
        cardDetailsPanel.add(l9);
        cardDetailsPanel.setBackground(Color.WHITE);

        // Panel for Services
        JPanel servicesPanel = new JPanel(new GridLayout(6, 2));
        servicesPanel.add(l10);
        servicesPanel.add(new JLabel()); // Empty label for alignment
        servicesPanel.add(c1);
        servicesPanel.add(c2);
        servicesPanel.add(c3);
        servicesPanel.add(c4);
        servicesPanel.add(c5);
        servicesPanel.add(c6);
        servicesPanel.setBackground(Color.WHITE);

        // Panel for Declaration
        JPanel declarationPanel = new JPanel(new GridLayout(1, 1));
        declarationPanel.add(c7);

        // Panel for Form No
        JPanel formNoPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        formNoPanel.add(l11);
        // formNoPanel.add(l12);

        // Panel for Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(b1);
        buttonPanel.add(b2);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 35, 10, 35));
        mainPanel.add(l1);
        mainPanel.add(formNoPanel);

        mainPanel.add(accountTypePanel);
        mainPanel.add(cardDetailsPanel);
        mainPanel.add(servicesPanel);
        mainPanel.add(declarationPanel);
        mainPanel.add(buttonPanel);

        // Adding main panel to the JFrame
        add(mainPanel, BorderLayout.CENTER);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 750);
        setLocation(300, 10);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(Color.WHITE);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    // public void actionPerformed(ActionEvent ae) {

    // }
    public void actionPerformed(ActionEvent ae) {
        String atype = null;
        if (r1.isSelected()) {
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String facility = "";
        if (c1.isSelected()) {
            facility = facility + " ATM Card";
        }
        if (c2.isSelected()) {
            facility = facility + " Internet Banking";
        }
        if (c3.isSelected()) {
            facility = facility + " Mobile Banking";
        }
        if (c4.isSelected()) {
            facility = facility + " EMAIL Alerts";
        }
        if (c5.isSelected()) {
            facility = facility + " Cheque Book";
        }
        if (c6.isSelected()) {
            facility = facility + " E-Statement";
        }

        try {
            if (ae.getSource() == b1) {

                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else {
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('" + formNo + "','" + atype + "','" + cardno + "','" + pin
                            + "','" + facility + "')";
                    String q2 = "insert into login values('" + formNo + "','" + cardno + "','" + pin + "')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:" + pin);

                    // new Deposit(pin).setVisible(true);
                    setVisible(false);
                }

            } else if (ae.getSource() == b2) {
                System.exit(0);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Register3("").setVisible(true);
    }
}
