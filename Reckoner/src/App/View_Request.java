package App;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_Request extends LayCon{

    private JLabel pending_request;
    private Font font,font1;
    private JComboBox seeALLRequest;
    private JButton viewDetails;
    private JFrame f;
    View_Request(){
        super.frame();
        super.setTitle("Patient Chat Box");
        super.container();
        initcomponents();
    }

    public void initcomponents(){

        button1.setText("***");
        button2.setText("View Patient");
        button3.setText("Home");
        button4.setText("***");

        font = new Font("Arial",Font.BOLD,27);
        font1 = new Font("Arial",Font.BOLD,15);
        pending_request = new JLabel("Pending Request");
        pending_request.setBounds(450,200,300,80);
        pending_request.setFont(font);
        container.add(pending_request);


        seeALLRequest = new JComboBox();
        seeALLRequest.setBounds(330,300,250,30);
        seeALLRequest.addItem("Saju");
        seeALLRequest.addItem("Raju");
        seeALLRequest.addItem("xyz");
        seeALLRequest.addItem("See Patient List");
        seeALLRequest.setFont(font1);
        seeALLRequest.setSelectedItem("See Patient List");
        container.add(seeALLRequest);

        viewDetails = new JButton("Accept Request");
        viewDetails.setBounds(630,300,150,30);
        viewDetails.setFont(font1);
        container.add(viewDetails);

        viewDetails.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Doctor_ChatBox doctor_chatBox = new Doctor_ChatBox();
                doctor_chatBox.setVisible(true);
                dispose();
            }
        });




        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Details details = new Details();
                details.setVisible(true);
                dispose();
            }
        });



        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                View_User view_user = new View_User();
                view_user.setVisible(true);
                dispose();
            }
        });


    }
    /*public static void main(String[] args) {
        View_Request view_request = new View_Request();
        view_request.setVisible(true);
    }*/
}
