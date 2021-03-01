package calculadora;

import java.awt.event.*;
import javax.swing.*;
import Operaciones.OperacionesBasicas;

public class Ventana extends JFrame implements ActionListener {

    private JButton numeroUno, numeroDos, numeroTres, numeroCuatro, numeroCinco, numeroSeis, numeroSiete, numeroOcho, numeroNueve, numeroCero, punto, suma, resta, multiplicacion, division, igual;
    private JTextField mostrar;
    private boolean principio, sumar, restar, multiplicar, divi;//Si no se inicia la variable es falso
    private String ultimaOperacion = "";
    private double resultado, numUno, numDos;

    public Ventana() {
        principio = true;
        setLayout(null);
        setBounds(0, 0, 345, 340);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora");

        mostrar = new JTextField("");
        mostrar.setBounds(10, 10, 310, 40);
        mostrar.setEditable(false);
        add(mostrar);

        //7 
        numeroSiete = new JButton("7");
        numeroSiete.setBounds(10, 60, 70, 50);
        add(numeroSiete);
        numeroSiete.addActionListener(this);

        numeroOcho = new JButton("8");
        numeroOcho.setBounds(90, 60, 70, 50);
        add(numeroOcho);
        numeroOcho.addActionListener(this);

        numeroNueve = new JButton("9");
        numeroNueve.setBounds(170, 60, 70, 50);
        add(numeroNueve);
        numeroNueve.addActionListener(this);

        multiplicacion = new JButton("X");
        multiplicacion.setBounds(250, 60, 70, 50);
        add(multiplicacion);
        multiplicacion.addActionListener(this);

        //4 60
        numeroCuatro = new JButton("4");
        numeroCuatro.setBounds(10, 120, 70, 50);
        add(numeroCuatro);
        numeroCuatro.addActionListener(this);

        numeroCinco = new JButton("5");
        numeroCinco.setBounds(90, 120, 70, 50);
        add(numeroCinco);
        numeroCinco.addActionListener(this);

        numeroSeis = new JButton("6");
        numeroSeis.setBounds(170, 120, 70, 50);
        add(numeroSeis);
        numeroSeis.addActionListener(this);

        division = new JButton("/");
        division.setBounds(250, 120, 70, 50);
        add(division);
        division.addActionListener(this);

        //1 
        numeroUno = new JButton("1");
        numeroUno.setBounds(10, 180, 70, 50);
        add(numeroUno);
        numeroUno.addActionListener(this);

        numeroDos = new JButton("2");
        numeroDos.setBounds(90, 180, 70, 50);
        add(numeroDos);
        numeroDos.addActionListener(this);

        numeroTres = new JButton("3");
        numeroTres.setBounds(170, 180, 70, 50);
        add(numeroTres);
        numeroTres.addActionListener(this);

        resta = new JButton("-");
        resta.setBounds(250, 180, 70, 50);
        add(resta);
        resta.addActionListener(this);

        // 0
        numeroCero = new JButton("0");
        numeroCero.setBounds(10, 240, 70, 50);
        add(numeroCero);
        numeroCero.addActionListener(this);

        punto = new JButton(".");
        punto.setBounds(90, 240, 70, 50);
        add(punto);
        punto.addActionListener(this);

        igual = new JButton("=");
        igual.setBounds(170, 240, 70, 50);
        add(igual);
        igual.addActionListener(this);

        suma = new JButton("+");
        suma.setBounds(250, 240, 70, 50);
        add(suma);
        suma.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == numeroUno) {
            ultimaOperacion = ultimaOperacion + "1";
            mostrar.setText(ultimaOperacion);
        }

        if (e.getSource() == numeroDos) {
            ultimaOperacion = ultimaOperacion + "2";
            mostrar.setText(ultimaOperacion);
        }

        if (e.getSource() == numeroTres) {
            ultimaOperacion = ultimaOperacion + "3";
            mostrar.setText(ultimaOperacion);
        }
        if (e.getSource() == numeroCuatro) {
            ultimaOperacion = ultimaOperacion + "4";
            mostrar.setText(ultimaOperacion);
        }

