public class Course {
    private String courseName;
    private String studio;
    private String day;
    private double startingHour;
    private double endingHour;
    private String trainerName;
    private int courseNumber;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public double getHour() {
        return startingHour;
    }

    public void setStartingHour(double hour) {
        this.startingHour = hour;
    }

    public double getEndingHour() {
        return endingHour;
    }

    public void setEndingHour(double endingHour) {
        this.endingHour = endingHour;
    }
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }
    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Course(String courseName, String studio, String day, double startingHour,double endingHour, String trainerName,int courseNumber){
        setCourseName(courseName);
        setStudio(studio);
        setDay(day);
        setStartingHour(startingHour);
        setEndingHour(endingHour);
        setTrainerName(trainerName);
        setCourseNumber(courseNumber);
    }
    public void printCourseInfo(){
        System.out.println(day);
        System.out.println("-------------------");
        System.out.println("Hour: "+startingHour + " - " + endingHour + " / "+courseName + " / "+ " Studio: "+ studio +"/ Trainer:"+ trainerName + "/ Course Number:"+courseNumber);
        System.out.println("*----------------------*");
    }



}
