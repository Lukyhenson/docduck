package br.com.docduck.api.user;

/**
 * Created by Jean on 22/06/2017.
 */
public class User {

    private long id;
    private String name;
    private String userName;
    private String password;

    public User() {
        this.id = 1;
        this.name = "User";
        this.userName = "user";
        this.password = "********";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
