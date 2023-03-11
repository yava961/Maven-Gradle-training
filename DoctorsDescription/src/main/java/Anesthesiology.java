import lombok.AllArgsConstructor;
import lombok.Data;



class Anesthesiology extends Doctors{
    public Anesthesiology(String name, int age, int experienceInYears, String profession, double salary) {
        super(name, age, experienceInYears, profession, salary);
    }

    public void prepareToOperation(){
        System.out.println("Anesthesiology prepare patient before operation");
    }
}
