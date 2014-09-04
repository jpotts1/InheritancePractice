package myabstract;

/**
 * @author Justin Potts
 */
public class HourlyEmployee extends Employee {
    
    private double hourlyRate;
    private double hoursPerWeek;
    private double overtimeHoursPerWeek;
    private static final double OVERTIME_MULTIPLIER = 1.5;
    
 
    @Override
    public double getAnnualWages() {
        return (hourlyRate * hoursPerWeek
                + overtimeHoursPerWeek * OVERTIME_MULTIPLIER)
                * 52;
    }
    
 
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public double getOvertimeHoursPerWeek() {
        return overtimeHoursPerWeek;
    }

    public void setOvertimeHoursPerWeek(double overtimeHoursPerWeek) {
        this.overtimeHoursPerWeek = overtimeHoursPerWeek;
    }
    
}
