package praktikum.ModulPrakPertemuan8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class PenentuJumlahHari {
    private JPanel mainPanel;
    private JTextField tahunTf;
    private JComboBox bulanCb;
    private JButton hitungBtn;
    private JButton keluarBtn;
    private JButton hapusBtn;
    private JButton simpanBtn;
    private JLabel hasiHitungLb;

    HitunganHari hitung = new HitunganHari();


    public PenentuJumlahHari() {
        hitungBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                int thn = Integer.parseInt(tahunTf.getText());
                hitung.inputBulan = bulanCb.getSelectedItem().toString();
                hitung.cekBulan();
                hitung.hitung(thn);

                hasiHitungLb.setText("Jumlah Hari pada bulan " + bulanCb.getSelectedItem().toString()
                        + " tahun " + thn + " adalah " + hitung.jumlahHari);
            }
        });
        hapusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                tahunTf.setText("");
                bulanCb.setSelectedItem("");
                hasiHitungLb.setText("");
                tahunTf.requestFocus();
            }
        });
        simpanBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/mhuwa/Documents/HitungHari.txt"));
                    String hasilSaving = "Tahun : " + tahunTf.getText() + "\nBulan : " + bulanCb.getSelectedItem().toString() +
                            "\nJumlah Hari pada bulan " + bulanCb.getSelectedItem().toString() + " tahun " + tahunTf.getText() +
                            " adalah " + hitung.jumlahHari;
                    out.write(hasilSaving);
                    JOptionPane.showMessageDialog(null,"Berhasil disimpan dalam file");
                    out.close();
                }catch (Exception e){
                    System.err.println(("Error : " + e.getMessage()));
                }
            }
        });
        keluarBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int reply = JOptionPane.showConfirmDialog(
                        null, "Yakin Ingin Keluar?", "Konfirmasi Keluar Aplikasi", JOptionPane.YES_NO_OPTION
                );
                if (reply == JOptionPane.YES_OPTION){
                    System.exit(0);
                }else {
                    tahunTf.requestFocus();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("PenentuanJumlahHari");
        frame.setContentPane(new PenentuJumlahHari().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setSize(650, 330);
        frame.setVisible(true);
    }
}


