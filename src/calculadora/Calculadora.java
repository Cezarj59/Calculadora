package calculadora;

import calculadora.tela2.Tela2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {

    private final JLabel lbl_titulo;

    private final JTextField txt_visor;
    private final JTextField txt_visor2;

    private final JButton btn_0;
    private final JButton btn_1;
    private final JButton btn_2;
    private final JButton btn_3;
    private final JButton btn_4;
    private final JButton btn_5;
    private final JButton btn_6;
    private final JButton btn_7;
    private final JButton btn_8;
    private final JButton btn_9;

    private final JButton btn_soma;
    private final JButton btn_subtrai;
    private final JButton btn_multiplica;
    private final JButton btn_divide;
    private final JButton btn_igual;
    private final JButton btn_virgula;
    private final JButton btn_inverte;
    private final JButton btn_delete;
    private final JButton btn_c;
    
    private final JButton tela2;
    
    

    private double valor1 = 0;
    private String operador = "";

    public Calculadora() {
        //JANELA
        super.getContentPane().setLayout(null);
        super.getContentPane().setBackground(new Color(28, 28, 28));
        super.setSize(370, 380);
        super.setTitle("Calculadora Step");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setLocation(200, 200);

        //Titulo LABEL
        lbl_titulo = new JLabel("CALCULADORA");
        lbl_titulo.setBounds(145, -8, 320, 40);
        lbl_titulo.setForeground(new Color(255, 255, 255));
        super.getContentPane().add(lbl_titulo);

        //VISOR
        txt_visor = new JTextField(15);
        txt_visor.setBounds(40, 55, 302, 40);
        txt_visor.setHorizontalAlignment(JTextField.RIGHT);
        txt_visor.setBorder(null);
        txt_visor.setFont(new Font("Roboto", Font.BOLD, 24));
        txt_visor.setBackground(Color.BLACK);
        txt_visor.setForeground(Color.WHITE);
        super.getContentPane().add(txt_visor);

        txt_visor2 = new JTextField(15);
        txt_visor2.setBounds(40, 20, 302, 40);
        txt_visor2.setEnabled(false);
        txt_visor2.setHorizontalAlignment(JTextField.RIGHT);
        txt_visor2.setFont(new Font("Roboto", Font.BOLD, 15));
        txt_visor2.setBackground(Color.BLACK);
        txt_visor2.setForeground(Color.WHITE);
        txt_visor2.setBorder(null);
        super.getContentPane().add(txt_visor2);

        //LINHA 1-----------------------------------------------
        btn_divide = new JButton("/");
        btn_divide.setBounds(290, 100, 55, 40);
        btn_divide.setBackground(Color.BLACK);
        btn_divide.setForeground(Color.WHITE);
        super.getContentPane().add(btn_divide);

        btn_delete = new JButton("<x");
        btn_delete.setBounds(200, 100, 55, 40);
        btn_delete.setFont(new Font("Roboto", Font.BOLD, 14));
        btn_delete.setBackground(new Color(255, 0, 0));
        btn_delete.setForeground(Color.WHITE);
        super.getContentPane().add(btn_delete);
        
           //---------------------
        tela2 = new JButton("T2");
        tela2.setBounds(120, 100, 55, 40);
        super.getContentPane().add(tela2);
        
        //-----------------------

        btn_c = new JButton("C");
        btn_c.setBounds(40, 100, 55, 40);
        btn_c.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_c.setBackground(Color.GRAY);
        btn_c.setForeground(Color.WHITE);
        super.getContentPane().add(btn_c);

        //LINHA 2--------------------------------------------
        btn_7 = new JButton("7");
        btn_7.setBounds(40, 145, 55, 40);
        btn_7.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_7.setBackground(Color.BLACK);
        btn_7.setForeground(Color.WHITE);
        super.getContentPane().add(btn_7);

        btn_8 = new JButton("8");
        btn_8.setBounds(120, 145, 55, 40);
        btn_8.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_8.setBackground(Color.BLACK);
        btn_8.setForeground(Color.WHITE);
        super.getContentPane().add(btn_8);

        btn_9 = new JButton("9");
        btn_9.setBounds(200, 145, 55, 40);
        btn_9.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_9.setBackground(Color.BLACK);
        btn_9.setForeground(Color.WHITE);
        super.getContentPane().add(btn_9);

        btn_multiplica = new JButton("x");
        btn_multiplica.setBounds(290, 145, 55, 40);
        btn_multiplica.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_multiplica.setBackground(Color.BLACK);
        btn_multiplica.setForeground(Color.WHITE);
        super.getContentPane().add(btn_multiplica);

        //LINHA 3--------------------------------------------
        btn_4 = new JButton("4");
        btn_4.setBounds(40, 190, 55, 40);
        btn_4.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_4.setBackground(Color.BLACK);
        btn_4.setForeground(Color.WHITE);
        super.getContentPane().add(btn_4);

        btn_5 = new JButton("5");
        btn_5.setBounds(120, 190, 55, 40);
        btn_5.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_5.setBackground(Color.BLACK);
        btn_5.setForeground(Color.WHITE);
        super.getContentPane().add(btn_5);

        btn_6 = new JButton("6");
        btn_6.setBounds(200, 190, 55, 40);
        btn_6.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_6.setBackground(Color.BLACK);
        btn_6.setForeground(Color.WHITE);
        super.getContentPane().add(btn_6);

        btn_subtrai = new JButton("-");
        btn_subtrai.setBounds(290, 190, 55, 40);
        btn_subtrai.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_subtrai.setBackground(Color.BLACK);
        btn_subtrai.setForeground(Color.WHITE);
        super.getContentPane().add(btn_subtrai);

        //LINHA 4--------------------------------------------
        btn_1 = new JButton("1");
        btn_1.setBounds(40, 235, 55, 40);
        btn_1.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_1.setBackground(Color.BLACK);
        btn_1.setForeground(Color.WHITE);
        super.getContentPane().add(btn_1);

        btn_2 = new JButton("2");
        btn_2.setBounds(120, 235, 55, 40);
        btn_2.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_2.setBackground(Color.BLACK);
        btn_2.setForeground(Color.WHITE);
        super.getContentPane().add(btn_2);

        btn_3 = new JButton("3");
        btn_3.setBounds(200, 235, 55, 40);
        btn_3.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_3.setBackground(Color.BLACK);
        btn_3.setForeground(Color.WHITE);
        super.getContentPane().add(btn_3);

        btn_soma = new JButton("+");
        btn_soma.setBounds(290, 235, 55, 40);
        btn_soma.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_soma.setBackground(Color.BLACK);
        btn_soma.setForeground(Color.WHITE);
        super.getContentPane().add(btn_soma);

        //LINHA 5--------------------------------------------
        btn_0 = new JButton("0");
        btn_0.setBounds(120, 280, 55, 40);
        btn_0.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_0.setBackground(Color.BLACK);
        btn_0.setForeground(Color.WHITE);
        super.getContentPane().add(btn_0);

        btn_igual = new JButton("=");
        btn_igual.setBounds(290, 280, 55, 40);
        btn_igual.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_igual.setBackground(Color.GREEN);
        super.getContentPane().add(btn_igual);

        btn_virgula = new JButton(",");
        btn_virgula.setBounds(200, 280, 55, 40);
        btn_virgula.setFont(new Font("Roboto", Font.BOLD, 18));
        btn_virgula.setBackground(Color.BLACK);
        btn_virgula.setForeground(Color.WHITE);
        super.getContentPane().add(btn_virgula);

        btn_inverte = new JButton("-+");
        btn_inverte.setBounds(40, 280, 55, 40);
        btn_inverte.setFont(new Font("Roboto", Font.BOLD, 16));
        btn_inverte.setBackground(Color.BLACK);
        btn_inverte.setForeground(Color.WHITE);
        super.getContentPane().add(btn_inverte);

     
        
        this.eventosBtnNumeros();
        this.eventosBtnOperacao();
        this.eventosBtnAux();
    }

    private void eventosBtnNumeros() {
        
         tela2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Tela2 t = new Tela2();
                t.Painel();
              
                t.setVisible(true);
                Calculadora.super.setVisible(false);
        
            }
        });
       

        btn_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!txt_visor.getText().equals("0")) {
                    txt_visor.setText(txt_visor.getText() + "0");
                }
            }
        });

        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0")) {
                    txt_visor.setText("1");
                } else {
                    txt_visor.setText(txt_visor.getText() + "1");
                }
            }
        });

        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0")) {
                    txt_visor.setText("2");
                } else {
                    txt_visor.setText(txt_visor.getText() + "2");
                }
            }
        });

        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0")) {
                    txt_visor.setText("3");
                } else {
                    txt_visor.setText(txt_visor.getText() + "3");
                }
            }
        });

        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0")) {
                    txt_visor.setText("4");
                } else {
                    txt_visor.setText(txt_visor.getText() + "4");
                }
            }
        });

        btn_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0")) {
                    txt_visor.setText("5");
                } else {
                    txt_visor.setText(txt_visor.getText() + "5");
                }
            }
        });

        btn_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0")) {
                    txt_visor.setText("6");
                } else {
                    txt_visor.setText(txt_visor.getText() + "6");
                }
            }
        });

        btn_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0")) {
                    txt_visor.setText("7");
                } else {
                    txt_visor.setText(txt_visor.getText() + "7");
                }
            }
        });

        btn_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0")) {
                    txt_visor.setText("8");
                } else {
                    txt_visor.setText(txt_visor.getText() + "8");
                }
            }
        });
        btn_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("0")) {
                    txt_visor.setText("9");
                } else {
                    txt_visor.setText(txt_visor.getText() + "9");
                }
            }
        });

    }

    private ActionListener btnNum(String num){
    return new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
        
        }
        
    };
    }
    
    
    private void eventosBtnOperacao() {
        
        
         tela2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Tela2 t = new Tela2();
              t.setVisible(true);
            }

        });


        btn_soma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("".equals(txt_visor.getText())) {
                    txt_visor.setText("");
                } else if ("-".equals(txt_visor.getText().substring(0, txt_visor.getText().length()))) {

                    txt_visor.setText("");

                } else {
                    operador = "+";
                    String v = txt_visor.getText().replace(",", ".");
                    valor1 = Double.parseDouble(v);
                    txt_visor2.setText(verificaValor1(valor1) + " " + operador);
                    txt_visor.setText("");
                }
            }

        });

        btn_subtrai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if ("".equals(txt_visor.getText().substring(0, txt_visor.getText().length()))) {
                    txt_visor.setText("-");
                } else if ("-".equals(txt_visor.getText().substring(0, 0))) {
                    String replace = txt_visor.getText().replace(",", ".");
                    valor1 = Double.parseDouble(replace.substring(0, txt_visor.getText().length()));
                } else {
                    operador = "-";
                    valor1 = Double.parseDouble(txt_visor.getText().replace(",", "."));
                    txt_visor2.setText(verificaValor1(valor1) + " " + operador);
                    txt_visor.setText("");

                }
            }

        });

        btn_multiplica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("".equals(txt_visor.getText())) {
                    txt_visor.setText("");
                } else {

                    operador = "x";
                    valor1 = Double.parseDouble(txt_visor.getText().replace(",", "."));
                    txt_visor2.setText(verificaValor1(valor1) + " " + operador);
                    txt_visor.setText("");

                }
            }

        });

        btn_divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("".equals(txt_visor.getText())) {
                    txt_visor.setText("");
                } else {

                    operador = "/";
                    valor1 = Double.parseDouble(txt_visor.getText().replace(",", "."));
                    txt_visor2.setText(verificaValor1(valor1) + " " + operador);
                    txt_visor.setText("");
                }
            }

        });

        btn_igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valor2 = Double.parseDouble(txt_visor.getText().replace(",", "."));
                String result = "";
                switch (operador) {
                    case "+" -> {

                        result = String.valueOf(Calculos.somar(valor1, valor2));
                        txt_visor2.setText(verificaValor1(valor1) + " " + operador + " " + verificaValor2(valor2) + " = " + verificaResultado(result));
                        txt_visor.setText(verificaResultado(result));
                        verificaResultado(result);

                    }
                    case "-" -> {
                        result = String.valueOf(Calculos.subtrair(valor1, valor2));
                        txt_visor2.setText(verificaValor1(valor1) + " " + operador + " " + verificaValor2(valor2) + " = " + verificaResultado(result));
                        txt_visor.setText(verificaResultado(result));
                        verificaResultado(result);
                    }
                    case "x" -> {
                        result = String.valueOf(Calculos.multiplicar(valor1, valor2));
                        txt_visor2.setText(verificaValor1(valor1) + " " + operador + " " + verificaValor2(valor2) + " = " + verificaResultado(result));
                        txt_visor.setText(verificaResultado(result));
                        verificaResultado(result);
                    }
                    case "/" -> {
                        result = String.valueOf(Calculos.dividir(valor1, valor2));
                        txt_visor2.setText(verificaValor1(valor1) + " " + operador + " " + verificaValor2(valor2) + " = " + verificaResultado(result));
                        txt_visor.setText(verificaResultado(result));
                        verificaResultado(result);

                    }
                }
            }
        }
        );

    }

    public String verificaValor1(Double valor1) {
        String v1 = String.valueOf(valor1);

        if (v1.indexOf(".0", v1.length() - 2) == v1.length() - 2) {
            return v1 = v1.substring(0, v1.length() - 2);

        } else {
            return v1;
        }
    }

    public String verificaValor2(Double valor2) {
        String v2 = String.valueOf(valor2);

        if (v2.indexOf(".0", v2.length() - 2) == v2.length() - 2) {
            return v2 = v2.substring(0, v2.length() - 2);

        } else {
            return v2;
        }
    }

    public String verificaResultado(String a) {
        if (a.indexOf(".0", a.length() - 2) == a.length() - 2) {
            return a.substring(0, a.length() - 2);
        } else {
            return a;
        }
    }

    private void eventosBtnAux() {

        btn_virgula.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (txt_visor.getText().equals("")) {
                    txt_visor.setText("");
                } else if (txt_visor.getText().contains(",")) {

                } else {
                    txt_visor.setText(txt_visor.getText() + ",");
                }
            }

        });

        btn_inverte.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("")) {
                    txt_visor.setText("");
                } else if (Double.parseDouble(txt_visor.getText()) > 0) {

                    txt_visor.setText("-" + txt_visor.getText());
                } else {
                    txt_visor.setText(txt_visor.getText().substring(1, txt_visor.getText().length()));
                }
            }

        });

        btn_delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_visor.getText().equals("")) {
                    txt_visor.setText("");
                } else {
                    txt_visor.setText(txt_visor.getText().substring(0, txt_visor.getText().length() - 1));
                }

            }

        });

        btn_c.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt_visor.setText("");
                txt_visor2.setText("");
                valor1 = 0;
                operador = "";

            }

        });

    }

}
