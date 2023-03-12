
public class Main {
    public static void main(String[] args) {
        Doctors doctors1 = new Doctors("Petro", 26, 4, "3D Design", 800);
        doctors1.rotation(9);
        doctors1.setAge(26);
        doctors1.setExperienceInYears(4);
        System.out.println(doctors1.getAge());
        System.out.println(doctors1.getExperienceInYears());

    }
}
