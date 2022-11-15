package Email_Creation;

import java.util.Scanner;

public class EmailApp {

    String firstName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix = "clarusway.com";// şirket domaini dr@clarusway.com
    int mailBoxCapacity = 1000;
    int defaultPassWordLength = 12;

  public EmailApp(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.department=setDepartment();
      System.out.println("DEpratman "+department);
      this.passWord= setRandomPassWord(defaultPassWordLength);
      System.out.println("passWord = " + passWord);
      email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department+emailSuffix;
  }

/*
testautomation.
fulstackdeveloper.
salesforce.
hicbiri
 */

    public String setDepartment() {
        System.out.println("Lütfen Aşağıda belirtilen Departmanlarından Herhangi birini Seçiniz...\n"+"\n1 Test Automation \n2 Full Stack Developer \n3 SAles Force \n0 Hiçbiri\n");
        Scanner scanner = new Scanner(System.in);

        int options=scanner.nextInt();

        if (options==1){
            return "testautomation";

        }else if (options==2){
            return "fulstackdeveloper";
        }else if (options==3){
            return "salesforce";
        }else {
            return "";
        }



    }
    // int length=12;
    public String setRandomPassWord(int length){
        String passWordSet="ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";
        char [] passWord = new char[length];

        for (int i = 0; i <length ; i++) {
            int random = (int) (Math.random()*passWordSet.length());
           // System.out.println("(int) (Math.random()*passWordSet.length()) = " + (int) (Math.random() * 5));

            passWord[i] = passWordSet.charAt(random);
        }
         return new String(passWord);
    }

public String showInfo(){
        return "Ad-Soyad : "+firstName+" "+lastName+"\n"+"Şirket Email : "+email+"\n"+" Capasity :"+mailBoxCapacity+" mb"+"\nPassword :"+passWord;
}
}
