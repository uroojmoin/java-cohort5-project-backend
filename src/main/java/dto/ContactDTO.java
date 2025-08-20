package dto;

public class ContactDTO {
    private String name;
    private String email;
    private String phone;
    private String address; // ✅ make sure this exists

    // Constructors
    public ContactDTO() {}

    public ContactDTO(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {   // ✅ This is what you need
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}