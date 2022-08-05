package Homework3;

public class Financial_record {
    int incomes;
    int outcomes;

     public Financial_record(int incomes, int outcomes) {
         this.incomes = incomes;
         this.outcomes = outcomes;
     }
     public void setIncomes(int incomes) {
         this.incomes = incomes;
     }
     public void setOutcomes(int outcomes) {
         this.incomes = outcomes;
     }

    public int getIncomes() {
        return incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }
    public String getReport() {
         return "доходы = " + this.incomes + "; расходы = " + this.outcomes;
    }
}
