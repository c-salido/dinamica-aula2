import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela3 extends JFrame {
    private boolean encontrado;
    private int posicao;
    public JLabel rotuloResultado = new JLabel("resultados: ");

    public Tela3(boolean encontrado, int posicao) {
        this.encontrado = encontrado;
        this.posicao = posicao;

        initComponents();
        exibirResultado();
    }

    private void initComponents() {
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel rotulo = new JLabel("resultados: ");
        add(rotulo);
        add(rotuloResultado);
        // ... configure seus rótulos e layout aqui ...
    }


    private void exibirResultado() {
        // Aqui você usa 'this.encontrado' e 'this.posicao' para preencher os rótulos (JLabel)
        if (this.encontrado) {
            rotuloResultado.setText("posição: " + posicao);
        } else {
            rotuloResultado.setText("chave não encontrada");
        }
    }
}