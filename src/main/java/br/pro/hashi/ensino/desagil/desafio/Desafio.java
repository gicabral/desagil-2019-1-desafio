package br.pro.hashi.ensino.desagil.desafio;

import br.pro.hashi.ensino.desagil.desafio.model.Model;

import javax.swing.*;
import java.io.IOException;

public class Desafio {
    public static void main(String[] args) throws IOException {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);

        // Estrutura básica de um programa Swing.
        SwingUtilities.invokeLater(() -> {

            // Constrói a janela.
            JFrame frame = new JFrame();

            // Adiciona a visão à janela.
            frame.setContentPane(view);

            // Configura a janela para encerrar o programa quando for fechada.
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Configura a janela para não ser manualmente redimensionável.
            frame.setResizable(false);

            // Redimensiona a janela de acordo com o tamanho de seu conteúdo.
            frame.pack();

            // Exibe a janela.
            frame.setVisible(true);

            Timer timer = new Timer(100, controller);
            timer.start();
        });
    }
}
