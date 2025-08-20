package dto;

public class UserDTO {
    private Long id; // ✅ Add this line
    private String username;
    private String email;
    private String password;

    // ✅ Default constructor
    public UserDTO() {}

    // ✅ Constructor with fields (optional: include id if needed)
    public UserDTO(Long id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // ✅ Getter & Setter for ID
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // ✅ Getters and Setters for other fields
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}