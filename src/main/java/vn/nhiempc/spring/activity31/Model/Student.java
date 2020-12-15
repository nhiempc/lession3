package vn.nhiempc.spring.activity31.Model;

public class Student {
    String name;
    String email;
    String msv;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMsv() {
        return msv;
    }

    public Student setMsv(String msv) {
        this.msv = msv;
        return this;
    }
}
