import java.io.Serializable;

public  class Member extends User implements Serializable {
    private int trainingGrades;
    private String level;
    private double length;
    private double weight;
    private  double BMI;




    public int getTrainingGrades() {
        return trainingGrades;
    }

    public void setTrainingGrades(int trainingGrades) {
        this.trainingGrades = trainingGrades;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getBMI(){
        return BMI;
    }
    public void  calculateBMI(){
        BMI=weight/(length*length);
    }
    public Member(String name, String surname, int ID,int password,int age, String gender,String eMail,int trainingGrades,String level,double length,double weight) {
        super(name, surname ,ID, password, age, gender,eMail);
        setTrainingGrades(trainingGrades);
        setLevel(level);
        setLength(length);
        setWeight(weight);
        calculateBMI();
    }

    @Override
    public int calculateGrade() {
        return getTrainingGrades()+5;
    }

    @Override
    public void printGeneralInfo(){
        super.printGeneralInfo();
        System.out.println("Training Grade: "+trainingGrades);
        System.out.println("Member Level: "+level);
        System.out.println("Member Length: "+length);
        System.out.println("Member Weight: "+weight);
        System.out.println("Member BMI: "+BMI);
    }
    @Override
    public void printOwnInfo(){
        super.printOwnInfo();
        System.out.println("Training Grade: "+trainingGrades);
        System.out.println("Member Level: "+level);
        System.out.println("Member Length: "+length);
        System.out.println("Member Weight: "+weight);
        System.out.println("Member BMI: "+BMI);
        if (BMI<=25&&BMI>=20){
            System.out.println("Your weight is very normal according to your length");
        }
        if (BMI>25){
            System.out.println("You need to lose weight please be careful");
        }
        if (BMI<20){
            System.out.println("You need to get weight please be careful");
        }
    }

}
