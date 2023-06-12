package buoi08;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {

    private int expYear;
    private List<String> engineer;
    private String teamName;

    public Developer(int expYear, String teamName, int id,
            String nameString, int age, int baseSalary,
            ArrayList<String> engineer) {
        super(id, nameString, age, baseSalary);
        this.expYear = expYear;
        this.teamName = teamName;
        this.engineer = engineer;
        super.getId();
    }

    public List<String> getEngineer() {
        return engineer;
    }

    public void setEngineer(List<String> engineer) {
        this.engineer = engineer;
    }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public void print() {
        System.out.println("");
    }
}
