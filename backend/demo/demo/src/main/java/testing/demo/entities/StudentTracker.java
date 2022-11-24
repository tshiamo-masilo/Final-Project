package testing.demo.entities;

public class StudentTracker {

    private String schoolName;
    private String grade;
    private String status;

    public StudentTracker(String schoolName, String grade, String status) {
        this.schoolName = schoolName;
        this.grade = grade;
        this.status = status;
    }

    public String getSchoolName(){
     return this.schoolName;
    }
    
    public String getGrade(){
        return this.grade;   
    }
    
    public String getStatus(){
        return this.status;
    }

}