        if (e.getSource() == numeroCinco) {
            ultimaOperacion = ultimaOperacion + "5";
            mostrar.setText(ultimaOperacion);
        }
        if (e.getSource() == numeroSeis) {
            ultimaOperacion = ultimaOperacion + "6";
            mostrar.setText(ultimaOperacion);
        }
        
        
        if (!principio) {
            ultimaOperacion = "";
            mostrar.setText(ultimaOperacion);
            principio = true;
            punto.setEnabled(true);
        }

        if (e.getSource() == numeroSiete) {
            ultimaOperacion = ultimaOperacion + "7";
            mostrar.setText(ultimaOperacion);
        }

        if (e.getSource() == numeroOcho) {
            ultimaOperacion = ultimaOperacion + "8";
            mostrar.setText(ultimaOperacion);
        }

        if (e.getSource() == numeroNueve) {
            ultimaOperacion = ultimaOperacion + "9";
            mostrar.setText(ultimaOperacion);
        }

        if (e.getSource() == numeroCero) {
            ultimaOperacion = ultimaOperacion + "0";
            mostrar.setText(ultimaOperacion);
        }
        if (e.getSource() == punto) {
            ultimaOperacion = ultimaOperacion + ".";
            mostrar.setText(ultimaOperacion);
            punto.setEnabled(false);
        }
     
        if (e.getSource() == igual) {
            OperacionesBasicas operacion = new OperacionesBasicas();
            if (sumar && !ultimaOperacion.equals("")) {
                numDos = Double.parseDouble(mostrar.getText());
                resultado = operacion.Suma(numUno, numDos);
                ultimaOperacion = ultimaOperacion.valueOf(resultado);
                mostrar.setText(ultimaOperacion);
                numUno = numDos = 0.0;
                principio = false;
            }
            if (restar && !ultimaOperacion.equals("")) {
                numDos = Double.parseDouble(mostrar.getText());
                resultado = operacion.Resta(numUno, numDos);
                ultimaOperacion = ultimaOperacion.valueOf(resultado);
                mostrar.setText(ultimaOperacion);
                numUno = numDos = 0.0;
                principio = false;
            }
            if (divi && !ultimaOperacion.equals("")) {
                numDos = Double.parseDouble(mostrar.getText());
                resultado = operacion.división(numUno, numDos);
                ultimaOperacion = ultimaOperacion.valueOf(resultado);
                mostrar.setText(ultimaOperacion);
                numUno = numDos = 0.0;
                principio = false;
            }

            if (multiplicar && !ultimaOperacion.equals("")) {
                numDos = Double.parseDouble(mostrar.getText());
                resultado = operacion.multiplicación(numUno, numDos);
                ultimaOperacion = ultimaOperacion.valueOf(resultado);
                mostrar.setText(ultimaOperacion);
                numUno = numDos = 0.0;
                principio = false;
            }
        }
        //suma
        if (e.getSource() == suma && !ultimaOperacion.equals("")) {
           
            restar = divi = multiplicar = false;
            sumar = true;
            numUno = Double.parseDouble(mostrar.getText());
            mostrar.setText("");
            principio = false;
        }
        //Resta
        if (e.getSource() == resta && !ultimaOperacion.equals("")) {
            
            restar = true;
            sumar = divi = multiplicar = false;
            numUno = Double.parseDouble(mostrar.getText());
           mostrar.setText("");
           principio = false;
        }
        //division 
        if (e.getSource() == division && !ultimaOperacion.equals("")) {
            sumar = restar = multiplicar = false;
            
            divi = true;
            numUno = Double.parseDouble(mostrar.getText());
           mostrar.setText("");
           principio = false;
        }
        //multiplicación
        if (e.getSource() == multiplicacion && !ultimaOperacion.equals("")) {
           
            sumar = divi = restar = false;
            multiplicar = true;
            numUno = Double.parseDouble(mostrar.getText());
            mostrar.setText("");
            principio = false;
        }

    }

}
