package praktikum.ModulPrakPertemuan8;

import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AplikasiPenentuNilaiMahasiswa extends JFrame{
    private JPanel mainPanel;
    private JTextField namaTF;
    private JTextField tmTF;
    private JTextField utsTF;
    private JTextField uasTF;
    private JButton hitungBT;
    private JButton keluarBT;
    private JButton bersihBT;
    private JButton simpanBT;
    private JLabel namaLB;
    private JLabel rataLB;
    private JLabel gradeLB;
    private JLabel hasilLB;

    NilaiMhs2 nm = new NilaiMhs2();


public AplikasiPenentuNilaiMahasiswa() {
    keluarBT.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int reply = JOptionPane.showConfirmDialog(
                    null, "Yakin Ingin Keluar?","Konfirmasi Keluar Aplikasi", JOptionPane.YES_NO_OPTION
            );
            if (reply == JOptionPane.YES_OPTION){
                System.exit(0);
            }else {
                namaTF.requestFocus();
            }
        }
    });
    bersihBT.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            namaTF.setText("");
            tmTF.setText("");
            utsTF.setText("");
            uasTF.setText("");
            namaLB.setText("nama");
            rataLB.setText("rata-rata");
            gradeLB.setText("grade");
            hasilLB.setText("hasil");
            namaTF.requestFocus();
        }
    });


    utsTF.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent evt) {
            super.keyTyped(evt);

            char c = evt.getKeyChar();
            if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)){
                getToolkit().beep();
                JOptionPane.showMessageDialog(null, "Masukkan Hanya 0-100");
                evt.consume();
            }
        }
    });
    hitungBT.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            namaLB.setText(namaTF.getText());
            nm.uts = Double.parseDouble(utsTF.getText());
            nm.tm = Double.parseDouble(tmTF.getText());
            nm.uas = Double.parseDouble(uasTF.getText());
            rataLB.setText(""+nm.nilaiRata());
            gradeLB.setText(""+nm.gradeMhs());
            hasilLB.setText((""+nm.hasil()));
        }
    });
    simpanBT.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            try {
//                File file = new File("C:/Users/mhuwa/Documents/HitungNilai.txt");
                BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/mhuwa/Documents/HitungNilai.txt"));
                String hasil = namaLB.getText() + " " + "\n" +rataLB.getText() + "\n" + gradeLB.getText() + "\n" +hasilLB.getText();
                out.write(hasil);
                JOptionPane.showMessageDialog(null, "Berhasil disimpan dalam file");
                out.close();
            }catch (Exception e){
                System.err.println(("Error : " + e.getMessage()));
            }
        }
    });
}

    public static void main(String[] args) {
        JFrame frame = new JFrame("AplikasiPenentuNilaiMahasiswa");
        frame.setContentPane(new AplikasiPenentuNilaiMahasiswa().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setSize(600, 300);
        frame.setVisible(true);
    }
}
