public class Employee {
    private int baseSalary;
    private int extraHours;
    public int hourlyRate;

    public   int calculateWage(){
        return baseSalary+(extraHours*hourlyRate);
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary<=0)
            throw new IllegalArgumentException("Salary can1 not be  0 or less");
        this.baseSalary=baseSalary;
    }

    public int getBaseSalary(){
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate<=0)
            throw new IllegalArgumentException("Salary can not be  0 or less");
        this.hourlyRate=hourlyRate;
    }
    public int getHourlyRate(){
        return hourlyRate;
    }

}
