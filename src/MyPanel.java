import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class MyPanel extends JPanel implements ActionListener {

    Convertitore c1;
    JTextField txtNumDaConv, txtNumConvert;
    JButton btnConverti;

    public MyPanel(){
        c1 = new Convertitore(0);
        txtNumDaConv = new JTextField();
        txtNumConvert = new JTextField();
        txtNumConvert.setEditable(false);
        btnConverti = new JButton("Converti in binario");
        btnConverti.addActionListener(this);
        add(txtNumDaConv);
        add(txtNumConvert);
        add(btnConverti);
        setLayout(new GridLayout(3,1));
    }

    public void actionPerformed(ActionEvent e)
    {
        Object pulsantePremuto = e.getSource();

        if(pulsantePremuto==btnConverti)
        {
            int x = parseInt(txtNumDaConv.getText());
            c1.setNumeroDaConvertire(x);
            txtNumConvert.setText(c1.converti());
        }
    }
}