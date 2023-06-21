package praktikum.ModulPrakPertemuan8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperasiPertambahan2Angka extends JFrame{
    private JPanel panelMain;
    private JTextField ankga1TF;
    private JTextField angka2TF;
    private JTextField hasilTF;
    private JButton tambahBT;
    private JButton hapusBT;
    private JButton keluarBT;
    private JLabel labelAplikasi;
    private JLabel labelAngka1;
    private JLabel labelAngka2;
    private JLabel labelHasil;

    public void run(){
        JFrame frame = new JFrame("OperasiPertambahan2Angka");
        frame.setContentPane(new OperasiPertambahan2Angka().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.setVisible(true);
    }
public OperasiPertambahan2Angka() {

    tambahBT.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(ankga1TF.getText());
            int b = Integer.parseInt(angka2TF.getText());
            int c = a + b;
            hasilTF.setText(c+"");
        }
    });
    hapusBT.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ankga1TF.setText("");
            angka2TF.setText("");
            hasilTF.setText("");
            ankga1TF.requestFocus();
        }
    });
    keluarBT.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("OperasiPertambahan2Angka");
        frame.setContentPane(new OperasiPertambahan2Angka().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.setVisible(true);
    }
}
