package entity;

// 用户名、ID、密码
public class User {

    private String ID;  //登陆ID
    private String name; //姓名
    private String passwd;//密码


    public String getName() {
        return name;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public String getID() {
        return ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

}