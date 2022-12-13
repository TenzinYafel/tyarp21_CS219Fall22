package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIPanel extends JPanel {
    private JTextField zipcode;
    private JButton submit;
    private JTextArea output;

    private Database db; // the zipcode database.
    private JButton Nothernmost;

    public GUIPanel() {
        this.zipcode = new JTextField("enter a zipcode", 10);
        this.add(this.zipcode);

        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener1());

        this.Nothernmost = new JButton("Northernmost");
        this.add(this.Nothernmost);
        this.Nothernmost.addActionListener(new SubmitButtonListener());

        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.db = new Database(); // load the zipcodes

    }
    class SubmitButtonListener1 implements ActionListener{
        private ActionEvent e;

        public void actionPerformed(ActionEvent e){
            // function will get called when the user presses submit
            // get the zipcode out of the text field
            String code = zipcode.getText();

            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
        }
    }
    class SubmitButtonListener implements ActionListener{
        private ActionEvent d;

        public void actionPerformed(ActionEvent d){
            // function will get called when the user presses submit
            // get the zipcode out of the text field
            String code = zipcode.getText();
            Zipcode xc = db.search(code);
            ExamDB obs = xc.getNorthern();
            output.setText(obs.toString());
        }
    }
}
