package EPS;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;
    public PartTimeEmployee(String name, double baseSalary, int hoursWorked, double hourlyRate){
        super(name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double computeSalary(){
        double salary = (hoursWorked*hourlyRate)+super.computeSalary();
        if(salary <= 0){
            return 0;
        }else{
            return salary;
        }
    }
}
