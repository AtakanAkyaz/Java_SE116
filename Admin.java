public class Admin extends User {

    public Admin(String name,String surname, int ID, int password, int age, String gender, String eMail) {
        super(name, surname, ID, password, age, gender, eMail);
    }

    @Override
    public int calculateGrade() {
        return 0;
    }
}
