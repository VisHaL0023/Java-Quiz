
package simple.minds;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class score extends JFrame implements ActionListener{
    
    score(String username, int score){
        setBounds(600 , 150, 750, 550);
        getContentPane().setBackground(new Color(235,250,255));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/score2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,  250 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(10,200,300,250);
        add(l1);
        
        JLabel l2 = new JLabel("Thanks "+username+" for Playing this Quiz");
        l2.setBounds(45,30, 700, 50);
        l2.setForeground(new Color(0,0,139));
        l2.setFont(new Font("ALGERIAN", Font.PLAIN, 40));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is : "+score);
        l3.setBounds(360,200, 390, 80);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 30));
        l3.setForeground(new Color(199,21,133));
        add(l3);
        
        JButton b1 = new JButton("Play Again");
        b1.setBackground(new Color(70,130,180));
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma", Font.PLAIN,16));
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,300,120,40);
        add(b1);
        
    }
    
    public static void main(String[] args){
        new score("", 0).setVisible(true);
    }

    
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new QuizTime().setVisible(true);
    }
}
