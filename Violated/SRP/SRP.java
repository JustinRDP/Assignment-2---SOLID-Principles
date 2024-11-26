package Violated.SRP;

class User {
    // Private name field to store a user's name - This is relavent data so it can stay in the User class
    private String name;

    // User constructor
    public User(String name) {
        this.name = name;
    }

    // Public function that saves a user to a database - This should be in it's own class
    public void saveToDatabase() {
        System.out.println("Saving " + name + " to database...");
    }

    // Public function that sends an email to a user - This should be in it's own class
    public void sendEmail() {
        System.out.println("Sending email to " + name + "...");
    }
}
