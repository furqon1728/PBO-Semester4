package praktikum.ModulPrakPertemuan8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class AplikasiKalkulator {
    private JPanel mainPanel;
    private JButton btnEmpat;
    private JButton btnLima;
    private JButton btnEnam;
    private JButton btnSatu;
    private JButton btnDua;
    private JButton btnTiga;
    private JButton btnTitik;
    private JButton btnPlus;
    private JButton btnMin;
    private JButton btnKali;
    private JButton btnBagi;
    private JButton btnSamaDengan;
    private JButton btnPersen;
    private JButton btnNol;
    private JButton btnClear;
    private JButton btnB;
    private JButton btnE;
    private JButton btnSembilan;
    private JButton btnTujuh;
    private JButton btnDelapan;
    private JTextField outputTf;
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char operatorMtk;
    private void getOperator(String btnText){
        operatorMtk = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(outputTf.getText());
        outputTf.setText("");
    }


    public AplikasiKalkulator() {
        btnSatu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSatuText = outputTf.getText() + btnSatu.getText();
                outputTf.setText(btnSatuText);
            }
        });
        btnDua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDuaText = outputTf.getText() + btnDua.getText();
                outputTf.setText(btnDuaText);
            }
        });
        btnTiga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTigaText = outputTf.getText() + btnTiga.getText();
                outputTf.setText(btnTigaText);
            }
        });
        btnEmpat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEmpatText = outputTf.getText() + btnEmpat.getText();
                outputTf.setText(btnEmpatText);
            }
        });
        btnLima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnLimaText = outputTf.getText() + btnLima.getText();
                outputTf.setText(btnLimaText);
            }
        });
        btnEnam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEnamText = outputTf.getText() + btnEnam.getText();
                outputTf.setText(btnEnamText);
            }
        });
        btnTujuh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTujuhText = outputTf.getText() + btnTujuh.getText();
                outputTf.setText(btnTujuhText);
            }
        });
        btnDelapan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDelapanText = outputTf.getText() + btnDelapan.getText();
                outputTf.setText(btnDelapanText);
            }
        });
        btnSembilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSembilanText = outputTf.getText() + btnSembilan.getText();
                outputTf.setText(btnSembilanText);
            }
        });

        btnNol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNolText = outputTf.getText() + btnNol.getText();
                outputTf.setText(btnNolText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMin.getText();
                getOperator(button_text);
            }
        });
        btnBagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnBagi.getText();
                getOperator(button_text);
            }
        });
        btnKali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnKali.getText();
                getOperator(button_text);
            }
        });
        btnPersen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPersen.getText();
                getOperator(button_text);
            }
        });
        btnSamaDengan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operatorMtk){
                    case '+':
                        total2 = total1 + Double.parseDouble(outputTf.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(outputTf.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(outputTf.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(outputTf.getText());
                        break;
                    case '%':
                        total2 = total1 % Double.parseDouble(outputTf.getText());
                        break;
//                        B akan menghitung Pangkat
                    case 'B':
                        total2 = Math.pow(total1, Double.parseDouble((outputTf.getText())));
                        break;
                }
                outputTf.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                outputTf.setText("");
            }
        });
        btnTitik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (outputTf.getText().equals("")){
                    outputTf.setText("0.");
                } else if (outputTf.getText().contains(".")) {
                    btnTitik.setEnabled(false);
                }else {
                    String btnTitikText = outputTf.getText() + btnTitik.getText();
                    outputTf.setText(btnTitikText);
                }
                btnTitik.setEnabled(true);
            }
        });
        btnE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = total1 + Double.parseDouble(outputTf.getText());
                double hasilAkar = Math.sqrt(total1);
                outputTf.setText(Double.toString(hasilAkar));
            }
        });
        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnB.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AplikasiKalkulator");
        frame.setContentPane(new AplikasiKalkulator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
