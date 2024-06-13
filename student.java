class Student extends Person { 
    protected String myIdNum; // Student Id Number protected double myGPA; // grade point average
    protected double myGPA;
    //constructor

    public Student(String name, int age, String gender, String idNum, double gpa) {
    super(name, age, gender);
    myIdNum = idNum;
    
    myGPA = gpa;
    
    } 
    //getters and setters
    public String getID(){
        return myIdNum;
    }
    public double getGPA(){
        return myGPA;
    }
    public void setID(String ID){
        this.myIdNum = ID;
    }
    public void setGPA(double GPA){
        this.myGPA = GPA;
    }
}
