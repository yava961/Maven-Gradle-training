import lombok.AllArgsConstructor;
import lombok.Data;



public class Therapist extends Doctors{
    public Therapist(String name, int age, int experienceInYears, String profession, double salary) {
        super(name, age, experienceInYears, profession, salary);
    }



    public void referral(){
    System.out.println("Therapist can give a referral to his pacient");
}
}
