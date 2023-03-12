import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class Doctors {
    public String name;
    public int age;
    public int experienceInYears;
    public String profession;
    public double salary;

    public void rotation(int rotationTime){
        System.out.println(profession + " have " +rotationTime + " work hours");
    }

}
