import lombok.AllArgsConstructor;
import lombok.Data;



public class Dermatology extends Doctors{
    public Dermatology(String name, int age, int experienceInYears, String profession, double salary) {
        super(name, age, experienceInYears, profession, salary);
    }

    public void skinCheck(){
        System.out.println("Dermatology check patient skin and give him a referral");
    }
}
