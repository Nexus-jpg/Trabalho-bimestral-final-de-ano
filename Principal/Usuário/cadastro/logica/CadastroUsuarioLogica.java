package Principal.Usuário.cadastro.logica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroUsuarioLogica {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro de Usuário");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);

        JLabel textoNome = new JLabel("Nome completo:");
        textoNome.setBounds(30, 25, 120, 25);
        janela.add(textoNome);

        JTextField campoNome = new JTextField();
        campoNome.setBounds(150, 25, 200, 25);
        janela.add(campoNome);

        JLabel textoCpf = new JLabel("CPF:");
        textoCpf.setBounds(30, 70, 120, 25);
        janela.add(textoCpf);

        JTextField campoCpf = new JTextField();
        campoCpf.setBounds(150, 70, 200, 25);
        janela.add(campoCpf);

        JLabel textoSenha = new JLabel("Senha:");
        textoSenha.setBounds(30, 115, 120, 25);
        janela.add(textoSenha);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(150, 115, 200, 25);
        janela.add(campoSenha);

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(130, 175, 140, 35);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText().trim();
                String cpf = campoCpf.getText().trim();
                char[] senha = campoSenha.getPassword();

                if (nome.isEmpty() || cpf.isEmpty() || senha.length == 0) {
                    JOptionPane.showMessageDialog(
                        janela,
                        "Preencha o nome, o CPF e a senha.",
                        "Campos obrigatórios",
                        JOptionPane.WARNING_MESSAGE
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        janela,
                        "Cadastro realizado com sucesso para o usuário: " + nome
                    );
                }
            }
        });

        janela.add(botaoCadastrar);
        janela.setVisible(true);
    }
}
