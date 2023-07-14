public class Person{
    //variable declaration with acces modifier
    private String name;
    private int age;
    private String gender;

    //method without parameter
    public void personDisplay(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Gender : "+ gender);
    }
    
    //method with parameter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}