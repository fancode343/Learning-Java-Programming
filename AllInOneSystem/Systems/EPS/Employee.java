package AllInOneSystem.Systems.EPS;
public class Employee {


    private String name;
    private double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getName(){ //Getter for name
        return name;
    }
    public void setName(String name){ //Setter for name
        this.name = name;
    }
    public double getBaseSalary(){ //Getter for baseSalary
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        if(baseSalary<=0) {
            baseSalary = 0;
        } else {
            this.baseSalary = baseSalary;
        }
    }
    public double computeSalary(){
        return baseSalary;
    }

}
