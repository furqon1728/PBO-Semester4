package praktikum.ModulPrakPertemuan8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends OperasiPertambahan2Angka{
    private JPanel loginPanel;
    private JTextField userTF;
    private JButton loginBtn;
    private JLabel idLabel;
    private JLabel pwLabel;
    private JPasswordField passwordTF;

    public Login() {
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((userTF.getText().equals("ultach")) && (String.valueOf(passwordTF.getPassword()).equals("ultach"))){
                   OperasiPertambahan2Angka obj = new OperasiPertambahan2Angka();
                   obj.run();
                   dispose();
                }else {
                    JOptionPane.showMessageDialog(null,userTF.getText()+",password anda salah","pesan kesalahan",JOptionPane.ERROR_MESSAGE);
                    userTF.setText("");
                    passwordTF.setText("");
                    userTF.requestFocus();
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("OperasiPertambahan2Angka");
        frame.setContentPane(new Login().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setVisible(true);
    }
}
