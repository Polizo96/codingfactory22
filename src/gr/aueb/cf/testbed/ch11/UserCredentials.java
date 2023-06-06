package gr.aueb.cf.testbed.ch11;

/**
 * A simple {@link UserCredentials} Java Bean.
 *
 * @author nikospol
 */
public class UserCredentials {
    private long id;
    private String username;
    private String password;

    public UserCredentials() {}

    public UserCredentials(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
