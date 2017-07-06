package swing;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GuiLogin extends JFrame {

    private static GuiLogin frame;
    private JLabel lbLogin;

    public GuiLogin() {
        inicializarComponentes();
        definirEventos();
    }
    
    private void inicializarComponentes() {
        setTitle("Login no Sistema");
        setBounds(0, 0, 250, 200);
        setLayout(null);
        
        lbLogin = new JLabel("Login");
        lbLogin.setBounds(30, 30, 80, 25);
        add(lbLogin);
    }
    
    private void definirEventos() {}
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame = new GuiLogin();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                int x = (tela.width - frame.getSize().width) / 2;
                int y = (tela.height - frame.getSize().height) / 2;
                frame.setLocation(x, y);
                frame.setVisible(true);
            }
        });
    }
    
}
