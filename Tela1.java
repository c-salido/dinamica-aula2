import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tela1 extends JFrame {
    private JTextField[] campusNumeros;
    private JButton botao;
    private int[] num;

    public Tela1() {
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.add(new JLabel("Digite 8:"));
        campusNumeros = new JTextField[8];
        num = new int[8];
        for (int i = 0; i < 8; i++) {
            JPanel linha = new JPanel(new FlowLayout(FlowLayout.LEFT));
            linha.add(new JLabel("N" + (i + 1) + ":"));
            campusNumeros[i] = new JTextField(10);
            linha.add(campusNumeros[i]);
            painelPrincipal.add(linha);
        }
        botao = new JButton("Entra");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    for (int i = 0; i < 8; i++) {
                        if (campusNumeros[i].getText() == null || campusNumeros[i].getText().isEmpty()) {
                            throw new Exception("Campo " + (i + 1) + " vazio");
                        }
                        try {
                            Integer.parseInt(campusNumeros[i].getText());
                        } catch (NumberFormatException ex) {
                            throw new Exception("Campo " + (i + 1) + " nao inteiro");
                        }
                    }
                    
                    for (int i = 0; i < 8; i++) {
                        num[i] = Integer.parseInt(campusNumeros[i].getText());
                    }
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 7 - i; j++) {
                            if (num[j] > num[j + 1]) {
                                int temp = num[j];
                                num[j] = num[j + 1];
                                num[j + 1] = temp;
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(Tela1.this, "Entrou", "Entrou", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(Tela1.this, ex.getMessage(), "Erro na Entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        painelPrincipal.add(botao);
        add(painelPrincipal);
        setVisible(true);
    }

    public int[] getNum(){
        return this.num;
    }
    
    public static void main(String[] args) {
        new Tela1();
    }
}
