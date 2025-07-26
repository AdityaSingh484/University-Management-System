package university.management.system;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class menu extends JFrame implements ActionListener{
    menu() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb = new JMenuBar();

        // new information
        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.black);
        mb.add(newInfo);



        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInfo.add(studentInfo);

        // Details

        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        details.addActionListener(this);
        mb.add(details);


        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);



        // Exams
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        exam.addActionListener(this);
        mb.add(exam);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Results");
        ExaminationDetails.setBackground(Color.WHITE);
        ExaminationDetails.addActionListener(this);
        exam.add(ExaminationDetails);

        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.WHITE);
        EnterMarks.addActionListener(this);
        exam.add(EnterMarks);


        // exit

        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem Exit = new JMenuItem("Exit");
        Exit.setBackground(Color.WHITE);
        Exit.addActionListener(this);
        exit.add(Exit);

        setJMenuBar(mb);


        setSize(1540, 850);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        if (sm.equals("Exit")) {
            System.exit(15);
        } else if (sm.equals("New Student Information")) {
            new AddStudent();
        } else if (sm.equals("View Student Details")) {
            new StudentDetails();
        } else if (sm.equals("Enter Marks")) {
            new EnterMarks();
        } else if (sm.equals("Examination Results")) {
            new ExaminationDetails();
        }
    }

    public static void main(String[]args) {
        new menu();

    }
}
