import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela3 extends JFrame{
    private boolean encontrado;
    private int posicao;
    public JLabel rotuloResultado = new JLabel("resultados: ");

    public Tela3(boolean encontrado, int posicao) {
        this.encontrado = encontrado;
        this.posicao = posicao;

        InitComponents();
        Resultados();
    }

    private void InitComponents(){
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(rotuloResultado);
    }


    private void Resultados(){
        if (this.encontrado) {
            rotuloResultado.setText("posição: " + posicao);
        } else {
            rotuloResultado.setText("chave não encontrada");
        }
    }
}