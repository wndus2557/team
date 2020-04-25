package 컴퓨터알고리즘;

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
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class haha {

   private JFrame frame;
   private JTextField bugger_textField;
   private JTextField potato_textField;
   private JTextField coke_textField;
   int inputMoney=0, returnMoney;
   
   
   int bugger_N=0;
   int potato_N=0;
   int coke_N=0;
   int payMoney=0,coin50k = 0 , coin10k=0, coin5k=0, coin1k=0, coin500=0, coin100=0, coin50=0, coin10=0;
   String t;
   private JTextField textField_1;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
	   
	   
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               haha window = new haha();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }
   
   public void charge() {
	   payMoney=bugger_N*5500+potato_N*1950+coke_N*1230;
	   
	   
   }
   
   
   public void smallchange() {
	   charge();
	   if(payMoney==0) {
	   	t="물건을 가져와주세요!";
	   }
	   else if(payMoney == inputMoney) {

	   		t="결제를 도와드리겠습니다.";

	   		}

	   		else if(payMoney > inputMoney) {

	   		returnMoney = payMoney - inputMoney;

	   		
	   		t=returnMoney+"원을 추가로 투입하세요!";
	   		}

	   		else {

	   		returnMoney = inputMoney - payMoney;


	   		if(returnMoney >= 50000) {

	   		coin50k = returnMoney / 50000;

	   		returnMoney = returnMoney -(50000 * coin50k);


	   		}

	   		if(returnMoney >= 10000) {

	   		coin10k = returnMoney / 10000;

	   		returnMoney = returnMoney -(10000 * coin10k);

	   		}

	   		if(returnMoney >= 5000) {

	   		coin5k = returnMoney / 5000;

	   		returnMoney = returnMoney -(5000 * coin5k);

	   		}

	   		if(returnMoney >= 1000) {

	   		coin1k = returnMoney / 1000;

	   		returnMoney = returnMoney -(1000 * coin1k);

	   		}

	   		if(returnMoney >= 500) {

	   		coin500 = returnMoney / 500;

	   		returnMoney = returnMoney -(500 * coin500);

	   		}

	   		if(returnMoney >= 100) {

	   		coin100 = returnMoney / 100;

	   		returnMoney = returnMoney -(100 * coin100);

	   		}

	   		if(returnMoney >= 50) {

	   		coin50 = returnMoney / 50;

	   		returnMoney = returnMoney -(50 * coin50);

	   		}

	   		if(returnMoney >= 10) {

	   		coin10 = returnMoney / 10;

	   		returnMoney = returnMoney -(10 * coin10);

	   		}

	   		t="결제를 도와드리겠습니다.";

	   		}

	   		}
   
   
   
   

   /**
    * Create the application.
    */
   public haha() {
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
      
      
      //버거
      JLayeredPane layeredPane_1 = new JLayeredPane();
      layeredPane_1.setBackground(Color.WHITE);
      layeredPane_1.setBounds(10, 10, 160, 280);
      panel.add(layeredPane_1);
      
      JLabel buger = new JLabel("");
      buger.setIcon(new ImageIcon("C:\\image\\buger1.png"));
      buger.setBounds(10, 10, 140, 120);
      layeredPane_1.add(buger);
      
      JLabel buger_Label = new JLabel("      \uD584\uBC84\uAC70");
      buger_Label.setVerticalAlignment(SwingConstants.TOP);
      buger_Label.setFont(new Font("한컴 소망 B", Font.PLAIN, 16));
      buger_Label.setBounds(10, 140, 140, 17);
      layeredPane_1.add(buger_Label);
      
      
      JButton buger_plus_Btn = new JButton("+");
      buger_plus_Btn.setFont(new Font("굴림", Font.BOLD, 17));
      
      buger_plus_Btn.setBounds(20, 217, 50, 50);
      layeredPane_1.add(buger_plus_Btn);
      
      JButton buger_minus_btn = new JButton("-");
      buger_minus_btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 
        	 bugger_N--;
             if (bugger_N<0)
            	 bugger_N=0;
             
             
         	 bugger_textField.setText("         "+bugger_N+" \n");
         	 
         	 
         }
      });
      buger_minus_btn.setFont(new Font("굴림", Font.BOLD, 17));
      buger_minus_btn.setBounds(90, 217, 50, 50);
      layeredPane_1.add(buger_minus_btn);
      
      bugger_textField = new JTextField();
      bugger_textField.setBounds(20, 167, 115, 40);
      layeredPane_1.add(bugger_textField);
      bugger_textField.setColumns(10);
      buger_plus_Btn.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
          //   if()
             
         	 bugger_N++;
              
         	 bugger_textField.setText("         "+bugger_N+" \n");
             
             
          }
       });
      JPanel panel_1 = new JPanel();
      panel_1.setBackground(Color.ORANGE);
      panel_1.setBounds(200, 0, 180, 300);
      
      frame.getContentPane().add(panel_1);
      panel_1.setLayout(null);
      
      JLayeredPane layeredPane = new JLayeredPane();
      layeredPane.setBounds(10, 10, 160, 280);
      panel_1.add(layeredPane);
      //감튀
      JLabel potato = new JLabel("");
      potato.setIcon(new ImageIcon("C:\\image\\potato.png"));
      potato.setBounds(10, 10, 140, 120);
      layeredPane.add(potato);
      
      JLabel potato_Label = new JLabel("     \uAC10\uC790\uD280\uAE40");
      potato_Label.setVerticalAlignment(SwingConstants.TOP);
      potato_Label.setFont(new Font("한컴 소망 B", Font.PLAIN, 16));
      potato_Label.setBounds(10, 149, 140, 17);
      layeredPane.add(potato_Label);
      
      JButton potato_plus_btn = new JButton("+");
      potato_plus_btn.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		
      		potato_N++;
            
            
        	 potato_textField.setText("         "+potato_N+" \n");
      	}
      });
      potato_plus_btn.setFont(new Font("굴림", Font.BOLD, 17));
      potato_plus_btn.setBounds(20, 220, 50, 50);
      layeredPane.add(potato_plus_btn);
      
      JButton potato_minus_btn = new JButton("-");
      potato_minus_btn.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		
      		potato_N--;
            if (potato_N<0)
            	potato_N=0;
            
            
        	 potato_textField.setText("         "+potato_N+" \n");
      	}
      });
      potato_minus_btn.setFont(new Font("굴림", Font.BOLD, 17));
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
      //콜라
      JLabel coke = new JLabel("");
      coke.setIcon(new ImageIcon("C:\\image\\coke.png"));
      coke.setBounds(10, 10, 140, 120);
      layeredPane_2.add(coke);
      
      JLabel coke_Label = new JLabel("       \uCF5C\uB77C");
      coke_Label.setVerticalAlignment(SwingConstants.TOP);
      coke_Label.setFont(new Font("한컴 소망 B", Font.PLAIN, 16));
      coke_Label.setBounds(10, 140, 140, 17);
      layeredPane_2.add(coke_Label);
      
      JButton coke_plus_btn = new JButton("+");
      coke_plus_btn.setFont(new Font("굴림", Font.BOLD, 17));
      coke_plus_btn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 
        	 coke_N++;
             
             
        	 coke_textField.setText("         "+coke_N+" \n");
         }
      });
      coke_plus_btn.setBounds(20, 217, 50, 50);
      layeredPane_2.add(coke_plus_btn);
      
      JButton coke_minus_btn = new JButton("-");
      coke_minus_btn.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		
      		coke_N--;
            if (coke_N<0)
            	coke_N=0;
            
            
            coke_textField.setText("         "+coke_N+" \n");
      		
      	}
      });
      coke_minus_btn.setFont(new Font("굴림", Font.BOLD, 17));
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
      
      JLabel money_Label = new JLabel("투입금액");
      money_Label.setFont(new Font("한컴 소망 B", Font.PLAIN, 12));
      money_Label.setBounds(111, 14, 65, 49);
      layeredPane_3.add(money_Label);;
      //결제버튼
      JButton btnNewButton = new JButton("결제");
      btnNewButton.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
      btnNewButton.setBounds(321, 69, 58, 53);
      layeredPane_3.add(btnNewButton);
      //투입버튼
      JButton button = new JButton("\uD22C\uC785");
      button.setFont(new Font("HY헤드라인M", Font.PLAIN, 12));
      button.setBounds(321, 10, 58, 53);
      layeredPane_3.add(button);
     //투입창
      TextArea t2 = new TextArea();
      t2.setBounds(193, 10, 122, 53);
      layeredPane_3.add(t2);
      t2.setBackground(new Color(240, 255, 240));
      
      //결제창
      TextArea t0 = new TextArea();
      t0.setBounds(193, 65, 122, 50);
      layeredPane_3.add(t0);
      t0.setBackground(new Color(240, 255, 240));
      
    //팝업창
      TextArea t1 = new TextArea();
      t1.setBounds(400, 0, 160, 130);
      layeredPane_3.add(t1);
      t1.setBackground(new Color(240, 255, 240));
      
      JButton 결제금액=new JButton("결제금액");
      결제금액.setBounds(78, 73, 110, 36);
      layeredPane_3.add(결제금액);
      
     //결제버튼을클릭
      btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				smallchange();
				
				t1.append("총 결제 금액은 "+payMoney+"원 입니다.\n\n");
				t1.append(t+"\n\n");
				if(t=="결제를 도와드리겠습니다.")
				{
				t1.append("잔돈은\n");
				t1.append("50000원: "+coin50k+"\n");
				t1.append("10000원: "+coin10k+"\n");
				t1.append("5000원: "+coin5k+"\n");
				t1.append("1000원: "+coin1k+"\n");
				t1.append("500원: "+coin500+"\n");
				t1.append("100원: "+coin100+"\n");
				t1.append("50원: "+coin50+"\n");
				t1.append("10원: "+coin10+"\n\n");
				t1.append("총 잔돈 " +(coin50k*50000+coin10k*10000+coin5k*5000+coin1k*1000+coin500*500+coin100*100+coin50*50+coin10*10)+"원 입니다.\n");
				t1.append("감사합니다!! 다음번에또오세요~!\n");
				}
			}

		
		});
      //투입버튼클릭
      button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String a=t2.getText(); 
				 
		t1.append("현재 투입금액 "+a+"원 입니다.\n");
					
						//입력값을 inputMoney에다집어넣는 과정필요
		inputMoney=55000;//대체
			}
		
		});
      
      
     결제금액.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				charge();
				t0.append(payMoney+"원");
			}

		
		});
   }
}
