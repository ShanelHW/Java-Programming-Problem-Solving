
public class Final {

    public class Employee {
        //attributes
        public int ssn;
        public String first;
        public String last;
        
        //Constructor
       public Employee(int ssn, String first, String last) {
           this.ssn = ssn;
           this.first = first;
           this.last = last;
        }
       
       //methods
        public int getSsn(){       
        return ssn;
        }
        public int setSsn(int ssn){
            this.ssn = ssn;
            return ssn;}
        
        public String getFirst(){       
        return first;
        }
        public String setFirst(String first){
            this.first = first;
            return first;}
        
        public String getLast(){       
        return last;
        }
        public String setLast(String last){
            this.last = last;
            return last;}
       
      //toString Override
       @Override
        public String toString(){
       //first + last + ssn 
          String employeeInfo = " First: " + first + " Last: " + last + "SSN: " + ssn;
          return employeeInfo;
        }
    }
    public class HourlyEmployee extends Employee {
        //hourly attributes
        double wage;
        double hoursWorked;
        
        //hourly methods
        public double getWage(){       
        return wage;
        }
        public double setWage(double wage){
            this.wage= wage;
            return wage;}
        
        public double getHoursWorked(){       
            return hoursWorked;
        }
        
        public double setHoursWorked(double hoursWorked){
            this.hoursWorked = hoursWorked;
            return hoursWorked;
        }
        //hourly constructor
        public HourlyEmployee(int ssn, String first, String last,double wage, double hoursWorked){
            super(ssn, first, last);
            this.wage = wage;
            this.hoursWorked = hoursWorked;
    }
       //toStringOverride
        @Override
        public String toString(){
       //wage and hours worked
            String employeeInfo = "Wage: " + wage + " Hours Worked: " + hoursWorked;
            return employeeInfo;
        }
    }
   
    
      
        public static void main(String[] args) {
       //Main method args
            Employee nh00 = new Employee("Natasha", "Hickman", 000000000);
            System.out.println(nh00.toString());
            
            HourlyEmployee nh01 = new HourlyEmployee("Natasha", "Hickman", 0000000001, 12.50,40);
            System.out.println(nh01.toString());
       }

    } 

