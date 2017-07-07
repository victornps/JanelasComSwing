package swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GuiMenuPrincipal extends JFrame {

    private Container contentPane;
    private JMenuBar mnBarra;
    private JMenu mnArquivo, mnExemplos;
    private JMenuItem miSair, miBotao, miCaixaOpcao;
    
    public GuiMenuPrincipal() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Menu Principal");
        setBounds(0, 0, 800, 600);
        contentPane = getContentPane();
        
        mnBarra = new JMenuBar();
        
        mnArquivo = new JMenu("Arquivo");
        mnArquivo.setMnemonic(KeyEvent.VK_A);
        mnExemplos = new JMenu("Exemplos");
        mnExemplos.setMnemonic(KeyEvent.VK_E);
        
        miSair = new JMenuItem("Sair");
        miBotao = new JMenuItem("Botão");
        miCaixaOpcao = new JMenuItem("Caixa de Opção");
        
        mnArquivo.add(miSair);
        mnExemplos.add(miBotao);
        mnExemplos.add(miCaixaOpcao);
        
        mnBarra.add(mnArquivo);
        mnBarra.add(mnExemplos);
        
        setJMenuBar(mnBarra);
    }

    private void definirEventos() {
        miSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        miBotao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiBotao panel = new GuiBotao();
                contentPane.removeAll();
                contentPane.add(panel);
                contentPane.validate();
            }
        });
        miCaixaOpcao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GuiCaixaOpcao panel = new GuiCaixaOpcao();
                contentPane.removeAll();
                contentPane.add(panel);
                contentPane.validate();
            }
        });
    }
    
    public static void abrir() {
        GuiMenuPrincipal frame = new GuiMenuPrincipal();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tela.width - frame.getSize().width) / 2;
        int y = (tela.height - frame.getSize().height) / 2;
        frame.setLocation(x, y);
        frame.setVisible(true);
    }
    
}
