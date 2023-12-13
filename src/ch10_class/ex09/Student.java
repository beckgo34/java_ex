package ch10_class.ex09;

public class Student {
    // 필드, getter/setter, 기본생성자, 매개변수 생성자, toString
    private String studentName;
    private String studentNumber;
    private String studentMajor;
    private String studentMobile;

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber(){
        return studentNumber;
    }

    public void  setStudentMajor(String studentMajor){
        this.studentMajor = studentMajor;
    }

    public String getStudentMajor(){
        return studentMajor;
    }

    public void setStudentMobile(String studentMobile){
        this.studentMobile = studentMobile;
    }

    public String getStudentMobile(){
        return studentMobile;
    }
    public Student(){

    }

    public Student(String studentName, String studentNumber, String studentMajor, String studentMobile){
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.studentMajor = studentMajor;
        this.studentMobile = studentMobile;
    }
    public void print(){
        System.out.println("이름: " + getStudentName());
        System.out.println("학번: " + getStudentNumber());
        System.out.println("학과: " + getStudentMajor());
        System.out.println("번호: " + getStudentMobile());

    }

    /**
     * method name: toString
     * return type: String
     * parameter: X
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }
}
