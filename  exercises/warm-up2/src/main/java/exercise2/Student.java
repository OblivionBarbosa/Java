package exercise2;

/**
 * Created by Radu.Hoaghe on 31.10.2014.
 */
public class Student {
    private final String firstName;
    private final String lastName;
    private final Double averageGrade;

    public Student(String firstName, String lastName, Double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    // TODO Exercise 2 c) Override the equals() method
    @Override
    public boolean equals(Object o) {
        // TODO Exercise 2 c1) Check if the current instance is the same instance as the one from Object o
           if(this == o) return true;
        // TODO Exercise 2 c2) Check if Object o is null
           if(o == null) return false;
        // TODO Exercise 2 c3) Cast the object into a Student variable
        // TODO Exercise 2 c3) Check if all the fields from Student class are equal to the ones from
        // TODO Exercise 2 c3) the variable that you casted earlier (lastName, firstName, averageGrade)

           if(getClass()!=o.getClass()) return false;

        Student s= (Student) o;
        if(!firstName.equals(s.firstName)) return false;
        if(!lastName.equals(s.lastName)) return false;
        if(!averageGrade.equals(s.averageGrade)) return false;
        return true;
        // TODO Exercise 2 d) After you finished implementing equals method go to TODO Exercise 2 e) from Exercise2 class
    }

    // TODO Exercise 2 g) Override the hashCode() method
    // TODO Exercise 2 g) Hint: Don't forget to include in the hashCode result all the fields from
    // TODO Exercise 2 g) the Student class
    @Override
    public int hashCode() {
        int result=1;
        int c;

        c= firstName.hashCode();
        result = 31 * result + c;

        c= lastName.hashCode();
        result = 31 * result + c;

        c= averageGrade.hashCode();
        result = 31 * result + c;



        return result;
        // TODO Exercise 2 h) After you finished implementing hashCode go to TODO Exercise 2 i) from Exercise2 class
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
