package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{  
    
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(rules);
        rules.setText(
            "<html>"+ 
                "1. The questions are in the form of MCQs" + "<br><br>" +
                "2. There are 10 questions" + "<br><br>" +
                "3. Time limit: 10 seconds for each question." + "<br><br>" +
                "4. Each question carries 1 mark." + "<br><br>" +
                "5. No negative marking." + "<br><br>" +
                "6. Click on Submit button after completing the test." + "<br><br>" +
                "7. Read the question carefully." + "<br><br>" +
                "All the Best!!" + "<br><br>" +
            "<html>"
        );
        add(rules);
       
        back=new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start=new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
         
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Quiz(name);
        }
        else{
            setVisible(false);
            new Login();
        }
    }
     public static void main(String[] args) { 
         new Rules("User");
}
    
}
