package simple.minds;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    JButton b1,b2;
    String username;
    Rules(String username){
        this.username = username;                       // Globaly declare username
        setBounds(600,200,800,650);
        getContentPane().setBackground(new Color(218,238,255));
        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome "+ username+ " to Simple minds");
        l1.setFont(new Font("ALGERIAN", Font.BOLD, 33)); 
        l1.setForeground(new Color(0,0,128));
        l1.setBounds(50,20,700,30);
        add(l1);
        
        JLabel l2 = new JLabel("");
        l2.setBounds(20,90,600,350);
        l2.setFont(new Font("Tahoma", Font.PLAIN,16));
        l2.setText(
                "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250,500,100,35 );
        b1.setBackground(new Color(70,130,180));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Tahoma", Font.PLAIN,16));
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(400,500,100,35 );
        b2.setBackground(new Color(70,130,180));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Tahoma", Font.PLAIN,16));
        b2.addActionListener(this);
        add(b2);

        
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Rules("");
    }


    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            this.setVisible(false);
            new QuizTime().setVisible(true);
        }else if(ae.getSource()==b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);                    //pass name to score class
    }
}

}
