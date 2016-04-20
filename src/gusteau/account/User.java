package gusteau.account;

public class User {
    private int id;
    private String UserName;
    private String password;
    private String jobTitle;

    /**
     * to log in admin
     * @param name
     * @param password 
     */
    public User(String name, String password) {
        this.UserName = name;
        this.password = password;
    }
    
    /**
     * to add new User
     * @param name
     * @param password
     * @param jobTitle 
     */
    public User(String name, String password, String jobTitle) {
        this.UserName = name;
        this.password = password;
        this.jobTitle = jobTitle;
    }
    
    /**
     * to get data from backend
     * @param id
     * @param name
     * @param password
     * @param jobTitle 
     */
    public User(int id, String name, String password, String jobTitle) {
        this.id = id;
        this.UserName = name;
        this.password = password;
        this.jobTitle = jobTitle;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return UserName;
    }

    public void setName(String name) {
        this.UserName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
}
