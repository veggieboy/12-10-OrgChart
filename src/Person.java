public class Person
{
  private int age;
  private String name1;
  private String name2;
  
  public Person()
  {
    name1="";
    name2="";
    age=0;
  }
  
  public Person (int age, String name1, String name2)
  {
    this.name1=name1;
    this.name2=name2;
    this.age=age;
  }
 
  public String getFirstName()
  {
    return name1;
  }
  
    public String getLastName()
  {
    return name2;
  }
 
  public String toString()
  {
    return name2+", "+name1;
  }
  
  public void recordBirthday()
  {
    age=age++;
  }
}
