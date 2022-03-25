/*
Name: Nathan DeLano
Date: 4/5/18
Program Name: BankPanel
Class: CSC110
Pseudocode: creates a panel for the bank account
*/

package ch6;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import java.text.DecimalFormat;

public class BankPanel extends JPanel {

	private JLabel nameLabel, numberLabel, balanceLabel, statusLabel, changeLabel;
	private JTextField nameField, numberField, balanceField, statusField, changeField;
	private JButton depositButton, withdrawButton;
	private BankAccount testAccount = new BankAccount(128895, 0, "Bart Simpson");
	private DecimalFormat dFmt = new DecimalFormat("0.00");
	private String status = "OK";

	public BankPanel() {

		nameLabel = new JLabel("Account name");
		numberLabel = new JLabel("Account number");
		balanceLabel = new JLabel("Account balance");
		statusLabel = new JLabel("Account Status");
		changeLabel = new JLabel("Deposit/Withdraw amount");

		nameField = new JTextField(testAccount.getName(), 10);
		numberField = new JTextField(Integer.toString(testAccount.getAcctNumber()), 10);
		balanceField = new JTextField(dFmt.format(testAccount.getBalance()), 10);
		statusField = new JTextField(status, 10);
		changeField = new JTextField(dFmt.format(0), 7);

		depositButton = new JButton("Deposit");
		withdrawButton = new JButton("Withdraw");

		depositButton.addActionListener(new ButtonListener());
		withdrawButton.addActionListener(new ButtonListener());

		add(nameLabel);
		add(nameField);
		add(numberLabel);
		add(numberField);
		add(balanceLabel);
		add(balanceField);
		add(statusLabel);
		add(statusField);
		add(depositButton);
		add(withdrawButton);
		add(changeLabel);
		add(changeField);
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(260, 190));

	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == depositButton) {
				testAccount.deposit(Double.parseDouble(changeField.getText()));
			}
			if (event.getSource() == withdrawButton) {
				testAccount.withdraw(Double.parseDouble(changeField.getText()));

			}
			if (testAccount.getBalance() < 0) {
				status = "Overdrawn";
			} else {
				status = "OK";
			}
			balanceField.setText(dFmt.format(testAccount.getBalance()));
			statusField.setText(status);
			changeField.setText(dFmt.format(0));

		}
	}

	private static final long serialVersionUID = 1L;
}
