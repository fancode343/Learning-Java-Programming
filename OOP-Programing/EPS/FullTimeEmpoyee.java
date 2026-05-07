package EPS;

public class FullTimeEmpoyee extends Employee {
    private int overtimeHours;
    private String performance;

    public FullTimeEmpoyee(String name, double baseSalary, int overtimeHours, String performance) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.performance = performance;
    }

    public int getOverTimeHours() {
        return overtimeHours;
    }

    public void setOverTimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    double bonusRate() {
        if (performance.equals("Excellent")) {
            return .1;
        } else if (performance.equals("Good")) {
            return 0.05;
        } else if (performance.equals("Average")) {
            return 0.02;
        } else {
            return 0;
        }
    }

    @Override
    public double computeSalary() {
        double baseSalary = super.computeSalary();
        double overtimePay = overtimeHours * 150;

        double gros = baseSalary + overtimePay;
        double bunus = gros * bonusRate();
        double totalSalary = gros + bunus;
        if (totalSalary <= 0) {
            return 0;
        } else {
            return totalSalary;
        }
    }
}
