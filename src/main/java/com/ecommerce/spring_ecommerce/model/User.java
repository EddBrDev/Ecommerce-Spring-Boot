package com.ecommerce.spring_ecommerce.model;

public class User {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String adress;
    private String phone;
    private String type;
    private String password;
    
    public User() {
    }
    public User(Integer id, String name, String username, String email, String adress, String phone, String type,
            String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.adress = adress;
        this.phone = phone;
        this.type = type;
        this.password = password;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
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
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", adress="
                + adress + ", phone=" + phone + ", type=" + type + ", password=" + password + "]";
    }
}
