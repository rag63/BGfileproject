/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojecttest;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

/**
 *
 * @author hbug2
 */
public class Start extends JFrame{
    private static final int FRAME_WIDTH = 350;
    private static final int FRAME_HEIGHT = 200;
    private JButton lookup;
    private JLabel employeeid;
    private JLabel success;
    private JFrame frame;
    private JPanel mainpanel;
    private ActionListener listener;
    private JTextField usertext;
    private JPanel testpanel;
    
    
    public void close(){
        
    }
    public Start(){
        frame = new JFrame();
        testpanel = new JPanel();
        mainpanel = new JPanel();
        listener = new clicklistener();
        
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("Company XYZ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainpanel);
        
        mainpanel.setLayout(null);
        
        employeeid = new JLabel("Employee ID");
        employeeid.setBounds(10, 20, 80, 25);
        mainpanel.add(employeeid);
        
        usertext = new JTextField(20);
        usertext.setBounds(100, 20, 165, 25);
        mainpanel.add(usertext);
        
        lookup = new JButton("Lookup");
        lookup.setBounds(100, 80, 80, 25);
        lookup.addActionListener(listener);
        mainpanel.add(lookup);
        
        success = new JLabel("");
        success.setBounds(100, 100, 80, 25);
        mainpanel.add(success);
        
        
        
        frame.setVisible(true);   
    }
    
    class clicklistener implements ActionListener{
        public void actionPerformed(ActionEvent event)
      {
       String user = usertext.getText();
       
       String pass = "1";
       if (user.equals(pass)){
           success.setText("Success");
           //frame.getContentPane().removeAll();
           //frame.add(testpanel);
           
           
           
       }else{
           usertext.setText("");
           success.setText("No User");
       }
       
      }      
    }
    
    
    public static void main(String[] args){
        new Start();
        
    } 
}
