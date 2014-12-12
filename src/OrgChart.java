public class OrgChart
 {
   public static void main(String[] args)
   {
     Manager m1=new Manager("Carlsen", "Magnus", 3, 1.0, 1, "Chess Player", "IT");
     Manager m2=new Manager("John", "Jimmy", 52, 50.0, 3, "Project manager", "Projects");
     Employee e1=new Employee("Windu", "Mace", 4, 2.0,1, "Jedi");
     e1.setManager(m1);
     Employee e2=new Employee("Powers", "Austin", 6, 3.0,2, "Swinger");
     e2.setManager(m1);
     Employee e3=new Employee("Krabs", "Eugene", 60, 4.0,2, "Owner");
     e3.setManager(m1);
     e3.setManager(m2);
     System.out.println(m1.toString()+"\n\t"+e1.toString()+"\n\t"+e2.toString());
    System.out.println(m2.toString()+"\n\t"+e3.toString());
   }
 }
