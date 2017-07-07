package swing;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GuiBotao extends JPanel {

    private JButton btMensagem;

    public GuiBotao() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);
        
        btMensagem = new JButton("Mensagem");
        btMensagem.setBounds(50, 20, 140, 38);
        add(btMensagem);
    }

    private void definirEventos() {}
    
    
    
}
