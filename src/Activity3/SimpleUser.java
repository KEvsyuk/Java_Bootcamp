package Activity3;

import java.util.Date;

public class SimpleUser {
    private String name;
    private int id;
    //check if date is in date format "**/**/**" + check if age=today()-DateOfBirth
    private String DateOfBirth;
    private String gender;
    //check the age
    private int age;

    //SimpleUser simpleUser = new SimpleUser();


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }
    public SimpleUser(int id, String name, String DateOfBirth, String gender, int age){
        this.id = 12345;
        this.name = "George";
        this.DateOfBirth = "23/03/1992";
        if (DateOfBirth.equals("**/**/****")){
            return;
        }else{
            System.out.println("Please, input the date ");
        }
        this.gender = "male";
        this.age = 30;
    }
}
