WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
public class Student   implements java.io.Serializable
{
  private String name;
  private String id;
  private double gpa;

  public Student( String name, String id, double gpa )
  {
    this.name = name;
    this.id = id;
    this.gpa = gpa;
  }

  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa( double gpa ) {
    this.gpa = gpa;
  }
}

