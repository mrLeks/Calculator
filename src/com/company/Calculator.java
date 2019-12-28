package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {

    public static class TestFrame extends JFrame {
        JTextField field1, field2, fieldRes;
       

        public TestFrame() {
            super("Calculate");
            createGUI();
        }

        public void createGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton addition = new JButton("+");
            JButton substraction = new JButton("-");
            JButton multiplication = new JButton("*");
            JButton division = new JButton("/");
            JButton exponent = new JButton("X^Y");

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            panel.add(addition);
            panel.add(substraction);
            panel.add(division);
            panel.add(multiplication);
            panel.add(exponent);

            JLabel labelResult = new JLabel();
            panel.add(labelResult);

            AdditionActionListener actionListener1 = new AdditionActionListener();
            addition.addActionListener(actionListener1);
            substractionActionListener actionListener2 = new substractionActionListener();
            substraction.addActionListener(actionListener2);
            multiplicationActionListener actionListener3 = new multiplicationActionListener();
            multiplication.addActionListener(actionListener3);
            divisionActionListener actionListener4 = new divisionActionListener();
            division.addActionListener(actionListener4);
            exponentActionListener actionListener5 = new exponentActionListener();
            exponent.addActionListener(actionListener5);

            getContentPane().add(panel);
            setPreferredSize(new Dimension(280, 150));

            field1 = new JTextField(5);
            field1.setToolTipText("Number 1");
            panel.add(field1);

            field2 = new JTextField(5);
            field2.setToolTipText("Number 2/");
            panel.add(field2);

            fieldRes = new JTextField(5);
            fieldRes.setToolTipText("Result");
            panel.add(fieldRes);
        }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    TestFrame frame = new TestFrame();
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            });
        }

        private class AdditionActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(field1.getText());
                float num2 = Float.parseFloat(field2.getText());
                fieldRes.setText(String.valueOf(num1 + num2));
            }
        }

        private class substractionActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(field1.getText());
                float num2 = Float.parseFloat(field2.getText());
                fieldRes.setText(String.valueOf(num1 - num2));
            }
        }

        private class multiplicationActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(field1.getText());
                float num2 = Float.parseFloat(field2.getText());
                fieldRes.setText(String.valueOf(num1 * num2));
            }
        }

        private class divisionActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(field1.getText());
                float num2 = Float.parseFloat(field2.getText());
                fieldRes.setText(String.valueOf(num1 / num2));
            }
        }

        private class exponentActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(field1.getText());
                float num2 = Float.parseFloat(field2.getText());
                fieldRes.setText(String.valueOf(Math.pow(num1, num2)));
            }
        }
    }
}
