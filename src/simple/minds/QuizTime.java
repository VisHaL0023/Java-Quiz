package simple.minds;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class QuizTime extends JFrame implements ActionListener {
   JButton b1,b2;
   JTextField t1;
    QuizTime(){
        setBounds(400,200,1100,550);  //dleft, dup, lenght, height//
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,  500 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1= new JLabel(i3);
        l1.setBounds(0, 0, 600,500);
        add(l1);
        
        JLabel l2 = new JLabel("Quiz Time");
        l2.setFont(new Font("ALGERIAN", Font.BOLD, 49));
        l2.setForeground(new Color(220,20,60));
        l2.setBounds(695, 60,300,45);
        add(l2);
        
        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        l3.setForeground(new Color(25,25 ,112));
        l3.setBounds(740,150,300,20);
        add(l3);
        
        t1 = new JTextField();
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        t1.setBounds(675,200,300,29);
        add(t1);
        
        b1 = new JButton("Rules");
        b1.setBounds(675, 270, 120, 30);
        b1.setBackground(new Color(123, 104,238));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(855, 270, 120, 30);
        b2.setBackground(new Color(123, 104,238));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
   
        public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()==b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }
    
    
    public static void main(String[] args) {
     
        new QuizTime();
    }
    
}
