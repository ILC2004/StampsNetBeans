package StampsProject;

import java.io.*;
import java.util.*;

public class UserManager {
    private static final String USER_FILE = "users.csv";
    private final List<User> users = new ArrayList<>();

    //user encapsulation
    private static class User {
        private final String username;
        private final String password;
        private final String email;

        public User(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public String getUsername() { return username; }
        public String getPassword() { return password; }
        public String getEmail() { return email; }

        public String toCSV() {
            return username + "," + password + "," + email;
        }
    }

    //constructor to load users from file
    public UserManager() {
        loadUsers();
    }

    //loads users from CSV file
    private void loadUsers() {
        users.clear();
        File file = new File(USER_FILE);
        if (!file.exists()) return;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 3) {
                    users.add(new User(details[0], details[1], details[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading users: " + e.getMessage());
        }
    }

    //validate credentials
    public boolean validateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    //register new user
    public boolean registerUser(String username, String password, String email) {
    if (getUserByEmail(email) != null) {
        return false; //check if email already taken
    }

    User newUser = new User(username, password, email);
    users.add(newUser);
    
    try {
        saveUsers();
    } catch (IOException e) {
        return false;
    }   
    return true;
}

    private User getUserByEmail(String email) {
    for (User user : users) {
        if (user.getEmail().equalsIgnoreCase(email)) {
            return user;
        }
    }
    return null;
}

    //save users to CSV file
    private void saveUsers() throws IOException {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true))) { //data is appended
        writer.write(users.get(users.size() - 1).toCSV());
        writer.newLine();
    }
}
}

