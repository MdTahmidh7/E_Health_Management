package App;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_Doctor extends LayCon{

    private JLabel doctorId_JL,type_jL,name_JL,password_JL,qualification_JL,
                  mobileNumber_JL,emailId_JL;

    private JTextField doctorId_TF,name_TF,qualification_TF,
            mobileNumber_TF,emailId_TF;

    private JPasswordField passwordField;
    private JComboBox type_ComboBox;
    private  Font JLabel_font,TField_font;
    private JButton submit_button,reset_button;
    Add_Doctor() {
        super.frame();
        super.setTitle("Add Doctor");
        super.container();
        initcomponents();
    }
    public void initcomponents(){

        button1.setText("View Doctor");
        button2.setText("View Patient");
        button3.setText("View Feedback");
        button4.setText("logout");



        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View_Doctor view_doctor = new View_Doctor();
                view_doctor.setVisible(true);
                dispose();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View_UserFor_Admin view_userFor_admin = new View_UserFor_Admin();
                view_userFor_admin.setVisible(true);
                dispose();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View_Feedback view_feedback = new View_Feedback();
                view_feedback.setVisible(true);
                dispose();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main logIn_page = new Main();
                logIn_page.setVisible(true);
                dispose();
            }
        });

        JLabel_font = new Font("Arial",Font.BOLD,25);
        doctorId_JL = new JLabel("Doctor ID");
        doctorId_JL.setBounds(180,250,150,40);
        doctorId_JL.setFont(JLabel_font);
        container.add(doctorId_JL);

        type_jL = new JLabel("Type ");
        type_jL.setBounds(180,300,150,40);
        type_jL.setFont(JLabel_font);
        container.add(type_jL);


        name_JL = new JLabel("Name ");
        name_JL.setBounds(180,350,150,40);
        name_JL.setFont(JLabel_font);
        container.add(name_JL);


        password_JL = new JLabel("Password");
        password_JL.setBounds(180,400,150,40);
        password_JL.setFont(JLabel_font);
        container.add(password_JL);

        qualification_JL = new JLabel("Qualification");
        qualification_JL.setBounds(180,450,150,40);
        qualification_JL.setFont(JLabel_font);
        container.add(qualification_JL);


        mobileNumber_JL = new JLabel("Mobile Number");
        mobileNumber_JL.setBounds(180,500,250,40);
        mobileNumber_JL.setFont(JLabel_font);
        container.add(mobileNumber_JL);


        emailId_JL = new JLabel("Email ID");
        emailId_JL.setBounds(180,550,250,40);
        emailId_JL.setFont(JLabel_font);
        container.add( emailId_JL);



        TField_font = new Font("Arial",Font.BOLD,13);
        doctorId_TF = new JTextField();
        doctorId_TF.setBounds(450,250,200,40);
        doctorId_TF.setFont(TField_font);
        container.add(doctorId_TF);


        type_ComboBox = new JComboBox();
        type_ComboBox.setBounds(450,300,200,40);
        type_ComboBox.addItem("Heart");
        type_ComboBox.addItem("Bone");
        type_ComboBox.addItem("Lungh");
        type_ComboBox.addItem("Kidney");
        type_ComboBox.addItem("<-Select Type->");
        type_ComboBox.setSelectedItem("<-Select Type->");
        container.add(type_ComboBox);

        name_TF = new JTextField();
        name_TF.setBounds(450,350,200,40);
        name_TF.setFont(TField_font);
        container.add(name_TF);


        passwordField = new JPasswordField();
        passwordField.setBounds(450,400,200,40);
        passwordField.setFont(JLabel_font);
        container.add(passwordField);


        qualification_TF = new JTextField();
        qualification_TF.setBounds(450,450,200,40);
        qualification_TF.setFont(TField_font);
        container.add(qualification_TF);


        mobileNumber_TF = new JTextField();
        mobileNumber_TF.setBounds(450,500,200,40);
        mobileNumber_TF.setFont(TField_font);
        container.add(mobileNumber_TF);


        emailId_TF = new JTextField();
        emailId_TF.setBounds(450,550,200,40);
        emailId_TF.setFont(TField_font);
        container.add(emailId_TF);


        submit_button = new JButton("Submit");
        submit_button.setBounds(400,660,100,40);
        container.add(submit_button);


        reset_button = new JButton("Reset");
        reset_button.setBounds(550,660,100,40);
        container.add(reset_button);




    }
}
