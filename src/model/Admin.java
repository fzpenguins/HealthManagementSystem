package model;

//����Ա
public class Admin {
    private String admin_no;
    private String admin_password;

    public String getAdmin_no() {
        return admin_no;
    }

    public void setAdmin_no(String admin_no) {
        this.admin_no = admin_no;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public Admin(String admin_no, String admin_password) {
        this.admin_no = admin_no;
        this.admin_password = admin_password;
    }

}
