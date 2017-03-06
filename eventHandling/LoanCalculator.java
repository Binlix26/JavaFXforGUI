package eventHandling;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Date;

/**
 * Created by binlix26 on 5/03/17.
 */
public class LoanCalculator extends Application {
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) {
        //create UI
        GridPane pane = new GridPane();
        pane.setHgap(5);
        pane.setVgap(5);

        pane.add(new Label("Annual Interest Rate:"), 0, 0);
        pane.add(tfAnnualInterestRate, 1, 0);
        pane.add(new Label("Number Of Year:"), 0, 1);
        pane.add(tfNumberOfYears, 1, 1);
        pane.add(new Label("Loan Amount:"), 0, 2);
        pane.add(tfLoanAmount, 1, 2);
        pane.add(new Label("Monthly Payment:"), 0, 3);
        pane.add(tfMonthlyPayment, 1, 3);
        pane.add(new Label("Total Payment:"), 0, 4);
        pane.add(tfTotalPayment, 1, 4);
        pane.add(btCalculate, 1, 5);

        //set UI properties
        pane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);// put the cursor at the right
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);// if it can be edited
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);
        //process event
        btCalculate.setOnAction(event -> calculateLoanPayment());

        //place it in the stage
        Scene scene = new Scene(pane, 400, 250);
        primaryStage.setTitle("LoanCalculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculateLoanPayment() {
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());

        Loan loan = new Loan(interest, year, loanAmount);

        tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    Loan() {
        this(2.5, 1, 1000);
    }

    Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    public Date getLoanDate() {
        return loanDate;
    }

}
