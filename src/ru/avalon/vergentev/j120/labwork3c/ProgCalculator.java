package ru.avalon.vergentev.j120.labwork3c;
import javax.swing.*;
import java.awt.*;

import static java.awt.GridBagConstraints.CENTER;

public class ProgCalculator extends JFrame {
    String poleString = "0";
    JLabel textLabel = new JLabel(poleString, SwingConstants.RIGHT);
    JPanel panel = new JPanel(new GridLayout(4, 8));
    JPanel rightPanel = new JPanel();
    JButton buttonEqual = new JButton("=");
    JButton buttonC = new JButton("C");
    JButton buttonD = new JButton("D");
    JButton buttonE = new JButton("E");
    JButton buttonF = new JButton("F");
    JButton buttonSHR = new JButton("shr");
    JButton buttonXOR = new JButton("xor");
    JButton buttonDivision = new JButton("/");
    JButton buttonHEX = new JButton("hex");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonA = new JButton("A");
    JButton buttonB = new JButton("B");
    JButton buttonSHL = new JButton("shl");
    JButton buttonAND = new JButton("and");
    JButton buttonMultiplication = new JButton("*");
    JButton buttonDEC = new JButton("dec");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton buttonCLS = new JButton("Cls");
    JButton buttonOR = new JButton("or");
    JButton buttonSubtriction = new JButton("-");
    JButton buttonOCT = new JButton("oct");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton buttonPlusMinus = new JButton("+/-");
    JButton buttonNOT = new JButton("not");
    JButton buttonAddition = new JButton("+");
    JButton buttonBIN = new JButton("bin");


