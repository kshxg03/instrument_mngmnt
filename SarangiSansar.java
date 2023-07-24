 
/**
 * Write a description of class SarangiSansar here.
 *
 * @author (Kshitiz Shrestha)
 * @version (18.0.2)
 */
import javax.swing.*; //import swing class from javax
import java.awt.*; //import all classes from awt 
import java.awt.event.*; //import the event class
import java.util.ArrayList; // import the ArrayList class


public class SarangiSansar implements ActionListener
{
    JFrame frame;
    JPanel p1, p2, p3, p4, p5, p6;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15;
    JComboBox<String> cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14;
    
    String date[] = {"1", "2", "3", "4", "5" , "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" , "16", "17", "18", "19", "20", "21", "22", "23", 
        "24", "25", "26", "27", "28", "29", "30", "31"};
    String month[] = {"January", "Febraury", "March", "April", "May", "June", "July", "August", "September", "November", "October", "December"};
    String year[] = {"2021", "2022", "2023"};
    
    public SarangiSansar()
    {
        frame = new JFrame("Sarangi Sansar");
        frame.setLayout(null);
        
        //Side panel
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(5, 5, 250, 720);
        p1.setBorder(BorderFactory.createLineBorder(Color.black, 3));
        p1.setBackground(Color.PINK);
        frame.add(p1);
        
        l1 = new JLabel("SARANGI SANSAR");
        l1.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 24));
        l1.setBounds(20, 20, 220, 40);
        p1.add(l1);
        
        l2 = new JLabel("!!! Welcome");
        l2.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 22));
        l2.setBounds(80, 150, 180, 40);
        p1.add(l2);
        
        l3 = new JLabel("To");
        l3.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 22));
        l3.setBounds(80, 220, 180, 40);
        p1.add(l3);
        
        l4 = new JLabel("The");
        l4.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 22));
        l4.setBounds(80, 290, 180, 40);
        p1.add(l4);
        
        l5 = new JLabel("World");
        l5.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 22));
        l5.setBounds(80, 360, 180, 40);
        p1.add(l5);
        
        l6 = new JLabel("Of");
        l6.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 22));
        l6.setBounds(80, 430, 180, 40);
        p1.add(l6);
        
        l7 = new JLabel("Music !!!");
        l7.setFont(new Font("Serif", Font.ITALIC+Font.BOLD, 22));
        l7.setBounds(80, 500, 180, 40);
        p1.add(l7);
        
        //Add for rent panel
        p2 = new JPanel();
        p2.setBounds(260, 5, 620, 100);
        p2.setLayout(null);
        p2.setBackground(Color.WHITE);
        p2.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(p2);        
        
        l8 = new JLabel("Add instrument for rent:");
        l8.setFont(new Font("Calibri", Font.BOLD, 22));
        l8.setBounds(5, 5, 260, 30);
        p2.add(l8);
        
        l9 = new JLabel("Instrument Name:");
        l9.setFont(new Font("Calibri", Font.PLAIN, 18));
        l9.setBounds(5, 30, 180, 40);
        p2.add(l9);
        
        t1 = new JTextField();
        t1.setBounds(155, 40, 140, 20);
        t1.setFont(new Font("Calibri", Font.PLAIN, 18));
        p2.add(t1);
        
        l10 = new JLabel("Charge Per Day:");
        l10.setFont(new Font("Calibri", Font.PLAIN, 18));
        l10.setBounds(350, 30, 180, 40);
        p2.add(l10);
        
        t2 = new JTextField();
        t2.setBounds(475, 40, 140, 20);
        t2.setFont(new Font("Calibri", Font.PLAIN, 18));
        p2.add(t2);
        
        b1 = new JButton("Add");
        b1.setBounds(385, 70, 60, 20);
        p2.add(b1);
        
        b2 = new JButton("Display");
        b2.setBounds(455, 70, 80, 20);
        p2.add(b2);
        
        b3 = new JButton("Clear");
        b3.setBounds(543, 70, 70, 20);
        p2.add(b3);
        
        //Add for sell panel
        p3 = new JPanel();
        p3.setBounds(260, 115, 620, 100);
        p3.setLayout(null);
        p3.setBackground(Color.WHITE);
        p3.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(p3);
               
        l11 = new JLabel("Add instrument for sell:");
        l11.setFont(new Font("Calibri", Font.BOLD, 22));
        l11.setBounds(5, 5, 260, 30);
        p3.add(l11);
        
        l12 = new JLabel("Instrument Name:");
        l12.setFont(new Font("Calibri", Font.PLAIN, 18));
        l12.setBounds(5, 30, 180, 40);
        p3.add(l12);
        
        t3 = new JTextField();
        t3.setBounds(155, 40, 140, 20);
        t3.setFont(new Font("Calibri", Font.PLAIN, 18));
        p3.add(t3);
        
        l13 = new JLabel("Price:");
        l13.setFont(new Font("Calibri", Font.PLAIN, 18));
        l13.setBounds(425, 30, 180, 40);
        p3.add(l13);
        
        t4 = new JTextField();
        t4.setBounds(475, 40, 140, 20);
        t4.setFont(new Font("Calibri", Font.PLAIN, 18));
        p3.add(t4);
        
        b4 = new JButton("Add");
        b4.setBounds(385, 70, 60, 20);
        p3.add(b4);
        
        b5 = new JButton("Display");
        b5.setBounds(455, 70, 80, 20);
        p3.add(b5);
        
        b6 = new JButton("Clear");
        b6.setBounds(543, 70, 70, 20);
        p3.add(b6);
        
        //Rent panel
        p4 = new JPanel();
        p4.setBounds(260, 225, 620, 200);
        p4.setLayout(null);
        p4.setBackground(Color.WHITE);
        p4.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(p4);
        
        l14 = new JLabel("Rent an instrument:");
        l14.setFont(new Font("Calibri", Font.BOLD, 22));
        l14.setBounds(5, 5, 260, 30);
        p4.add(l14);
        
        l15 = new JLabel("Instrument Name:");
        l15.setFont(new Font("Calibri", Font.PLAIN, 18));
        l15.setBounds(5, 30, 180, 40);
        p4.add(l15);
        
        t5 = new JTextField();
        t5.setBounds(155, 40, 140, 20);
        t5.setFont(new Font("Calibri", Font.PLAIN, 18));
        p4.add(t5);
        
        l16 = new JLabel("Customer Phone:");
        l16.setFont(new Font("Calibri", Font.PLAIN, 18));
        l16.setBounds(340, 30, 180, 40);
        p4.add(l16);
        
        t6 = new JTextField();
        t6.setBounds(475, 40, 140, 20);
        t6.setFont(new Font("Calibri", Font.PLAIN, 18));
        p4.add(t6);
        
        l17 = new JLabel("Customer Name:");
        l17.setFont(new Font("Calibri", Font.PLAIN, 18));
        l17.setBounds(5, 70, 180, 40);
        p4.add(l17);
        
        t7 = new JTextField();
        t7.setBounds(155, 80, 140, 20);
        t7.setFont(new Font("Calibri", Font.PLAIN, 18));
        p4.add(t7);
        
        l18 = new JLabel("Rent Date:");
        l18.setFont(new Font("Calibri", Font.PLAIN, 18));
        l18.setBounds(353, 110, 180, 40);
        p4.add(l18);
                      
        cb1 = new JComboBox<String>(date);
        cb1.setBounds(435, 119, 40, 20);
        p4.add(cb1);
        
        cb2 = new JComboBox<String>(month);
        cb2.setBounds(475, 119, 80, 20);
        p4.add(cb2);
        
        cb3 = new JComboBox<String>(year);
        cb3.setBounds(555, 119, 60, 20);
        p4.add(cb3);
        
        l19 = new JLabel("Customer PAN No.:");
        l19.setFont(new Font("Calibri", Font.PLAIN, 18));
        l19.setBounds(5, 110, 180, 40);
        p4.add(l19);
        
        t8 = new JTextField();
        t8.setBounds(155, 120, 140, 20);
        t8.setFont(new Font("Calibri", Font.PLAIN, 18));
        p4.add(t8);
        
        l20 = new JLabel("No. of renting days:");
        l20.setFont(new Font("Calibri", Font.PLAIN, 18));
        l20.setBounds(325, 70, 180, 40);
        p4.add(l20);
        
        t9 = new JTextField();
        t9.setBounds(475, 80, 140, 20);
        t9.setFont(new Font("Calibri", Font.PLAIN, 18));
        p4.add(t9);
        
        l21 = new JLabel("Return Date:");
        l21.setFont(new Font("Calibri", Font.PLAIN, 18));
        l21.setBounds(5, 145, 180, 40);
        p4.add(l21);
        
        cb4 = new JComboBox<String>(date);
        cb4.setBounds(115, 154, 40, 20);
        p4.add(cb4);
        
        cb5 = new JComboBox<String>(month);
        cb5.setBounds(155, 154, 80, 20);
        p4.add(cb5);
        
        cb6 = new JComboBox<String>(year);
        cb6.setBounds(235, 154, 60, 20);
        p4.add(cb6);
        
        b7 = new JButton("Rent");
        b7.setBounds(375, 170, 70, 20);
        p4.add(b7);
        
        b8 = new JButton("Display");
        b8.setBounds(455, 170, 80, 20);
        p4.add(b8);
        
        b9 = new JButton("Clear");
        b9.setBounds(545, 170, 70, 20);
        p4.add(b9);
               
        //Sell panel
        p5 = new JPanel();
        p5.setBounds(260, 435, 620, 180);
        p5.setLayout(null);
        p5.setBackground(Color.WHITE);
        p5.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(p5);
        
        l22 = new JLabel("Sell an instrument:");
        l22.setFont(new Font("Calibri", Font.BOLD, 22));
        l22.setBounds(5, 5, 260, 30);
        p5.add(l22);
        
        l23 = new JLabel("Instrument Name:");
        l23.setFont(new Font("Calibri", Font.PLAIN, 18));
        l23.setBounds(5, 30, 180, 40);
        p5.add(l23);
        
        t10 = new JTextField();
        t10.setBounds(155, 40, 140, 20);
        t10.setFont(new Font("Calibri", Font.PLAIN, 18));
        p5.add(t10);
        
        l24 = new JLabel("Customer Phone:");
        l24.setFont(new Font("Calibri", Font.PLAIN, 18));
        l24.setBounds(340, 30, 180, 40);
        p5.add(l24);
        
        t11 = new JTextField();
        t11.setBounds(475, 40, 140, 20);
        t11.setFont(new Font("Calibri", Font.PLAIN, 18));
        p5.add(t11);
        
        l25 = new JLabel("Customer Name:");
        l25.setFont(new Font("Calibri", Font.PLAIN, 18));
        l25.setBounds(5, 70, 180, 40);
        p5.add(l25);
        
        t12 = new JTextField();
        t12.setBounds(155, 80, 140, 20);
        t12.setFont(new Font("Calibri", Font.PLAIN, 18));
        p5.add(t12);
        
        l26 = new JLabel("Sell Date:");
        l26.setFont(new Font("Calibri", Font.PLAIN, 18));
        l26.setBounds(353, 110, 180, 40);
        p5.add(l26);
        
        cb7 = new JComboBox<String>(date);
        cb7.setBounds(435, 119, 40, 20);
        p5.add(cb7);
        
        cb8 = new JComboBox<String>(month);
        cb8.setBounds(475, 119, 80, 20);
        p5.add(cb8);
        
        cb9 = new JComboBox<String>(year);
        cb9.setBounds(555, 119, 60, 20);
        p5.add(cb9);
        
        l27 = new JLabel("Customer Pan No.");
        l27.setFont(new Font("Calibri", Font.PLAIN, 18));
        l27.setBounds(5, 110, 180, 40);
        p5.add(l27);
        
        t13 = new JTextField();
        t13.setBounds(155, 120, 140, 20);
        t13.setFont(new Font("Calibri", Font.PLAIN, 18));
        p5.add(t13);
        
        l28 = new JLabel("Discount%:");
        l28.setFont(new Font("Calibri", Font.PLAIN, 18));
        l28.setBounds(385, 70, 180, 40);
        p5.add(l28);
        
        t14 = new JTextField();
        t14.setBounds(475, 80, 140, 20);
        t14.setFont(new Font("Calibri", Font.PLAIN, 18));
        p5.add(t14);
        
        b10 = new JButton("Sell");
        b10.setBounds(375, 150, 70, 20);
        p5.add(b10);
        
        b11 = new JButton("Display");
        b11.setBounds(455, 150, 80, 20);
        p5.add(b11);
        
        b12 = new JButton("Clear");
        b12.setBounds(545, 150, 70, 20);
        p5.add(b12);
        
        //Return panel
        p6 = new JPanel();
        p6.setBounds(260, 625, 620, 100);
        p6.setLayout(null);
        p6.setBackground(Color.WHITE);
        p6.setBorder(BorderFactory.createLineBorder(Color.black));
        frame.add(p6);
        
        l29 = new JLabel("Return an instrument:");
        l29.setFont(new Font("Calibri", Font.BOLD, 22));
        l29.setBounds(5, 5, 260, 30);
        p6.add(l29);
        
        l30 = new JLabel("Instrument Name:");
        l30.setFont(new Font("Calibri", Font.PLAIN, 18));
        l30.setBounds(5, 30, 180, 40);
        p6.add(l30);
        
        t15 = new JTextField();
        t15.setBounds(155, 40, 140, 20);
        t15.setFont(new Font("Calibri", Font.PLAIN, 18));
        p6.add(t15);
                
        b13 = new JButton("Return");
        b13.setBounds(455, 70, 80, 20);
        p6.add(b13);
        
        b14 = new JButton("Clear");
        b14.setBounds(545, 70, 70, 20);
        p6.add(b14);
        
        frame.setVisible(true);
        frame.setBounds(320, 40, 900, 770);
        
        b1.addActionListener(this); //button for add rent
        b2.addActionListener(this); //button for add rent display
        b3.addActionListener(this); //button for add rent clear
        b4.addActionListener(this); //button for add sell
        b5.addActionListener(this); //button for add sell display
        b6.addActionListener(this); //button for add sell clear
        b7.addActionListener(this); //button for rent
        b8.addActionListener(this); //button for display rented information
        b9.addActionListener(this); //button for clear rent part
        b10.addActionListener(this); //button for sell
        b11.addActionListener(this); //button for display sell insformation
        b12.addActionListener(this); //button for clear sell part
        b13.addActionListener(this); //button for return
        b14.addActionListener(this); //button for clear return part
    }
    
    String InstrumentName;
    String CustomerName;
    String CustomerMobileNumber;
    String DateofRent;
    String DateofReturn;
    int ChargePerDay;
    int PANNumber;
    int NumberofDays;
    float DiscountPercent;
    float Price;
    boolean addRent = false;
    boolean addSell = false;
    boolean IsRented = false;
    boolean IsSold = false;
    boolean IsReturned = false;
    ArrayList<Instrument> IR = new ArrayList<Instrument>();
    
    public void actionPerformed(ActionEvent e)
    {  
        if(e.getSource() == b1)
        {
           if(t1.getText().isEmpty() || t2.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(frame, "One or both textfields are empty, please fill up all the information and try again!!!");
           }
           else
           {
               try
               {        
                   InstrumentName = t1.getText();
                   ChargePerDay = Integer.parseInt(t2.getText());
                   if(IR.isEmpty())
                   {
                       InstrumentToRent InstrumentInfo = new InstrumentToRent(InstrumentName, ChargePerDay);  
                       IR.add(InstrumentInfo);
                       JOptionPane.showMessageDialog(frame, "The instrument: " + InstrumentName + " is added for rent.");
                       addSell = true;
                   }
                   else if(addRent == false)
                   {
                       for(Instrument obj : IR)
                       {
                           if(obj.getInstrumentName().equals(InstrumentName))
                           {
                               JOptionPane.showMessageDialog(frame, "The instrument: " + InstrumentName +" is already added for rent.");
                           }    
                           else
                           {
                               InstrumentToRent InstrumentInfo = new InstrumentToRent(InstrumentName, ChargePerDay);  
                               IR.add(InstrumentInfo);
                               JOptionPane.showMessageDialog(frame, "The instrument: " + InstrumentName +" is added for rent");  
                               break;
                           }
                       }  
                   } 
                   else
                   {
                       for(Instrument obj : IR)
                       {
                           if(obj.getInstrumentName().equals(InstrumentName))
                           {
                               JOptionPane.showMessageDialog(frame, "This instrument is already added in selling list");
                           }
                           else
                           {
                               InstrumentToRent InstrumentInfo = new InstrumentToRent(InstrumentName, ChargePerDay);  
                               IR.add(InstrumentInfo);
                               JOptionPane.showMessageDialog(frame, "The instrument: " + InstrumentName +" is added for rent."); 
                               addRent = false;
                               break;
                           }
                       }
                    }
               }
               catch(NumberFormatException c)
               {
                   JOptionPane.showMessageDialog(frame, "Only number inputs are accepted in charge per day section", 
                   "Error", JOptionPane.ERROR_MESSAGE);
               }
           }              
        }
        
        else if(e.getSource() == b2)
        {
            if(IR.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Nothing to display!!!");
            }
            else
            {
                for(Instrument d : IR)
                {
                    if(d instanceof InstrumentToRent)
                    {
                        InstrumentToRent dis = (InstrumentToRent)d;
                        d.display();
                    }
                }
            }
        } 
        
        else if(e.getSource() == b3)
        {
            t1.setText("");
            t2.setText("");
        }
        
        else if(e.getSource() == b4)
        {
           if(t3.getText().isEmpty() || t4.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(frame, "One or both textfields are empty, please fill up all the information and try again!!!");
           }
           else
           {
               try
               {        
                   InstrumentName = t3.getText();
                   Price = Integer.parseInt(t4.getText());
                   if(IR.isEmpty())
                   {
                       InstrumentToSell InstrumentInfo = new InstrumentToSell(InstrumentName, Price);  
                       IR.add(InstrumentInfo);
                       JOptionPane.showMessageDialog(frame, "The instrument: " + InstrumentName +" is added for sell.");
                       addRent = true;
                   }
                   else if(addSell == false)
                   {
                       for(Instrument obj : IR)
                       {
                           if(obj.getInstrumentName().equals(InstrumentName))
                           {
                               JOptionPane.showMessageDialog(frame, "The instrument: " + InstrumentName +" is already added for sell.");
                           }    
                           else
                           {
                               InstrumentToSell InstrumentInfo = new InstrumentToSell(InstrumentName, Price);  
                               IR.add(InstrumentInfo);
                               JOptionPane.showMessageDialog(frame, "The instrument: " + InstrumentName +" is added for sell.");  
                               break;
                           }
                       }  
                   }
                   else
                   {
                       for(Instrument obj: IR)
                       {
                           if(obj.getInstrumentName().equals(InstrumentName))
                           {
                              JOptionPane.showMessageDialog(frame, "This instrument is already added in renting list");
                           }    
                           else
                           {
                               InstrumentToSell InstrumentInfo = new InstrumentToSell(InstrumentName, Price);  
                               IR.add(InstrumentInfo);
                               JOptionPane.showMessageDialog(frame, "The instrument: " + InstrumentName +" is added for sell.");  
                               addSell = false;
                               break;
                           }
                       }
                   }
               }
               catch(NumberFormatException c)
               {
                   JOptionPane.showMessageDialog(frame, "Only number inputs are accepted in the price section", "Error", JOptionPane.ERROR_MESSAGE);
               }
           }              
        }
        
        else if(e.getSource() == b5)
        {
            if(IR.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Nothing to display!!!");
            }
            else
            {
                for(Instrument d : IR)
                {
                    if(d instanceof InstrumentToSell)
                    {
                        InstrumentToSell dis = (InstrumentToSell)d;
                        d.display();
                    }
                }
            }
        }
        
        else if(e.getSource() == b6)
        {
            t3.setText("");
            t4.setText("");
        }
        
        else if(e.getSource() == b7)
        {
           if(t5.getText().isEmpty() || t6.getText().isEmpty() || t7.getText().isEmpty() || t8.getText().isEmpty() || t9.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(frame, "One or more than one of thetextfields are empty, please fill up all the information and try again!!!");
           }
           else
           {
               try
               { 
                   InstrumentName = t5.getText();
                   CustomerName = t7.getText();
                   CustomerMobileNumber = t6.getText();
                   PANNumber = Integer.parseInt(t8.getText());
                   NumberofDays = Integer.parseInt(t9.getText());
                   String Year = cb1.getSelectedItem().toString();
                   String Month = cb2.getSelectedItem().toString();
                   String Day = cb3.getSelectedItem().toString();
                   String DateofRent = Day + "|" + Month + "|" + Year;
                   String Year1 = cb4.getSelectedItem().toString();
                   String Month1 = cb5.getSelectedItem().toString();
                   String Day1 = cb6.getSelectedItem().toString();
                   String DateofReturn = Day1 + "|" + Month1 + "|" + Year1;
                   if(IsRented == true)
                   {
                       JOptionPane.showMessageDialog(frame, "The instrument is already rented", "Error", JOptionPane.ERROR_MESSAGE);
                   }
                   else
                   {
                       for(Instrument obj : IR)
                       {
                           if(obj.getInstrumentName().equals(InstrumentName))
                           {
                               if(obj instanceof InstrumentToRent)
                               {
                                   InstrumentToRent rentObj = (InstrumentToRent)obj; 
                                   rentObj.rentInstrument(CustomerName, CustomerMobileNumber, PANNumber, DateofRent, DateofReturn, NumberofDays);
                                   JOptionPane.showMessageDialog(frame, "The instrument has been rented");
                                   IsRented = true;
                                   return;
                               }
                           }
                           else
                           {
                               JOptionPane.showMessageDialog(frame, "The instrument is not in the rent list", "Error", JOptionPane.ERROR_MESSAGE);
                               return;
                           }
                       }
                   }
               }
               catch(NumberFormatException c)
               {    
                   JOptionPane.showMessageDialog(frame, "Only number inputs are accepted in the number of days and customer pan number section",
                   "Error", JOptionPane.ERROR_MESSAGE);
               }
           }
        }
        
        else if(e.getSource() == b8)
        {
            if(IR.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Nothing to display!!!");
            }
            else
            {
                for(Instrument d : IR)
                {
                    if(d instanceof InstrumentToRent)
                    {
                        InstrumentToRent dis = (InstrumentToRent)d;
                        d.display();
                    }
                }
            }
        }
        
        else if(e.getSource()== b9)
        {
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
        }
        
        else if(e.getSource() == b10)
        {
           if(t10.getText().isEmpty() || t11.getText().isEmpty() || t12.getText().isEmpty() || t13.getText().isEmpty() || t14.getText().isEmpty())
           {
               JOptionPane.showMessageDialog(frame, "One or more than textfields are empty, please fill up all the information and try again!!!");
           }
           else
           {
               try
               { 
                   InstrumentName = t10.getText();
                   CustomerName = t11.getText(); 
                   CustomerMobileNumber = t12.getText(); 
                   PANNumber = Integer.parseInt(t13.getText()); 
                   DiscountPercent = Integer.parseInt(t14.getText());
                   String Year2 = cb7.getSelectedItem().toString();
                   String Month2 = cb8.getSelectedItem().toString();
                   String Day2 = cb9.getSelectedItem().toString();
                   String SellDate = Day2 + "|" + Month2 + "|" + Year2;
                   if(IsSold == true)
                   {
                       JOptionPane.showMessageDialog(frame, "The instrument is already sold", "Error", JOptionPane.ERROR_MESSAGE);
                   }
                   else 
                   {
                       for(Instrument obj : IR)
                       {
                           if(obj.getInstrumentName().equals(InstrumentName))
                           {
                               if(obj instanceof InstrumentToSell)
                               {
                                   InstrumentToSell sellObj = (InstrumentToSell)obj; 
                                   sellObj.sellInstrument(CustomerName, CustomerMobileNumber, PANNumber, SellDate, DiscountPercent);
                                   JOptionPane.showMessageDialog(frame, "The instrument has been sold");
                                   IsSold = true;
                                   return;
                               }
                           }
                           else
                           {
                               JOptionPane.showMessageDialog(frame, "The instrument is not in the selling list", "Error", JOptionPane.ERROR_MESSAGE);
                               return;
                           }
                       }
                   }
               }
               catch(NumberFormatException c)
               {    
                   JOptionPane.showMessageDialog(frame, "Only number inputs are accepted in the customer pan number and discount percent section.",
                   "Error", JOptionPane.ERROR_MESSAGE);
               }
           }
        }      
        
        else if(e.getSource() == b11)
        {
            if(IR.isEmpty())
            {
                JOptionPane.showMessageDialog(frame, "Nothing to display!!!");
            }
            else
            {
                for(Instrument d : IR)
                {
                    if(d instanceof InstrumentToSell)
                    {
                        InstrumentToSell dis = (InstrumentToSell)d;
                        d.display();
                    }
                }
            }
        }
        
        else if(e.getSource() == b12)
        {
            t10.setText("");
            t11.setText("");
            t12.setText("");
            t13.setText("");
            t14.setText("");
        }
        
        else if(e.getSource() == b13)
        {
            if(t15.getText().isEmpty())
            {
               JOptionPane.showMessageDialog(frame, "Please enter an instrument name that needs to be returned!!!");
            }
            else if(IsRented == true)
            {
                InstrumentName = t15.getText();
                for(Instrument obj : IR)
                {
                    if(obj.getInstrumentName().equals(InstrumentName))
                    {
                        if(IsReturned == true)
                        {
                            JOptionPane.showMessageDialog(frame, "The instrument is already returned", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        else if(obj instanceof InstrumentToRent)
                        {
                            InstrumentToRent returnObj = (InstrumentToRent)obj; 
                            returnObj.returnInstrument();
                            JOptionPane.showMessageDialog(frame, "The instrument has been returned");
                            IsReturned = true;
                            return;
                        }
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(frame, "Invalid Input!! The instrument is not yet rented.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if(e.getSource() == b14)
        {
            t15.setText("");
        }
    }
    
    public static void main(String[] args)
    {
        new SarangiSansar();
    }
}
