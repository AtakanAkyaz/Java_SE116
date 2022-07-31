public class PersonalTrainer extends User  {
    private int experienceYears;
    private int price;
    private int trainerPoint;
    private int numberOfCoaching;

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTrainerPoint() {
        return trainerPoint;
    }

    public void setTrainerPoint(int trainerPoint) {
        this.trainerPoint = trainerPoint;
    }

    public int getNumberOfCoaching() {
        return numberOfCoaching;
    }

    public void setNumberOfCoaching(int numberOfCoaching) {
        this.numberOfCoaching = numberOfCoaching;
    }
    public PersonalTrainer(String name, String surname, int ID,int password,int age,String gender,String eMail,int experienceYears,int price,int trainerPoint,
                           int numberOfCoaching){
        super(name, surname, ID,password, age, gender,eMail);
        setExperienceYears(experienceYears);
        setPrice(price);
        setTrainerPoint(trainerPoint);
        setNumberOfCoaching(numberOfCoaching);
    }

    @Override
    public void printGeneralInfo(){
        super.printGeneralInfo();
        System.out.println("Years of Experience: "+experienceYears);
        System.out.println("Price per month: "+price+" TL");
        System.out.println("Trainer Point Out of Ten (according to member): "+trainerPoint);
        System.out.println("How many private course: "+numberOfCoaching);
    }
    @Override
    public void printPrivateInfo(){
        super.printPrivateInfo();
        System.out.println("Years of Experience: "+experienceYears);
        System.out.println("Price per month: "+price+" TL");
        System.out.println("Trainer Point Out of Ten (according to member): "+trainerPoint);
        System.out.println("How many private course: "+numberOfCoaching);
    }
    @Override
    public void printOwnInfo(){
        super.printOwnInfo();
        System.out.println("Years of Experience: "+experienceYears);
        System.out.println("Price per month: "+price+" TL");
        System.out.println("Trainer Point Out of Ten (according to member): "+trainerPoint);
        System.out.println("How many private course: "+numberOfCoaching);
    }

    @Override
    public int calculateGrade() {
        return getTrainerPoint()+5;
    }
}
