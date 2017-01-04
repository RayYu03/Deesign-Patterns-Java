package ch8.clone;

import java.io.Serializable;

/**
 * Created by RayYu on 2016/12/7.
 */
public class Address implements Serializable{
    private String home;
    private String email;
    private String phone;

    public Address(String home, String email, String phone){
        this.setHome(home);
        this.setEmail(email);
        this.setPhone(phone);
    }
    public String getHome() {
        return home;
    }
    public void setHome(String home) {
        this.home = home;
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

    public void showAddress(){
        System.out.println("Address:");
        System.out.println("Home:"+getHome());
        System.out.println("Email:"+getEmail());
        System.out.println("Phone:"+getPhone());
        System.out.println();
    }

}