package Violated.LSP;

class Employee {
    // Public method that defines generic work behavior for an employee
    public void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    @Override
    public void work() {
        // Manager's specific work behavior, which overrides Employee's work
        System.out.println("Manager is working and managing the team");
    }

    // Additional method specific to Manager - this violates LSP
    public void manageTeam() {
        System.out.println("Managing the team");
    }
}
