package App;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View_Doctor extends LayCon{

    private JLabel view_doctor;
    private Font font;
    private TextArea textArea;

    View_Doctor() {
        super.frame();
        super.setTitle("View Doctor");
        super.container();
        initcomponents();
    }

public void initcomponents(){

    button1.setText("***");
    button2.setText("View Feedback");
    button3.setText("Home");
    button4.setText("***");


    font = new Font("Artial",Font.BOLD,25);
    view_doctor = new JLabel();
    view_doctor.setText("View Doctor");
    view_doctor.setBounds(470,200,200,80);
    view_doctor.setFont(font);
    container.add(view_doctor);

    textArea = new TextArea("Doctors list will be here", 500, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
    textArea.setBounds(300,300,500,400);
    textArea.setFont(font);
    textArea.setEditable(false);
    container.add(textArea);


    button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            View_Feedback view_feedback = new View_Feedback();
            view_feedback.setVisible(true);
            dispose();
        }
    });

    button3.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Add_Doctor add_doctor = new Add_Doctor();
            add_doctor.setVisible(true);
            dispose();
        }
    });


}

    /*public static void main(String[] args) {
        View_Doctor v = new View_Doctor();
        v.setVisible(true);
    }*/
}
