package Sprint4.Övningar.ClientServer.Telefonbok;

public class Kompis {
    protected String name;
    protected int mobilenumber;
    protected String birthday;
    protected String email;

    public Kompis(String name, int mobilenumber, String birthday, String email){
        this.name = name;
        this.mobilenumber = mobilenumber;
        this.birthday = birthday;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
