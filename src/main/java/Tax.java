public class Tax {
    private double income;
    private double expense;

    public void increaseIncome(double income){
        if (income < 0){
            return;
        }
        else
            this.income += income;
    }

    public void increaseExpense(double expense){
        if (expense < 0){
            return;
        }
        else
            this.expense += expense;
    }

    public double tax6 (double income){
        return income * 0.06;
    }

    public double tax15 (double income, double expense){
        if(expense>income){
            return 0;
        }
        return (income-expense) * 0.15;
    }

    public double getIncome(){
        return income;
    }

    public double getExpense(){
        return expense;
    }

}
