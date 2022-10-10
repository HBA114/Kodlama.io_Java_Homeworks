package inheritence_demo;

public class Main {
    public static void main(String[] args) {
        LoanUI loanUI = new LoanUI();

        // this is an example for Polymorphism
        loanUI.calculateLoan(new TeacherLoanManager());
        loanUI.calculateLoan(new AgriculturLoanManager());
        loanUI.calculateLoan(new SoldierLoanManager());
    }
}
