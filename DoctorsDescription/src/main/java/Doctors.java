import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Doctors {
    String name;
    int age;
    int experienceInYears;
    String profession;
    double salary;

    public void rotation(int rotationTime){
        System.out.println(profession + " have " +rotationTime + " work hours");
    }
}
