import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela2 extends JFrame{
    private JLabel rotulo;
    private JTextField campoTexto;
    private JButton button;

    private Tela1 tela1;

    public Tela2(Tela1 tela1){
        this.tela1 = tela1;
        Janela();
        InitComponents();
        Eventos();
    }

    private void Janela(){
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    private void InitComponents(){
        rotulo = new JLabel("digite um número inteiro: ");
        campoTexto = new JTextField(3);
        button = new JButton("Entra");

        add(rotulo);
        add(campoTexto);
        add(button);
    }

    private void Eventos(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento) {
                Busca();
            }
        });

        campoTexto.addActionListener(evento -> Busca());
    }

    // public String getChave(){ 
    //     return campoTexto.getText().trim();
    // }

    private void Busca() {
        String texto = campoTexto.getText().trim();
        Integer chave = Integer.parseInt(texto);
        int[] num = tela1.getNum();
        // int[] num = t1.getNum();
        boolean encontrado = false;
        int posicao = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == chave) {
                encontrado = true;
                posicao = i;
                break;

                }
        }

        Tela3 j3 = new Tela3(encontrado, posicao);
        j3.setVisible(true);
        this.dispose();
    }
    // public static void main(String[] args) {
    //     SwingUtilities.invokeLater(() -> {
    //         Tela2 tela = new Tela2();
    //         tela.setVisible(true);
    //     });
    // }
}
