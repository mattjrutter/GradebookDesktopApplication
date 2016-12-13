package gradebookPackage;


public class Student {
    String name, grade;
    Integer prog1, prog2, prog3;
    Double gradenum;
    Student(String _name, Integer _prog1, Integer _prog2, Integer _prog3){
        this.name = _name;
        this.prog1 = _prog1;
        this.prog2 = _prog2;
        this.prog3 = _prog3;
        this.grade = this.getGrade();
    }
    
    public String getGrade(){
        this.gradenum = (this.prog1+this.prog2+this.prog3)/3.0;
        return this.findGrade() + "  -  " + round(this.gradenum);
    }
            
    public String findGrade(){
        String letter;
        if (this.gradenum >=90)
            letter = "A";
        else if(this.gradenum >=80)
            letter = "B";
        else if(this.gradenum >=70)
            letter = "C";
        else if(this.gradenum >=60)
            letter = "D";
        else 
            letter = "F";
        return letter;
    }
    
    public Double round(Double num){
        num = num * 100;
        Integer temp = num.intValue();
        num = temp * 0.01;
        return num;
    }
}
