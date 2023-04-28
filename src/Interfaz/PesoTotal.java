/*TRABAJO JAVA SWING, GESTOR DE CONTENEDORES
 * ALBERTO PÉREZ ÁLVAREZ
 */

package B04.Interfaz;

import B04.PaqB04.Puerto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PesoTotal extends JFrame{
    private JButton button1;
    private JTextField pesoTotalText;
    private JPanel pesoPanel;

    public PesoTotal(Puerto p1){
        setTitle("PESO TOTAL");
        setSize(1200,720);
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);
        setContentPane(pesoPanel);
        pesoTotalText.setText(String.valueOf(p1.pesoTotal())+" Toneladas");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
            }
        });
    }
}
