/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee_mix;

/**
 *
 * @author Riyad
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.io.*;



public class CreateUser extends JFrame implements ActionListener {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    public CreateUser() {
        setTitle("Create User");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JLabel lblUsername = new JLabel("Username");
        txtUsername = new JTextField(20);
        JLabel lblPassword = new JLabel("Password");
        txtPassword = new JPasswordField(20);
        JButton btnCreate = new JButton("Create");
        btnCreate.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.WEST;
        c.insets = new Insets(10, 10, 0, 10);
        contentPane.add(lblUsername, c);
        c.gridx = 1;
        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        contentPane.add(txtUsername, c);
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.0;
        contentPane.add(lblPassword, c);
        c.gridx = 1;
        c.weightx = 1.0;
        contentPane.add(txtPassword, c);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        c.weightx = 0.0;
        c.fill = GridBagConstraints.NONE;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(20, 10, 10, 10);
        contentPane.add(btnCreate, c);

        Font labelFont = new Font("Arial", Font.BOLD, 14);
        lblUsername.setFont(labelFont);
        lblPassword.setFont(labelFont);
        Border textFieldBorder = new CompoundBorder(new LineBorder(Color.GRAY), new EmptyBorder(5, 5, 5, 5));
        txtUsername.setBorder(textFieldBorder);
        txtPassword.setBorder(textFieldBorder);
        btnCreate.setBackground(Color.decode("#0077b6"));
        btnCreate.setForeground(Color.WHITE);
        btnCreate.setFocusPainted(false);
        btnCreate.setBorder(new EmptyBorder(10, 30, 10, 30));

        contentPane.setBackground(Color.WHITE);
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold> 

    public void actionPerformed(ActionEvent e) {
    String username = txtUsername.getText();
    String password = String.valueOf(txtPassword.getPassword());

    //saving
    if (isUsernameAvailable(username)) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("users_account.txt", true));
            writer.write(username + ":" + password + "\n");
            writer.close();
            JOptionPane.showMessageDialog(null, "User created successfully!");
            dispose();// next screen jaoar jonno----
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error creating user!");
        }
    } else {
        if (username.equals("admin") && "admin123".equals(password)) {
            JOptionPane.showMessageDialog(null, "Logged in as admin");
            //have to do dill with it later mamma.
        } else {
            JOptionPane.showMessageDialog(null, "Username already exists. Please choose another one.");
            }
        }
    }

     //Checkingggg username
    private boolean isUsernameAvailable(String username) {
    try {
        BufferedReader reader = new BufferedReader(new FileReader("users_account.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith(username + ":")) {
                reader.close();
                return false;
            }
        }
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    // add the default admin username and password
    if (username.equals("admin") && "admin123".equals(new String(txtPassword.getPassword()))) {
        return true;
    }
    
    return true;
}

    public static void main(String[] args) {
        CreateUser frame = new CreateUser();
        frame.setVisible(true);
    }
}
