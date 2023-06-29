package java_oop_fullhouse;

/**
 *
 * @author trant
 */
public class TeamLear extends Developer{
    
    private double bonusRate;

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }

    public TeamLear() {
    }

    public TeamLear(double bonusRate, int expYear, String teamName, int ID, String name, int age, int baseSalary) {
        super(expYear, teamName, ID, name, age, baseSalary);
        this.bonusRate = bonusRate;
    }
    
    @Override
    public double getSalary(){
        return this.getBaseSalary() + (this.getBonusRate() * this.getBaseSalary());
    }
    
}
