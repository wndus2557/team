import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;


public class Haha {

   private JFrame frame;
   private JTextField bugger_textField;
   private JTextField potato_textField;
   private JTextField coke_textField;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Haha window = new Haha();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public Haha() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {

      
      frame = new JFrame();
      frame.setBackground(Color.WHITE);
      frame.getContentPane().setForeground(Color.WHITE);
      frame.setBounds(100, 100, 600, 500);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBackground(Color.ORANGE);
      panel.setBounds(0, 0, 180, 300);
      frame.getContentPane().add(panel);
      panel.setLayout(null);
      
      JLayeredPane layeredPane_1 = new JLayeredPane();
      layeredPane_1.setBackground(Color.WHITE);
      layeredPane_1.setBounds(10, 10, 160, 280);
      panel.add(layeredPane_1);
      
      JLabel buger = new JLabel("");
      buger.setIcon(new ImageIcon("C:\\Users\\ehxhf\\eclipse-workspace\\VDing\\src\\image\\buger1.png"));
      buger.setBounds(10, 10, 140, 120);
      layeredPane_1.add(buger);
      
      JLabel buger_Label = new JLabel("      \uD584\uBC84\uAC70");
      buger_Label.setVerticalAlignment(SwingConstants.TOP);
      buger_Label.setFont(new Font("ÇÑÄÄ ¼Ò¸Á B", Font.PLAIN, 16));
      buger_Label.setBounds(10, 140, 140, 17);
      layeredPane_1.add(buger_Label);
      
      
      JButton buger_plus_Btn = new JButton("+");
      buger_plus_Btn.setFont(new Font("±¼¸²", Font.BOLD, 17));
      buger_plus_Btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         //   if()
            
               
            
            
         }
      });
      buger_plus_Btn.setBounds(20, 217, 50, 50);
      layeredPane_1.add(buger_plus_Btn);
      
      JButton buger_minus_btn = new JButton("-");
      buger_minus_btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      buger_minus_btn.setFont(new Font("±¼¸²", Font.BOLD, 17));
      buger_minus_btn.setBounds(90, 217, 50, 50);
      layeredPane_1.add(buger_minus_btn);
      
      bugger_textField = new JTextField();
      bugger_textField.setBounds(20, 167, 115, 40);
      layeredPane_1.add(bugger_textField);
      bugger_textField.setColumns(10);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(Color.ORANGE);
      panel_1.setBounds(200, 0, 180, 300);
      
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JLayeredPane layeredPane = new JLayeredPane();
      layeredPane.setBounds(10, 10, 160, 280);
      panel_1.add(layeredPane);
      
      JLabel potato = new JLabel("");
      potato.setIcon(new ImageIcon("C:\\Users\\ehxhf\\eclipse-workspace\\VDing\\src\\image\\potato.png"));
      potato.setBounds(10, 10, 140, 120);
      layeredPane.add(potato);
      
      JLabel potato_Label = new JLabel("     \uAC10\uC790\uD280\uAE40");
      potato_Label.setVerticalAlignment(SwingConstants.TOP);
      potato_Label.setFont(new Font("ÇÑÄÄ ¼Ò¸Á B", Font.PLAIN, 16));
      potato_Label.setBounds(10, 149, 140, 17);
      layeredPane.add(potato_Label);
      
      JButton potato_plus_btn = new JButton("+");
      potato_plus_btn.setFont(new Font("±¼¸²", Font.BOLD, 17));
      potato_plus_btn.setBounds(20, 220, 50, 50);
      layeredPane.add(potato_plus_btn);
      
      JButton potato_minus_btn = new JButton("-");
      potato_minus_btn.setFont(new Font("±¼¸²", Font.BOLD, 17));
      potato_minus_btn.setBounds(90, 220, 50, 50);
      layeredPane.add(potato_minus_btn);
      
      potato_textField = new JTextField();
      potato_textField.setColumns(10);
      potato_textField.setBounds(20, 170, 115, 40);
      layeredPane.add(potato_textField);
      
      JPanel panel_2 = new JPanel();
      panel_2.setBackground(Color.ORANGE);
      panel_2.setBounds(400, 0, 180, 300);
      frame.getContentPane().add(panel_2);
      panel_2.setLayout(null);
      
      JLayeredPane layeredPane_2 = new JLayeredPane();
      layeredPane_2.setBounds(10, 10, 160, 280);
      panel_2.add(layeredPane_2);
      
      JLabel coke = new JLabel("");
      coke.setIcon(new ImageIcon("C:\\Users\\ehxhf\\eclipse-workspace\\VDing\\src\\image\\coke.png"));
      coke.setBounds(10, 10, 140, 120);
      layeredPane_2.add(coke);
      
      JLabel coke_Label = new JLabel("       \uCF5C\uB77C");
      coke_Label.setVerticalAlignment(SwingConstants.TOP);
      coke_Label.setFont(new Font("ÇÑÄÄ ¼Ò¸Á B", Font.PLAIN, 16));
      coke_Label.setBounds(10, 140, 140, 17);
      layeredPane_2.add(coke_Label);
      
      JButton coke_plus_btn = new JButton("+");
      coke_plus_btn.setFont(new Font("±¼¸²", Font.BOLD, 17));
      coke_plus_btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      coke_plus_btn.setBounds(20, 217, 50, 50);
      layeredPane_2.add(coke_plus_btn);
      
      JButton coke_minus_btn = new JButton("-");
      coke_minus_btn.setFont(new Font("±¼¸²", Font.BOLD, 17));
      coke_minus_btn.setBounds(90, 217, 50, 50);
      layeredPane_2.add(coke_minus_btn);
      
      coke_textField = new JTextField();
      coke_textField.setColumns(10);
      coke_textField.setBounds(20, 167, 115, 40);
      layeredPane_2.add(coke_textField);
      
      JPanel panel_3 = new JPanel();
      panel_3.setBackground(Color.ORANGE);
      panel_3.setBounds(0, 310, 580, 150);
      frame.getContentPane().add(panel_3);
      panel_3.setLayout(null);
      
      JLayeredPane layeredPane_3 = new JLayeredPane();
      layeredPane_3.setBounds(10, 10, 560, 130);
      panel_3.add(layeredPane_3);
      
      JLabel pay_Label = new JLabel("\uACC4\uC0B0");
      
      pay_Label.setFont(new Font("ÇÑÄÄ ¼Ò¸Á B", Font.PLAIN, 12));
      pay_Label.setBounds(169, 10, 140, 50);
      layeredPane_3.add(pay_Label);
      
      JLabel money_Label = new JLabel("\uC794\uC561");
      money_Label.setFont(new Font("ÇÑÄÄ ¼Ò¸Á B", Font.PLAIN, 12));
      money_Label.setBounds(169, 71, 140, 49);
      layeredPane_3.add(money_Label);
      
      JButton pay_btn = new JButton("");
      pay_btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            //btnNewButton.setText(String.valueOf(1-1+Integer.valueOf(l7.getText())*300+Integer.valueOf(l8.getText())*300+Integer.valueOf(l9.getText())*300));
               
            
         }
      });
      pay_btn.setIcon(new ImageIcon("C:\\image\\icon (11).png"));
      pay_btn.setFont(new Font("µ¸¿ò", Font.PLAIN, 10));
      pay_btn.setBounds(321, 10, 50, 50);
      layeredPane_3.add(pay_btn);
      
      JButton money_btn = new JButton("");
      money_btn.setIcon(new ImageIcon("C:\\image\\icon (9).png"));
      money_btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      money_btn.setBounds(321, 71, 50, 50);
      layeredPane_3.add(money_btn);
   }
}