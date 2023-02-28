package classroom_30;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//Criando a tela da calculadora
public class Calculadora extends JFrame {

    //Declarar os componetes da tela
    //Labels
    private final JLabel lbl_valor1;
    private final JLabel lbl_valor2;
    private final JLabel lbl_resultado;

    //Inputs
    private final JTextField txt_valor1;
    private final JTextField txt_valor2;
    private final JTextField txt_resultado;

    //Buttons
    private final JButton btn_somar;
    private final JButton btn_subtrair;
    private final JButton btn_dividir;
    private final JButton btn_multiplicar;

     private final JButton btn_9;
    private final JButton btn_8;
    private final JButton btn_7;
    private final JButton btn_6;
    private final JButton btn_5;
    private final JButton btn_4;
    private final JButton btn_3;
    private final JButton btn_2;
    private final JButton btn_1;
    private final JButton btn_0;
    
    //Declarar váriaveis Globais
    private double valor1;
    private double valor2;

    public Calculadora() {
        //Propriedades da tela
        super.setTitle("Calculadora STEP");
        super.setSize(300, 400);
        super.setLocation(400, 200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Formatar o conteúdo
        super.getContentPane().setBackground(new Color(255, 191, 124));
        super.getContentPane().setLayout(null);//removendo layouts

        //Instanciar os objetos e adicionar ao conteúdo da tela
        //--lbl_valor1
        lbl_valor1 = new JLabel("Valor 1:");
        lbl_valor1.setBounds(40, 20, 100, 25);
        super.getContentPane().add(lbl_valor1);//Adicionando ao conteúdo

        //--txt_valor1
        txt_valor1 = new JTextField(10);//maxlength == 10
        txt_valor1.setBounds(100, 20, 100, 25);
        super.getContentPane().add(txt_valor1);

        //--lbl_valor2
        lbl_valor2 = new JLabel("Valor 2:");
        lbl_valor2.setBounds(40, 60, 100, 25);
        super.getContentPane().add(lbl_valor2);//Adicionando ao conteúdo

        //--txt_valor2
        txt_valor2 = new JTextField(10);//maxlength == 10
        txt_valor2.setBounds(100, 60, 100, 25);
        super.getContentPane().add(txt_valor2);

        //--lbl_resultado
        lbl_resultado = new JLabel("RESULTADO");
        lbl_resultado.setBounds(110, 100, 100, 25);
        super.getContentPane().add(lbl_resultado);//Adicionando ao conteúdo

        //--txt_resultado
        txt_resultado = new JTextField(10);//maxlength == 10
        txt_resultado.setBounds(100, 125, 100, 25);
        super.getContentPane().add(txt_resultado);

        //Botões de operadores
        //Somar
        btn_somar = new JButton("+");
        btn_somar.setBounds(20, 160, 50, 25);
        super.getContentPane().add(btn_somar);

        //Subtrair
        btn_subtrair = new JButton("-");
        btn_subtrair.setBounds(90, 160, 50, 25);
        super.getContentPane().add(btn_subtrair);

        //Multiplicar
        btn_multiplicar = new JButton("x");
        btn_multiplicar.setBounds(160, 160, 50, 25);
        super.getContentPane().add(btn_multiplicar);

        //Dividir
        btn_dividir = new JButton("/");
        btn_dividir.setBounds(230, 160, 50, 25);
        super.getContentPane().add(btn_dividir);

        //---------------------------------------------------
        //Números  
       btn_9 = new JButton("9");
        btn_9.setBounds(20, 200, 50, 25);
        super.getContentPane().add(btn_9);

        btn_8 = new JButton("8");
        btn_8.setBounds(90, 200, 50, 25);
        super.getContentPane().add(btn_8);

        btn_7 = new JButton("7");
        btn_7.setBounds(160, 200, 50, 25);
        super.getContentPane().add(btn_7);

        btn_6 = new JButton("6");
        btn_6.setBounds(160, 240, 50, 25);
        super.getContentPane().add(btn_6);

        btn_5 = new JButton("5");
        btn_5.setBounds(90, 240, 50, 25);
        super.getContentPane().add(btn_5);

        btn_4 = new JButton("4");
        btn_4.setBounds(20, 240, 50, 25);
        super.getContentPane().add(btn_4);

        btn_3 = new JButton("3");
        btn_3.setBounds(160, 280, 50, 25);
        super.getContentPane().add(btn_3);

        btn_2 = new JButton("2");
        btn_2.setBounds(90, 280, 50, 25);
        super.getContentPane().add(btn_2);

        btn_1 = new JButton("1");
        btn_1.setBounds(20, 280, 50, 25);
        super.getContentPane().add(btn_1);

        btn_0 = new JButton("0");
        btn_0.setBounds(90, 320, 50, 25);
        super.getContentPane().add(btn_0);
        //-----------------------------------------------------
        //Colocando os Eventos
        Operador op = new Operador();// Instanciei o operador que escuta evento
        btn_somar.addActionListener(op);
        btn_subtrair.addActionListener(op);
        btn_multiplicar.addActionListener(op);
        btn_multiplicar.addActionListener(op);
        btn_dividir.addActionListener(op);

         btn_1.addActionListener(op);
    }

    public void start() {
        super.setVisible(true);
    }

    public void exit() {
        super.setVisible(false);
    }

    private class Calcula {

        static double somar(double v1, double v2) {
            return v1 + v2;
        }

        static double subtrair(double v1, double v2) {
            return v1 - v2;
        }

        static double multiplicar(double v1, double v2) {
            return v1 * v2;
        }

        static double dividir(double v1, double v2) {
            if (v2 == 0) {
                JOptionPane.showMessageDialog(null,
                        "Não dá pra dividir por zero!");
                return 0;
            }
            return v1 / v2;
        }
    }//---------fim class Calcula

    private class Operador implements ActionListener {
        //Pegando os valores dos inputs

        @Override
        public void actionPerformed(ActionEvent e) {

            if (txt_valor1.getText().equals("") || txt_valor2.getText().equals("")) {

                JOptionPane.showMessageDialog(null,
                        "Favor preencher valor 1 e valor 2!");
            } else {

                //Pegando os valores dos inputs
                valor1 = Double.parseDouble(txt_valor1.getText());
                valor2 = Double.parseDouble(txt_valor2.getText());

                //Vendo se a origem do evento é o btn_somar
                if (e.getSource() == btn_somar) {

                    txt_resultado.setText(String.valueOf(Calcula.somar(valor1, valor2)));
                    txt_valor1.setText("");
                    txt_valor2.setText("");

                } else if (e.getSource() == btn_subtrair) {//Vendo se a origem do evento é o btn_subtrair

                    txt_resultado.setText(String.valueOf(Calcula.subtrair(valor1, valor2)));
                    txt_valor1.setText("");
                    txt_valor2.setText("");

                } else if (e.getSource() == btn_multiplicar) {//Vendo se a origem do evento é o btn_multiplicar

                    txt_resultado.setText(String.valueOf(Calcula.multiplicar(valor1, valor2)));
                    txt_valor1.setText("");
                    txt_valor2.setText("");

                } else if (e.getSource() == btn_dividir) {//Vendo se a origem do evento é o btn_dividir

                    txt_resultado.setText(String.valueOf(Calcula.dividir(valor1, valor2)));
                    txt_valor1.setText("");
                    txt_valor2.setText("");
                }
            }

        }

    }
}
