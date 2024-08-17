package edu.nayderson;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InterfaceGraficaJava {
    public static void main(String[] args) {
        // Criando o frame (janela)
        JFrame frame = new JFrame("Minha Primeira Interface Gráfica");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criando um painel
        JPanel panel = new JPanel();

        // Criando um botão
        JButton button = new JButton("Clique em mim!");

        // Adicionando ação ao botão
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Você clicou no botão!"));

        // Adicionando o botão ao painel
        panel.add(button);

        // Adicionando o painel ao frame
        frame.add(panel);

        // Tornando a interface visível
        frame.setVisible(true);
    }
}