    public ProgCalculator() throws HeadlessException {
        setTitle("Programmer's calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setLocationRelativeTo(null);
        setResizable(true);
        setLayout(new GridBagLayout());

        GridBagConstraints textLabelPosition = new GridBagConstraints(0,0,0,1,1,1, CENTER,1, new Insets(0,0,0,0),0,40);
        add(textLabel, textLabelPosition);
        textLabel.setFont(new Font("Segoe UI", Font.BOLD, 45));

        GridBagConstraints panelRightPosition = new GridBagConstraints(1,1,1,1,1,10, CENTER,1, new Insets(0,0,0,0),0,40);
        add(rightPanel, panelRightPosition);
        rightPanel.setLayout(new GridLayout(4, 1));
        rightPanel.add(buttonHEX);
        buttonHEX.setBackground(Color.PINK);
        buttonHEX.addActionListener(e -> {buttonHEX();});
        rightPanel.add(buttonDEC);
        buttonDEC.setBackground(Color.PINK);
        buttonDEC.addActionListener(e -> {buttonDEC();});
        rightPanel.add(buttonOCT);
        buttonOCT.setBackground(Color.PINK);
        buttonOCT.addActionListener(e -> {buttonOCT();});
        rightPanel.add(buttonBIN);
        buttonBIN.setBackground(Color.PINK);
        buttonBIN.addActionListener(e -> {buttonBIN();});

        GridBagConstraints equalButtonPosition = new GridBagConstraints(0,2,0,1,1,1, CENTER,1, new Insets(0,0,0,0),0,40);
        add(buttonEqual, equalButtonPosition);

        GridBagConstraints panelPosition = new GridBagConstraints(0,1,1,1,10,10, CENTER,1, new Insets(0,0,0,0),0,40);
        add(panel, panelPosition);
        panel.setLayout(new GridLayout(4, 7));

        panel.add(buttonC);
        buttonC.addActionListener(e -> {buttonDigit("C");});
        panel.add(buttonD);
        buttonD.addActionListener(e -> {buttonDigit("D");});
        panel.add(buttonE);
        buttonE.addActionListener(e -> {buttonDigit("E");});
        panel.add(buttonF);
        buttonF.addActionListener(e -> {buttonDigit("F");});
        panel.add(buttonSHR);
        buttonSHR.addActionListener(e -> {buttonSHR();});
        panel.add(buttonXOR);
        buttonXOR.addActionListener(e -> {buttonXOR();});
        panel.add(buttonDivision);
        buttonDivision.addActionListener(e -> {buttonDivision();});
        panel.add(button8);
        button8.addActionListener(e -> {buttonDigit("8");});
        panel.add(button9);
        button9.addActionListener(e -> {buttonDigit("9");});
        panel.add(buttonA);
        buttonA.addActionListener(e -> {buttonDigit("A");});
        panel.add(buttonB);
        buttonB.addActionListener(e -> {buttonDigit("B");});
        panel.add(buttonSHL);
        buttonSHL.addActionListener(e -> {buttonSHL();});
        panel.add(buttonAND);
        buttonAND.addActionListener(e -> {buttonAND();});
        panel.add(buttonMultiplication);
        buttonMultiplication.addActionListener(e -> {buttonMultiplication();});
        panel.add(button4);
        button4.addActionListener(e -> {buttonDigit("4");});
        panel.add(button5);
        button5.addActionListener(e -> {buttonDigit("5");});
        panel.add(button6);
        button6.addActionListener(e -> {buttonDigit("6");});
        panel.add(button7);
        button7.addActionListener(e -> {buttonDigit("7");});
        panel.add(buttonCLS);
        buttonCLS.addActionListener(e -> {buttonCLS();});
        panel.add(buttonOR);
        buttonOR.addActionListener(e -> {buttonOR();});
        panel.add(buttonSubtriction);
        buttonSubtriction.addActionListener(e -> {buttonSubtriction();});
        panel.add(button0);
        button0.addActionListener(e -> {buttonDigit("0");});
        panel.add(button1);
        button1.addActionListener(e -> {buttonDigit("1");});
        panel.add(button2);
        button2.addActionListener(e -> {buttonDigit("2");});
        panel.add(button3);
        button3.addActionListener(e -> {buttonDigit("3");});
        panel.add(buttonPlusMinus);
        buttonPlusMinus.addActionListener(e -> {buttonPlusMinus();});
        panel.add(buttonNOT);
        buttonNOT.addActionListener(e -> {buttonNOT();});
        panel.add(buttonAddition);
        buttonAddition.addActionListener(e -> {buttonAddition();});
        button0.setVisible(false);
        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        buttonE.setVisible(false);
        buttonF.setVisible(false);
    }

    private void buttonDivision() {
        
    }

    private void buttonMultiplication() {
        
    }

    private void buttonSubtriction() {
        
    }

    private void buttonAddition() {
        
    }

    private void buttonNOT() {
        
    }

    private void buttonPlusMinus() {
        
    }

    private void buttonOR() {
        
    }

    private void buttonCLS() {
        
    }

    private void buttonAND() {
        
    }

    private void buttonSHL() {
        
    }

    private void buttonXOR() {
        
    }

    private void buttonSHR() {
        
    }

    private void buttonHEX() {
        buttonHEX.setBackground(Color.RED);
        buttonDEC.setBackground(Color.PINK);
        buttonOCT.setBackground(Color.PINK);
        buttonBIN.setBackground(Color.PINK);
        button0.setVisible(true);
        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        button5.setVisible(true);
        button6.setVisible(true);
        button7.setVisible(true);
        button8.setVisible(true);
        button9.setVisible(true);
        buttonA.setVisible(true);
        buttonB.setVisible(true);
        buttonC.setVisible(true);
        buttonD.setVisible(true);
        buttonE.setVisible(true);
        buttonF.setVisible(true);
    }

    private void buttonDEC() {
        buttonHEX.setBackground(Color.PINK);
        buttonDEC.setBackground(Color.RED);
        buttonOCT.setBackground(Color.PINK);
        buttonBIN.setBackground(Color.PINK);
        button0.setVisible(true);
        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        button5.setVisible(true);
        button6.setVisible(true);
        button7.setVisible(true);
        button8.setVisible(true);
        button9.setVisible(true);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        buttonE.setVisible(false);
        buttonF.setVisible(false);
    }

    private void buttonOCT() {
        buttonHEX.setBackground(Color.PINK);
        buttonDEC.setBackground(Color.PINK);
        buttonOCT.setBackground(Color.RED);
        buttonBIN.setBackground(Color.PINK);
        button0.setVisible(true);
        button1.setVisible(true);
        button2.setVisible(true);
        button3.setVisible(true);
        button4.setVisible(true);
        button5.setVisible(true);
        button6.setVisible(true);
        button7.setVisible(true);
        button8.setVisible(false);
        button9.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        buttonE.setVisible(false);
        buttonF.setVisible(false);
    }

    private void buttonBIN() {
        buttonHEX.setBackground(Color.PINK);
        buttonDEC.setBackground(Color.PINK);
        buttonOCT.setBackground(Color.PINK);
        buttonBIN.setBackground(Color.RED);
        button0.setVisible(true);
        button1.setVisible(true);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);
        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);
        button9.setVisible(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        buttonE.setVisible(false);
        buttonF.setVisible(false);
    }

    private void buttonDigit (String symbol) {
        if (poleString.equals("0")) {
            poleString = symbol;
        } else {
            poleString = poleString + symbol;
        }
        textLabel.setText(poleString);
    }
}
