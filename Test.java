
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String tempName;
        String tempSurName;
        int tempPassword;
        int tempID;
        int tempAge;
        String tempEmail;
        String tempGender;
        String tempLevel;
        double tempLength;
        double tempWeight;
        int tempTrainingGrade;
        String answer;
        int choice;
        boolean check = true;
        String tempCourseName;
        String tempCourseDay;
        String tempCourseLevel;
        int tempCourseNumber;
        Scanner scanner = new Scanner(System.in);
        Random random=new Random();



        ArrayList<User> ADarrayList = new ArrayList<>();
        User AD1 = new Admin("Taylan","Güloğlu",1, 1234, 22, "Male", "guloglutaylan@gmail.com");
        User AD2 = new Admin("Beyza","Özel" ,2, 4321, 21, "Female", "beyzaözel@gmail.com");
        User AD3 = new Admin("Erhan","Yolcu", 3, 4655, 23, "Male", "erhanyolcu@hotmail.com");
        User AD4 = new Admin("Atakan","Akyaz", 4, 2313, 21, "Male", "atakanakyaz@gmail.com");

        ADarrayList.add(AD1);
        ADarrayList.add(AD2);
        ADarrayList.add(AD3);
        ADarrayList.add(AD4);

        ArrayList<User> PTarraylist = new ArrayList<>();
        User PT1 = new PersonalTrainer("Rahman","Kıralı", 100, 5643, 22, "Male", "rahman@gmail.com", 2,
                1600, 8, 4);
        User PT2 = new PersonalTrainer("Burak","Bayraktar", 101, 4654, 24, "Male", "burak@gmail.com", 4,
                1800, 8, 6);
        User PT3 = new PersonalTrainer("Özkan","Adıgüzel", 102, 1111, 23, "Male", "ozkan@gmail.com", 3,
                1750, 9, 5);
        User PT4 = new PersonalTrainer("Umut","Numaracı", 103, 2222, 26, "Male", "umut@gmail.com", 5,
                1850, 7, 3);
        User PT5 = new PersonalTrainer("Özlem","Cansever",105,6788,27,"Female","ozlem@gmail.com",5,
                1450, 8,  2);
        User PT6 = new PersonalTrainer("Yaren","Korkmaz",106,2125,24,"Female","yaren@gmail.com",2,
                1580, 7,  5);
        User PT7 = new PersonalTrainer("Mehtap","Boyacı",107,1878,30,"Female","mehtap@gmail.com",7,
                2000, 9,  6);
        User PT8 = new PersonalTrainer("Buse","Kulaksız",108,9888,20,"Female","buse@gmail.com",2,
                1200, 7,  1);
        User PT9 = new PersonalTrainer("Can","Halıcı",109,4443,25,"Male","can@gmail.com",3,
                1400,8,2);
        User PT10 = new PersonalTrainer("Sinan","Tunalı",110,5150,27,"Male","sinan@gmail.com",5,
                1650,8,4);

        PTarraylist.add(PT1);
        PTarraylist.add(PT2);
        PTarraylist.add(PT3);
        PTarraylist.add(PT4);
        PTarraylist.add(PT5);
        PTarraylist.add(PT6);
        PTarraylist.add(PT7);
        PTarraylist.add(PT8);
        PTarraylist.add(PT9);
        PTarraylist.add(PT10);

        ArrayList<User> MemArrayList = new ArrayList<>();
        User Mem1 = new Member("Hande","Canalan", 1000, 7895, 39, "Female", "hande@gmail.com", 6,
                "intermediate", 1.67, 55.5);
        User Mem2 = new Member("Özgür","Deniz", 1001, 6546, 32, "Male", "ozgur@gmail.com", 8,
                "advanced", 1.82, 76);
        User Mem3 = new Member("Gökçe","Can", 1002, 1503, 22, "Female", "cangokce@gmail.com", 7,
                "intermediate", 1.63, 58);
        User Mem4 = new Member("Deniz","Güloğlu", 1003, 1564, 18, "Male", "deniz@gmail.com", 5,
                "beginner", 1.78, 86);
        MemArrayList.add(Mem1);
        MemArrayList.add(Mem2);
        MemArrayList.add(Mem3);
        MemArrayList.add(Mem4);


        try {
            FileOutputStream fileOutputStream=new FileOutputStream("MemArrayList.ser");
            ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(MemArrayList);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream=new FileInputStream("MemArrayList.ser");
            ObjectInputStream in=new ObjectInputStream(fileInputStream);
            in.readObject();
            in.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        ArrayList<Course> BegginerList = new ArrayList<>();
            Course cor1 = new BeginnerCourses("Yoga", "Aerobic", "Tuesday", 19, 19.45, "Özlem", 1);
            Course cor2 = new BeginnerCourses("Yoga", "Aerobic", "Thursday", 12.15, 13.05, "Özlem", 2);
            Course cor3 = new BeginnerCourses("Yoga", "Aerobic", "Saturday", 11, 11.55, "Özlem", 3);
            Course cor4 = new BeginnerCourses("Step Aerobic", "Aerobic", "Monday", 11.05, 11.55, "Umut", 4);
            Course cor5 = new BeginnerCourses("Step Aerobic", "Aerobic", "Friday", 11.05, 11.55, "Umut", 5);
            Course cor6 = new BeginnerCourses("GFX Easy", "Gym Area", "Monday", 14.35, 15.05, "Özkan", 6);
            Course cor7 = new BeginnerCourses("GFX Easy", "Gym Area", "Tuesday", 13.35, 14.05, "Yaren", 7);
            Course cor8 = new BeginnerCourses("GFX Easy", "Gym Area", "Wednesday", 16.15, 16.45, "Mehtap", 8);
            Course cor9 = new BeginnerCourses("GFX Easy", "Gym Area", "Thursday", 14.35, 15.05, "Buse", 9);
            Course cor10 = new BeginnerCourses("GFX Easy", "Gym Area", "Friday", 11.05, 11.35, "Özkan", 10);
            Course cor11 = new BeginnerCourses("GFX Synergy", "Gym Area", "Tuesday", 16.25, 16.55, "Mehtap", 11);
            Course cor12 = new BeginnerCourses("GFX Synergy", "Gym Area", "Thursday", 16.25, 16.55, "Buse", 12);

            BegginerList.add(cor1);
            BegginerList.add(cor2);
            BegginerList.add(cor3);
            BegginerList.add(cor4);
            BegginerList.add(cor5);
            BegginerList.add(cor6);
            BegginerList.add(cor7);
            BegginerList.add(cor8);
            BegginerList.add(cor9);
            BegginerList.add(cor10);
            BegginerList.add(cor11);
            BegginerList.add(cor12);

            ArrayList<Course> InterMediateList = new ArrayList<>();
            Course cor13 = new IntermediateCourses("Express Cycle", "Cycling", "Monday", 9, 9.45, "Rahman", 13);
            Course cor14 = new IntermediateCourses("Express Cycle", "Cycling", "Tuesday", 19, 19.45, "Buse", 14);
            Course cor15 = new IntermediateCourses("Express Cycle", "Cycling", "Wednesday", 9, 9.45, "Rahman", 15);
            Course cor16 = new IntermediateCourses("Express Cycle", "Cycling", "Thursday", 20.15, 21.00, "Özkan", 16);
            Course cor17 = new IntermediateCourses("Express Cycle", "Cycling", "Friday", 19.35, 20.20, "Burak", 17);
            Course cor18 = new IntermediateCourses("Express Cycle", "Cycling", "Saturday", 13.35, 14.20, "Mehtap", 18);
            Course cor19 = new IntermediateCourses("Express Cycle", "Cycling", "Monday", 12.15, 13, "Özkan", 19);
            Course cor20 = new IntermediateCourses("Express Cycle", "Cycling", "Wednesday", 16.15, 17, "Umut", 20);
            Course cor21 = new IntermediateCourses("Zumba", "Aerobic", "Monday", 19.25, 20.05, "Can", 21);
            Course cor22 = new IntermediateCourses("Zumba", "Aerobic", "Wednesday", 12.15, 13, "Can", 22);
            Course cor23 = new IntermediateCourses("Zumba", "Aerobic", "Wednesday", 19.35, 20.25, "Can", 23);
            Course cor24 = new IntermediateCourses("Zumba", "Aerobic", "Thursday", 20.05, 20.55, "Can", 24);
            Course cor25 = new IntermediateCourses("GFX MOVE", "Gym Area", "Tuesday", 17, 17.30, "Özkan", 25);
            Course cor26 = new IntermediateCourses("GFX MOVE", "Gym Area", "Thursday", 12.15, 12.45, "Mehtap", 26);
            Course cor27 = new IntermediateCourses("GFX MOVE", "Gym Area", "Friday", 13.45, 14.15, "Yaren", 27);
            Course cor28 = new IntermediateCourses("GFX MOVE", "Gym Area", "Saturday", 16.35, 17.05, "Mehtap", 28);
            Course cor29 = new IntermediateCourses("GFX MOVE", "Gym Area", "Sunday", 17, 17.30, "Yaren", 29);
            Course cor30 = new IntermediateCourses("Exp BodyFit", "Aerobic", "Tuesday", 12.15, 12.45, "Yaren", 30);
            Course cor31 = new IntermediateCourses("Exp BodyFit", "Aerobic", "Wednesday", 16.15, 16.45, "Yaren", 31);
            Course cor32 = new IntermediateCourses("Exp BodyFit", "Aerobic", "Friday", 20, 20.35, "Buse", 32);
            Course cor33 = new IntermediateCourses("Exp BodyFit", "Aerobic", "Saturday", 12.15, 12.45, "Yaren", 33);
            Course cor34 = new IntermediateCourses("Exp BodyFit", "Aerobic", "Sunday", 12.15, 12.45, "Buse", 34);
            Course cor35 = new IntermediateCourses("Pilates", "Aerobic", "Monday", 12.15, 13.05, "Burak", 35);
            Course cor36 = new IntermediateCourses("Pilates", "Aerobic", "Monday", 13.15, 14.05, "Yaren", 36);
            Course cor37 = new IntermediateCourses("Pilates", "Aerobic", "Tuesday", 15.15, 16.05, "Burak", 37);
            Course cor38 = new IntermediateCourses("Pilates", "Aerobic", "Tuesday", 16.15, 17.05, "Mehtap", 38);
            Course cor39 = new IntermediateCourses("Pilates", "Aerobic", "Thursday", 18.15, 19.05, "Buse", 39);
            Course cor40 = new IntermediateCourses("Pilates", "Aerobic", "Thursday", 9.15, 10.05, "Mehtap", 40);
            Course cor41 = new IntermediateCourses("Pilates", "Aerobic", "Friday", 12.15, 13.05, "Burak", 41);
            Course cor42 = new IntermediateCourses("Pilates", "Aerobic", "Friday", 17.15, 18.05, "Buse", 42);
            Course cor43 = new IntermediateCourses("Pilates", "Aerobic", "Wednesday", 18.15, 18.55, "Yaren", 43);
            Course cor44 = new IntermediateCourses("Pilates", "Aerobic", "Wednesday", 14.15, 15.05, "Mehtap", 44);
            Course cor45 = new IntermediateCourses("Pilates", "Aerobic", "Saturday", 13.15, 14.05, "Özlem", 45);
            Course cor46 = new IntermediateCourses("Pilates", "Aerobic", "Sunday", 11.15, 12.05, "Burak", 46);

            InterMediateList.add(cor13);
            InterMediateList.add(cor14);
            InterMediateList.add(cor15);
            InterMediateList.add(cor16);
            InterMediateList.add(cor17);
            InterMediateList.add(cor18);
            InterMediateList.add(cor19);
            InterMediateList.add(cor20);
            InterMediateList.add(cor21);
            InterMediateList.add(cor22);
            InterMediateList.add(cor23);
            InterMediateList.add(cor24);
            InterMediateList.add(cor25);
            InterMediateList.add(cor26);
            InterMediateList.add(cor27);
            InterMediateList.add(cor28);
            InterMediateList.add(cor29);
            InterMediateList.add(cor30);
            InterMediateList.add(cor31);
            InterMediateList.add(cor32);
            InterMediateList.add(cor33);
            InterMediateList.add(cor34);
            InterMediateList.add(cor35);
            InterMediateList.add(cor36);
            InterMediateList.add(cor37);
            InterMediateList.add(cor38);
            InterMediateList.add(cor39);
            InterMediateList.add(cor40);
            InterMediateList.add(cor41);
            InterMediateList.add(cor42);
            InterMediateList.add(cor43);
            InterMediateList.add(cor44);
            InterMediateList.add(cor45);
            InterMediateList.add(cor46);

            ArrayList<Course> AdvancedList = new ArrayList<>();
            Course cor47 = new AdvancedCourses("Spinning", "Cycling", "Monday", 15.15, 16.15, "Rahman", 47);
            Course cor48 = new AdvancedCourses("Spinning", "Cycling", "Monday", 17.15, 18.15, "Özkan", 48);
            Course cor49 = new AdvancedCourses("Spinning", "Cycling", "Tuesday", 14.15, 15.15, "Rahman", 49);
            Course cor50 = new AdvancedCourses("Spinning", "Cycling", "Tuesday", 12.15, 13.15, "Buse", 50);
            Course cor51 = new AdvancedCourses("Spinning", "Cycling", "Wednesday", 12.15, 13.15, "Sinan", 51);
            Course cor52 = new AdvancedCourses("Spinning", "Cycling", "Wednesday", 18.15, 19.15, "Özkan", 52);
            Course cor53 = new AdvancedCourses("Spinning", "Cycling", "Thursday", 14.15, 15.15, "Rahman", 53);
            Course cor54 = new AdvancedCourses("Spinning", "Cycling", "Thursday", 17.15, 18.15, "Burak", 54);
            Course cor55 = new AdvancedCourses("Spinning", "Cycling", "Friday", 11.15, 12.15, "Buse", 55);
            Course cor56 = new AdvancedCourses("Spinning", "Cycling", "Friday", 16.15, 17.15, "Sinan", 56);
            Course cor57 = new AdvancedCourses("Spinning", "Cycling", "Saturday", 15.45, 16.45, "Rahman", 57);
            Course cor58 = new AdvancedCourses("Spinning", "Cycling", "Saturday", 19.35, 20.35, "Özkan", 58);
            Course cor59 = new AdvancedCourses("Spinning", "Cycling", "Sunday", 12, 13, "Buse", 59);
            Course cor60 = new AdvancedCourses("Crunch&Burn", "Gym Area", "Monday", 20.15, 20.55, "Burak", 60);
            Course cor61 = new AdvancedCourses("Crunch&Burn", "Gym Area", "Monday", 16.35, 17.15, "Yaren", 61);
            Course cor62 = new AdvancedCourses("Crunch&Burn", "Gym Area", "Tuesday", 20.15, 20.55, "Burak", 62);
            Course cor63 = new AdvancedCourses("Crunch&Burn", "Gym Area", "Tuesday", 11.05, 11.45, "Umut", 63);
            Course cor64 = new AdvancedCourses("Crunch&Burn", "Gym Area", "Thursday", 19.25, 20.05, "Burak", 64);
            Course cor65 = new AdvancedCourses("Crunch&Burn", "Gym Area", "Thursday", 18.15, 18.55, "Sinan", 65);
            Course cor66 = new AdvancedCourses("Crunch&Burn", "Gym Area", "Friday", 20.15, 20.55, "Mehtap", 66);
            Course cor67 = new AdvancedCourses("Crunch&Burn", "Gym Area", "Friday", 17.35, 18.15, "Burak", 67);
            Course cor68 = new AdvancedCourses("Strong Zumba", "Aerobic", "Monday", 17.05, 17.55, "Mehtap", 68);
            Course cor69 = new AdvancedCourses("Strong Zumba", "Aerobic", "Tuesday", 14.15, 15.05, "Can", 69);
            Course cor70 = new AdvancedCourses("Strong Zumba", "Aerobic", "Wednesday", 16.35, 17.25, "Mehtap", 70);
            Course cor71 = new AdvancedCourses("Strong Zumba", "Aerobic", "Thursday", 11.05, 11.55, "Can", 71);
            Course cor72 = new AdvancedCourses("Strong Zumba", "Aerobic", "Friday", 16.15, 17.05, "Mehtap", 72);

            AdvancedList.add(cor47);
            AdvancedList.add(cor48);
            AdvancedList.add(cor49);
            AdvancedList.add(cor50);
            AdvancedList.add(cor51);
            AdvancedList.add(cor52);
            AdvancedList.add(cor53);
            AdvancedList.add(cor54);
            AdvancedList.add(cor55);
            AdvancedList.add(cor56);
            AdvancedList.add(cor57);
            AdvancedList.add(cor58);
            AdvancedList.add(cor59);
            AdvancedList.add(cor60);
            AdvancedList.add(cor61);
            AdvancedList.add(cor62);
            AdvancedList.add(cor63);
            AdvancedList.add(cor64);
            AdvancedList.add(cor65);
            AdvancedList.add(cor66);
            AdvancedList.add(cor67);
            AdvancedList.add(cor68);
            AdvancedList.add(cor69);
            AdvancedList.add(cor70);
            AdvancedList.add(cor71);
            AdvancedList.add(cor72);

            ArrayList<Course> MySchedule = new ArrayList<>(); // for adding course to schedule


            while (check) {
                menu();
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Please enter your ID");
                        tempID = scanner.nextInt();
                        System.out.println("Please enter your Password");
                        tempPassword = scanner.nextInt();
                        while (choice != -1) {
                            for (User admin : ADarrayList) {
                                if (tempID == admin.getID() && tempPassword == admin.getPassword()) {
                                    System.out.println("Welcome " + admin.getName());
                                    adminMenu();
                                    choice = scanner.nextInt();
                                    switch (choice) {
                                        case 1:
                                            System.out.println("Now you are able to see member's information");
                                            System.out.println("-----------------");
                                            for (User memarlist : MemArrayList) {
                                                memarlist.printPrivateInfo();
                                                System.out.println("-----------------");
                                            }
                                            System.out.println(MemArrayList.size() + " members");
                                            break;
                                        case 2:
                                            System.out.println("Now you are able to see trainer's information");
                                            System.out.println("-----------------");
                                            for (User ptarlist : PTarraylist) {
                                                ptarlist.printPrivateInfo();
                                                System.out.println("-----------------");
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Now you are able to see  admin's information");
                                            System.out.println("-----------------");
                                            for (User adarlist : ADarrayList) {
                                                adarlist.printPrivateInfo();
                                            }
                                            break;
                                        case 4:
                                            for (User owninfo : ADarrayList) {
                                                if (tempID == owninfo.getID() && tempPassword == owninfo.getPassword()) {
                                                    owninfo.printOwnInfo();
                                                }
                                            }
                                            break;
                                        case 5:
                                            while (choice != -2) {
                                                SearchForAdminMenu();
                                                choice = scanner.nextInt();
                                                if (choice == 1) {
                                                    System.out.println("Please enter member's name");
                                                    tempName = scanner.next();
                                                    System.out.println("Please enter member's surname");
                                                    tempSurName = scanner.next();
                                                    for (User serchMember : MemArrayList) {
                                                        if (tempName.equals(serchMember.getName()) && tempSurName.equals(serchMember.getSurname())) {
                                                            serchMember.printPrivateInfo();
                                                        }
                                                    }
                                                } else if (choice == 2) {
                                                    System.out.println("Please enter trainer's name");
                                                    tempName = scanner.next();
                                                    System.out.println("Please enter trainer's surname");
                                                    tempSurName = scanner.next();
                                                    for (User searchTrainer : PTarraylist) {
                                                        if (tempName.equals(searchTrainer.getName()) && tempSurName.equals(searchTrainer.getSurname())) {
                                                            searchTrainer.printPrivateInfo();
                                                        }
                                                    }
                                                } else if (choice == -2) {
                                                    System.out.println("You are going to previous menu");
                                                } else {
                                                    System.out.println("You entered invalid choice");
                                                }
                                            }
                                            break;
                                        case 6:
                                            System.out.println("Log out your account...");
                                            System.out.println("*--------------------------*");

                                            choice = -1;
                                            break;
                                        case 7:
                                            System.out.println("System is closing now!!!");
                                            System.exit(0);
                                            break;
                                        default:
                                            System.out.println("You entered invalid choice!!!");
                                    }
                                    break;
                                } else {
                                    System.out.println("You entered wrong information");
                                    choice = -1;
                                    break;
                                }
                            }

                        }

                        break;
                    case 2:
                        System.out.println("Please enter your ID");
                        tempID = scanner.nextInt();
                        System.out.println("Please enter your Password");
                        tempPassword = scanner.nextInt();
                        while (choice != -1) {
                            for (User member : MemArrayList) {
                                if (tempID == member.getID() && tempPassword == member.getPassword()) {
                                    System.out.println("Welcome " + member.getName());
                                    memberMenu();
                                    choice = scanner.nextInt();
                                    switch (choice) {
                                        case 1:
                                            System.out.println("Now you are able to see your information");
                                            member.printOwnInfo();
                                            break;
                                        case 2:
                                            AddingCourseMenu();
                                            choice = scanner.nextInt();
                                            switch (choice) {
                                                case 1:
                                                    System.out.println("Please enter course level");
                                                    tempCourseLevel = scanner.next();
                                                    if (tempCourseLevel.equals("Beginner")) {
                                                        for (Course beginlist : BegginerList) {
                                                            beginlist.printCourseInfo();
                                                        }
                                                    } else if (tempCourseLevel.equals("Intermediate")) {
                                                        for (Course ınterlist : InterMediateList) {
                                                            ınterlist.printCourseInfo();
                                                        }
                                                    } else if (tempCourseLevel.equals("Advanced")) {
                                                        for (Course advancelist : AdvancedList) {
                                                            advancelist.printCourseInfo();
                                                        }
                                                    } else {
                                                        System.out.println("You entered wrong level");
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("BEGINNER");
                                                    for (Course beginlist : BegginerList) {
                                                        beginlist.printCourseInfo();
                                                    }

                                                    System.out.println();
                                                    System.out.println("---------------");
                                                    System.out.println("INTERMEDIATE");
                                                    for (Course ınterlist : AdvancedList) {
                                                        ınterlist.printCourseInfo();
                                                    }
                                                    System.out.println();
                                                    System.out.println("---------------");
                                                    System.out.println("ADVANCED");
                                                    for (Course advancelist : AdvancedList) {
                                                        advancelist.printCourseInfo();
                                                    }
                                                    break;
                                                case 3:
                                                    System.out.println("Please enter course name that is you want to add schedule schedule");
                                                    tempCourseName = scanner.next();
                                                    for (Course bglist : BegginerList) {
                                                        if (tempCourseName.equals(bglist.getCourseName())) {
                                                            //System.out.println("These are all "+ bglist.getCourseName()+ " courses"); döngüden dolayı hep tekrar
                                                            bglist.printCourseInfo();
                                                        }
                                                    }
                                                    for (Course ınterlist : InterMediateList) {
                                                        if (tempCourseName.equals(ınterlist.getCourseName())) {
                                                            ınterlist.printCourseInfo();
                                                        }
                                                    }
                                                    for (Course advanlist : AdvancedList) {
                                                        if (tempCourseName.equals(advanlist.getCourseName())) {
                                                            advanlist.printCourseInfo();
                                                        }
                                                    }
                                                    System.out.println("Do you want to filter day of courses if you want enter 'yes'--if you don't want enter 'no'");
                                                    answer = scanner.next();
                                                    if (answer.equals("yes")) {
                                                        System.out.println("Please enter day that is you want ");
                                                        tempCourseDay = scanner.next();
                                                        for (Course bglist : BegginerList) {
                                                            if (tempCourseName.equals(bglist.getCourseName()) && tempCourseDay.equals(bglist.getDay())) {
                                                                bglist.printCourseInfo();
                                                            }
                                                        }
                                                        for (Course interlist : InterMediateList) {
                                                            if (tempCourseName.equals(interlist.getCourseName()) && tempCourseDay.equals(interlist.getDay())) {
                                                                interlist.printCourseInfo();
                                                            }
                                                        }
                                                        for (Course advancelist : AdvancedList) {
                                                            if (tempCourseName.equals(advancelist.getCourseName()) && tempCourseDay.equals(advancelist.getDay())) {
                                                                advancelist.printCourseInfo();
                                                            }
                                                        }
                                                    } else if (answer.equals("no")) {
                                                        for (Course bglist : BegginerList) {
                                                            if (tempCourseName.equals(bglist.getCourseName())) {
                                                                bglist.printCourseInfo();
                                                            }
                                                        }
                                                        for (Course interlist : InterMediateList) {
                                                            if (tempCourseName.equals(interlist.getCourseName())) {
                                                                interlist.printCourseInfo();
                                                            }
                                                        }
                                                        for (Course advancelist : AdvancedList) {
                                                            if (tempCourseName.equals(advancelist.getCourseName())) {
                                                                advancelist.printCourseInfo();
                                                            }
                                                        }
                                                    }
                                                    while (choice != -3) {
                                                        System.out.println("Please enter course number to add your schedule");
                                                        tempCourseNumber = scanner.nextInt();
                                                        System.out.println("If you are done please press -3 to return previous menu");
                                                        System.out.println("If you want to add more press any key without -3");
                                                        choice = scanner.nextInt();

                                                        for (Course bglist : BegginerList) {
                                                            if (bglist.getCourseNumber() == tempCourseNumber) {
                                                                MySchedule.add(bglist);
                                                                break;
                                                            }

                                                        }
                                                        for (Course interlist : InterMediateList) {
                                                            if (interlist.getCourseNumber() == tempCourseNumber) {
                                                                MySchedule.add(interlist);
                                                                break;
                                                            }

                                                        }
                                                        for (Course advancelist : AdvancedList) {
                                                            if (advancelist.getCourseNumber() == tempCourseNumber) {
                                                                MySchedule.add(advancelist);
                                                                break;
                                                            }

                                                        }

                                                    }
                                                    break;
                                                case 4:
                                                    System.out.println("This is your weekly  schedule");
                                                    for (Course my : MySchedule) {
                                                        my.printCourseInfo();
                                                    }
                                                    break;
                                                case 5:
                                                    System.out.println("System is closing now");
                                                    System.exit(0);
                                                    break;
                                                default:
                                                    System.out.println("You entered invalid choice");
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            SearchForMemberMenu();
                                            answer = scanner.next();
                                            if (answer.equals("yes")) {
                                                System.out.println("Please enter personal trainer's name that is you want to search");
                                                tempName = scanner.next();
                                                System.out.println("Please enter personal trainer's surname that is you want to search");
                                                tempSurName = scanner.next();
                                                for (User searchPT : PTarraylist) {
                                                    if (tempName.equals(searchPT.getName()) && tempSurName.equals(searchPT.getSurname())) {
                                                        searchPT.printPrivateInfo();
                                                    }
                                                }
                                            } else if (answer.equals("no")) {
                                                System.out.println("These are all personal trainers you can send e-mail to rent him/her");
                                                for (User allPT : PTarraylist) {
                                                    allPT.printPrivateInfo();
                                                }
                                            } else {
                                                System.out.println("You entered wrong choice");
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Please enter you ID");
                                            tempID = scanner.nextInt();
                                            System.out.println("Please enter your password");
                                            tempPassword = scanner.nextInt();
                                            if (tempID == member.getID() && tempPassword == member.getPassword()) {
                                                MemArrayList.remove(member);
                                                System.out.println("Your membership successfully removed ");
                                                System.out.println("We will miss you !!!");
                                                choice = -1;
                                            } else {
                                                System.out.println("Wrong information !!! please check your information");
                                                choice = 0;
                                            }
                                            break;
                                        case 5:
                                            System.out.println("Log out your account...");
                                            System.out.println("*--------------------------*");
                                            choice = -1;
                                            break;
                                        case 6:
                                            System.out.println("System is closing now");
                                            System.exit(0);
                                            break;
                                        default:
                                            System.out.println("You entered invalid choice");
                                    }
                                    break;
                                } /*else {
                                    System.out.println("You entered wrong information");
                                    choice=-1;
                                    break;  bunu ekleyince yeni kayıt olan üye wrong information hatası veriyor
                                }*/
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Please enter your ID");
                        tempID = scanner.nextInt();
                        System.out.println("Please enter your password");
                        tempPassword = scanner.nextInt();
                        while (choice != -1) {
                            for (User trainer : PTarraylist) {
                                if (tempID == trainer.getID() && tempPassword == trainer.getPassword()) {
                                    System.out.println("Welcome " + trainer.getName());
                                    trainerMenu();
                                    choice = scanner.nextInt();
                                    switch (choice) {
                                        case 1:
                                            System.out.println("Now you are able to see your own information");
                                            trainer.printOwnInfo();
                                            break;
                                        case 2:
                                            while (choice != -2) {
                                                SearchForTrainerMenu();
                                                choice = scanner.nextInt();
                                                if (choice == -2) {
                                                    System.out.println("You are going to previous menu ");
                                                    break;
                                                }
                                                System.out.println("Please enter member's name that is you want to search");
                                                tempName = scanner.next();
                                                System.out.println("Please enter member's surname that is you want to search");
                                                tempSurName = scanner.next();
                                                for (User searchMem : MemArrayList) {
                                                    if (tempName.equals(searchMem.getName()) && tempSurName.equals(searchMem.getSurname())) {
                                                        searchMem.printGeneralInfo();
                                                        break;
                                                    }
                                                }
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Log out your account...");
                                            System.out.println("*--------------------------*");

                                            choice = -1;
                                            break;
                                        case 4:
                                            System.out.println("System is closing now!!!");
                                            System.exit(0);
                                            break;
                                        default:
                                            System.out.println("You entered invalid choice");
                                    }
                                    break;
                                } else {
                                    System.out.println("You entered wrong information");
                                    choice=-1;
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Please fill information paper ");
                        System.out.println("Please enter your name");
                        tempName = scanner.next();
                        System.out.println("Please enter your surname");
                        tempSurName = scanner.next();
                        System.out.println("Please enter your password");
                        tempPassword = scanner.nextInt();
                        System.out.println("Please enter your age");
                        tempAge = scanner.nextInt();
                        System.out.println("Please enter your gender");
                        tempGender = scanner.next();
                        System.out.println("Please enter your e-mail");
                        tempEmail = scanner.next();
                        tempTrainingGrade = 0;
                        System.out.println("Please enter your level");
                        tempLevel = scanner.next();
                        System.out.println("Please enter your length");
                        tempLength = scanner.nextDouble();
                        System.out.println("Please enter your weight");
                        tempWeight = scanner.nextDouble();
                        tempID = random.nextInt(1000) + 1000;
                        System.out.println("Please notice your ID: " + tempID);
                        MemArrayList.add(new Member(tempName, tempSurName, tempID, tempPassword, tempAge, tempGender, tempEmail, tempTrainingGrade, tempLevel, tempLength,
                                tempWeight));
                        System.out.println("Your membership is successful!!");
                        System.out.println("You can check your account"); // ekleniyor basıyor fakat error veriyor
                        try {
                            FileOutputStream fileOutputStream=new FileOutputStream("MemArrayList.ser");
                            ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
                            outputStream.writeObject(MemArrayList);
                            outputStream.close();
                            fileOutputStream.close();
                            System.out.println("Serialized data is saved ");
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            FileInputStream fileInputStream=new FileInputStream("MemArrayList.ser");
                            ObjectInputStream in=new ObjectInputStream(fileInputStream);
                            in.readObject();
                            in.close();
                            fileInputStream.close();
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        System.out.println("Gym Center is closing now GoodBye");
                        System.exit(0);
                        check = false;
                        break;
                    default:
                        System.out.println("You entered wrong choice");
                        System.out.println("Please try again");
                        break;
                }

            }

    }


            public static void menu () {
                System.out.println("Welcome to our Gym Center");
                System.out.println("You are going to go Menu");
                System.out.println("Please press 1 to continue by Admin format");
                System.out.println("Please press 2 to continue by Member format");
                System.out.println("Please press 3 to continue by Trainer format");
                System.out.println("Please press 4 to Join Us");
                System.out.println("Please press 5 to close Gym Center");
                System.out.println("What is your choice ?");

            }
            public static void adminMenu () {
                System.out.println("Please press 1 to see member's information");
                System.out.println("Please press 2 to see trainer's information");
                System.out.println("Please press 3 to see admin's information");
                System.out.println("Please press 4 to see your own information");
                System.out.println("Please press 5 to search whatever you want(admin/member/trainer) ");
                System.out.println("Please press 6 to log out your account");
                System.out.println("Please press 7 to close admin's menu");
                System.out.println("What do you want ?");
            }
            public static void memberMenu () {
                System.out.println("Please press 1 to see your own information");
                System.out.println("Please press 2 to obtain information about courses and organize your weekly schedule");
                System.out.println("Please press 3 to rent personal trainer");
                System.out.println("Please press 4 to cancel your membership");
                System.out.println("Please press 5 to log out your account");
                System.out.println("Please press 6 to close member's menu");
                System.out.println("What do you want ?");
            }
            public static void trainerMenu () {
                System.out.println("Please press 1 to see your own information");
                System.out.println("Please press 2 to check your student's information");
                System.out.println("Please press 3 to log out your account");
                System.out.println("Please press 4 to close trainer's menu");
                System.out.println("What is your choice?");
            }
            public static void SearchForAdminMenu () {
                System.out.println("Please press 1 to search member");
                System.out.println("Please press 2 to search trainer");
                System.out.println("Please press -2 to return previous menu");
                System.out.println("Who would like to search ?");
            }
            public static void SearchForMemberMenu () {
                System.out.println("Please enter 'yes' to search personal trainer");
                System.out.println("Please enter 'no' to see all personal trainers");
                System.out.println("Please press -2 to return previous menu");

                System.out.println("Please do not forget you are not able to see admin's and other member's information because of privacy!!!");
            }
            public static void SearchForTrainerMenu () {
                System.out.println("If you want search any member please press any key without -2  ");
                System.out.println("Please press -2 to return previous menu ");
                System.out.println("Please do not forget you are not able to see admin's and other trainer's information because of privacy!!!");
            }
            public static void AddingCourseMenu () {
                System.out.println("Please press 1 to see appropriate courses according to your level ");
                System.out.println("Please press 2 to see all courses");
                System.out.println("Please press 3 to add courses to your weekly schedule");
                System.out.println("Please press 4 to see your weekly schedule");
                System.out.println("Please press -2 to return previous menu");
            }


        }