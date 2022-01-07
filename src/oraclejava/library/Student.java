
package oraclejava.library;

public class Student {
    
    private int studentId;
    private String studentName;
    private String studentLastname;
    private String studentAddress;
  
   
    public Student(int id, String studentName, String studentLastname, String studentAddress) {
        this.studentId = id;
        this.studentName = studentName;
        this.studentLastname = studentLastname;
        this.studentAddress = studentAddress;
        
       
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

 

    public int getId() {
        return studentId;
    }

    public void setId(int id) {
        this.studentId = id;
    }

  

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    public void setStudentLastname(String studentLastname) {
        this.studentLastname = studentLastname;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

  
    
    
}
