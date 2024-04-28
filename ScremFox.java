import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScremFox extends JFrame implements ActionListener {
    private JTextField quantField;
    private JLabel resultadoLabel;

    public ScremFox() {
        setVisible(true);
        setSize(400, 200);
        setTitle("PassFox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel label = new JLabel("Quantidade de caracteres:");
        label.setBounds(20, 20, 180, 30);
        add(label);

        quantField = new JTextField();
        quantField.setBounds(200, 20, 100, 30);
        add(quantField);

        JButton gerarButton = new JButton("Gerar");
        gerarButton.setBounds(20, 80, 100, 30);
        gerarButton.addActionListener(this);
        add(gerarButton);

        resultadoLabel = new JLabel();
        resultadoLabel.setBounds(130, 80, 250, 30);
        add(resultadoLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int quant = Integer.parseInt(quantField.getText());
        String senha = PassFox.gerarSenha(quant);
        resultadoLabel.setText("Senha gerada: " + senha);
    }

    public static void main(String[] args) {
        new ScremFox();
    }
}
