package classes;

import java.util.List;

public class Manager extends Employee {
    private List<Employee> team;
    public List<Employee> getTeam(){return team;}

    public void addSubordinate(Employee emp){
        team.add(emp);
    }
    public void manageTeam(){
        System.out.print("Takım Yönetiliyor.");
    }
}
