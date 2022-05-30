/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author Acer
 */
public class Information extends JFrame implements ActionListener{
    JButton btnBack;
    String UserID;
    
    // https://www.youtube.com/watch?v=Kmgo00avvEw&t=1285s
    public Information(String id) {
    setSize(655, 506);
    setTitle("Library Information");
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    
    //background panel
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout(30,20));
    panel.setBackground(new Color(204,204,255));
    
    //panel for title
    JPanel p1 = new JPanel();
    p1.setLayout(new BorderLayout(20,0));
    p1.setBackground(new Color(204,204,255));
    
    JLabel lblTitle = new JLabel("Library Info");
    lblTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
    lblTitle.setHorizontalAlignment(JLabel.CENTER);
    
    JPanel pa = new JPanel();
    pa.setBackground(new Color(204,204,255));
    JPanel pb = new JPanel();
    pb.setBackground(new Color(204,204,255));
    
    p1.add(pa, "North");
    p1.add(pb, "South");
    p1.add(lblTitle, "Center");
    panel.add(p1, "North");
    
    // panel for content
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(3,0,0,30));
    p2.setBackground(new Color(204,204,255));
    
    // panel for content A - borrow
    JPanel pA = new JPanel();
    pA.setLayout(new GridLayout(2,1,1,1));
    pA.setBackground(new Color(204,204,255));
    
    //https://docs.oracle.com/javase/tutorial/uiswing/components/border.html
    
    Border line = BorderFactory.createLineBorder(Color.gray);
    TitledBorder title = BorderFactory.createTitledBorder(line, "About Borrow");
    title.setTitleFont(new Font("Tahoma", Font.BOLD, 16));
    title.setTitleColor(Color.BLUE);
    pA.setBorder(title);
    
    JLabel lbl2 = new JLabel("     Maximum Number of Books Borrowed: 3 Books");
    lbl2.setFont(new Font("Times New Roman", Font.BOLD, 15));
    JLabel lbl3 = new JLabel("     Borrow Period: 14 days (2 weeks)");
    lbl3.setFont(new Font("Times New Roman", Font.BOLD, 15));
    
    pA.add(lbl2);
    pA.add(lbl3);
    p2.add(pA);
    
    //panel for content B - renew
    JPanel pB = new JPanel();
    pB.setLayout(new GridLayout(2,1,1,1));
    pB.setBackground(new Color(204,204,255));
    
    TitledBorder title2 = BorderFactory.createTitledBorder(line, "About Renew");
    title2.setTitleFont(new Font("Tahoma", Font.BOLD, 16));
    title2.setTitleColor(Color.BLUE);
    pB.setBorder(title2);
    
    JLabel lbl8 = new JLabel("     Maximum Renew Times: 3 times");
    lbl8.setFont(new Font("Times New Roman", Font.BOLD, 15));
    JLabel lbl9 = new JLabel("     Book Renewal should be done BEFORE due date.");
    lbl9.setFont(new Font("Bodoni MT", Font.BOLD + Font.ITALIC, 15));
    
    pB.add(lbl8);
    pB.add(lbl9);
    p2.add(pB);
    
    //panel for content C - fine
    JPanel pC = new JPanel();
    pC.setLayout(new GridLayout(2,1,1,1));
    pC.setBackground(new Color(204,204,255));
    
    TitledBorder title3 = BorderFactory.createTitledBorder(line, "About Fine");
    title3.setTitleFont(new Font("Tahoma", Font.BOLD, 16));
    title3.setTitleColor(Color.BLUE);
    pC.setBorder(title3);
    
    JLabel lbl5 = new JLabel("     Fine Rate: RM1.00 per day");
    lbl5.setFont(new Font("Times New Roman", Font.BOLD, 15));
    JLabel lbl6 = new JLabel("     All fine should be paid at COUNTER.");
    lbl6.setFont(new Font("Bodoni MT", Font.BOLD + Font.ITALIC, 15));
    
    pC.add(lbl5);
    pC.add(lbl6);
    p2.add(pC);
    panel.add(p2, "Center");
    
    //panel for creating gap
    JPanel p3 = new JPanel();
    p3.setBackground(new Color(204,204,255));
    JPanel p4 = new JPanel();
    p4.setBackground(new Color(204,204,255));
    panel.add(p3, "West");
    panel.add(p4, "East");
    
    //panel for button
    JPanel p5 = new JPanel();
    p5.setBackground(new Color(204,204,255));
    btnBack = new JButton("Back");
    btnBack.setFocusPainted(false);
    btnBack.setBackground(new Color(153,137,247));
    btnBack.setForeground(Color.WHITE);
    btnBack.addActionListener(this);            //event handling for button
    p5.add(btnBack);
    panel.add(p5, "South");
    
    add(panel);
    setVisible(true);
    ImageIcon icon = new ImageIcon("apu.jpg"); 
    setIconImage(icon.getImage());
    UserID = id;
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnBack){
            this.dispose();
            Homepage hp = new Homepage(UserID);
            hp.setVisible(true);
        }
    }
}
