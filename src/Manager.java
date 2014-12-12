public class Manager extends Employee
{
  private ArrayList<Employee> directReports=new ArrayList<Employee>();
  private String department;
  public Manager(String first, String last, int age, double wage, int hours, String job, String dept)
  {
    super(first, last, age, wage, hours, job);
    department=dept;
  }
  public String getDepartment()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports()
  {
    return directReports;
  }
  public String toString()
  {
    return super.getFirstName()+": "+super.toString();
  }
  public void addDirectReport(Employee employee)
  {
    directReports.add(employee);
  }
  public void removeDirectReport(Employee employee)
  {
    directReports.remove(employee);
  }
  public void setDepartment(String dept)
  {
    department=dept;
  }
}
