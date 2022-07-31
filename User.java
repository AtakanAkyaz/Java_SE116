import java.io.Serializable;

public abstract class User implements Serializable {
    private String name;
    private String surname;
    private int ID;
    private int password;
    private int age;
    private String gender;
    private String eMail;


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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }


    public User(String name,String surname, int ID,int password, int age, String gender,String eMail) {
        setName(name);
        setSurname(surname);
        setID(ID);
        setPassword(password);
        setAge(age);
        setGender(gender);
        seteMail(eMail);

    }

    public void printGeneralInfo() { // for using admin!!! and admin can't be able to see password member's and trainer's password
        System.out.println("Name: " + name);
        System.out.println("Surname: "+surname);
        System.out.println("ID: " + ID);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("E-Mail: "+eMail);
    }
    public void printPrivateInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: "+surname);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("E-Mail: "+eMail);
    }
    public void printOwnInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: "+surname);
        System.out.println("ID: " + ID);
        System.out.println("Password: "+password);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("E-Mail: "+eMail);
    }
public abstract int calculateGrade();

}