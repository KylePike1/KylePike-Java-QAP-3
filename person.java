class Person {

    protected String name ;
    protected int age;
    protected String gender;                    
    // name of the person protected int myAge; // person’s age protected String myGender; // “M” for male, “F” for female
    
    public Person(String name, int age, String gender) {
    
    this.name = name; 
    this.age = age; 
    this.gender = gender; 
    }
    
    public String toString() { 
        return this.name + " Age:" + this.age + ", Gender: " + this.gender; 
    } 
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public void setAge( int age){
        this.age = age;
    }
    public void setName( String name){
        this.name = name;
    }
    public void setGender( String gender){
        this.gender = gender;
    }
    
    
}