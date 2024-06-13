class collegeStudent extends Student{
    protected String major;
    protected int year;
    //constructors
    public collegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year){
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }
    //getters and setters
    public void setMajor(String major){
        this.major = major;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getMajor(){
        return major;
    }
    public int getYear(){
        return year;
    }
    //String method
    public String toString(){
        return super.toString() + ", ID Num: " + super.getID() + ", GPA: " + super.getGPA() + ", Major: " + major + ", Year: " + year;
    }


}