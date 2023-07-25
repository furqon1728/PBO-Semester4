package Uas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mahasiswa3 extends JFrame{
    private JPanel panel1;
    private JTextField nimTf;
    private JTextField namaTf;
    private JTextField nilaiAbsenTf;
    private JTextField nilaiTugasTf;
    private JTextField nilaiUtsTf;
    private JTextField nilaiUasTf;
    private JLabel nilaiAkhirLb;
    private JLabel gradeLb;
    private JButton HITUNGButton;
    private JButton HAPUSButton;
    private JButton KELUARButton;

    Mahasiswa2 mhs = new Mahasiswa2();



    public Mahasiswa3() {
        HITUNGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mhs.nilaiAbsen = Double.parseDouble(nilaiAbsenTf.getText());
                mhs.nilaiTugas = Double.parseDouble(nilaiTugasTf.getText());
                mhs.nilaiUts = Double.parseDouble(nilaiUtsTf.getText());
                mhs.nilaiUas = Double.parseDouble(nilaiUasTf.getText());
                nilaiAkhirLb.setText(""+mhs.NilaiAkhir(mhs.nilaiAbsen, mhs.nilaiTugas, mhs.nilaiUts, mhs.nilaiUas));
                gradeLb.setText(""+mhs.Grade());
            }
        });
        HAPUSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nimTf.setText("");
                namaTf.setText("");
                nilaiAbsenTf.setText("");
                nilaiTugasTf.setText("");
                nilaiUtsTf.setText("");
                nilaiUasTf.setText("");
                gradeLb.setText("");
                nilaiAkhirLb.setText("");
                nimTf.requestFocus();
            }
        });
        KELUARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(
                        null, "Yakin Ingin Keluar?","Konfirmasi Keluar Aplikasi", JOptionPane.YES_NO_OPTION
                );
                if (reply == JOptionPane.YES_OPTION){
                    System.exit(0);
                }else {
                    nimTf.requestFocus();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mahasiswa3");
        frame.setContentPane(new Mahasiswa3().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
