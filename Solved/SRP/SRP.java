package Solved.SRP;

class User {
    // Private name field to store a user's name - This is relavent data so it can stay in the User class
    private String name; 

    // User constructor
    public User(String name) {
        this.name = name;
    }

    // User name getter is needed now so that the other classes can get a user's name
    public String getName() {
        return name;
    }
}

// The saveToDatabase() function is moved into it's own class to seperate responsibilities
class UserRepository {
    public void saveToDatabase(User user) {
        System.out.println("Saving " + user.getName() + " to database...");
    }
}

// The sendEmail() function is moved into it's own class to seperate responsibilities
class EmailService {
    public void sendEmail(User user) {
        System.out.println("Sending email to " + user.getName() + "...");
    }
}
