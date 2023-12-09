package org.example.Week8.Task1;

@UserPermission(2)
public class Admin {
    private String username;

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
