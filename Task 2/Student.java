
public class Student extends Person{   //inheritation Person class 
   
    //variable declaration
    private int id;
    
    //method without parameter
    public void studentDisplay(){
        personDisplay();    //
        System.out.println("Id : " + id);
    }
    
    //method with parameter
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
