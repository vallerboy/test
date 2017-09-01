package pl.oskarpolak.models.forms;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.Size;

/**
 * Created by Lenovo on 01.09.2017.
 */
public class RegisterForm {

     @Size(min = 5, max = 10)
     private String name;
     @Size(min = 5, max = 10)
     private String surname;
     @Email
     private String email;
     @Size(min = 5, max = 30)
     private String password;
     @Size(min = 5, max = 30)
     private String repeatPassword;
     @Size(min = 5, max = 10)
     private String nick;


    public RegisterForm() {

    }

    public RegisterForm(String name, String surname, String email, String password, String repeatPassword, String nick) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.repeatPassword = repeatPassword;
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
