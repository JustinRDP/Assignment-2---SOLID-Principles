package Solved.LSP;

abstract class Employee {
    // Abstract method for work, ensuring all employees define this
    public abstract void work();
}

class RegularEmployee extends Employee {
    @Override
    public void work() {
        // Regular employee's specific work behavior
        System.out.println("Regular employee is working");
    }
}

class Manager extends Employee {
    @Override
    public void work() {
        // Manager's specific work behavior
        System.out.println("Manager is working and managing the team");
    }

    // Additional method specific to Manager
    public void manageTeam() {
        System.out.println("Managing the team");
    }
}
