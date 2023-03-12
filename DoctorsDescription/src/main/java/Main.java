public class Main {
    public static void main(String[] args) {


        Therapist therapist = new Therapist("Petro", 35, 5, "Therapist", 5000.0);
        Dermatology dermatology = new Dermatology("Ivan", 30, 3, "Dermatology", 3000.0);
        Anesthesiology anesthesiology = new Anesthesiology("Andriy", 25, 2, "Anesthesiology", 1500.0);
        therapist.referral();
        System.out.println(therapist.getName());
        therapist.rotation(8);

        System.out.println("\u001B[33m" + "----------------------");

        dermatology.skinCheck();
        System.out.println(dermatology.salary);
        dermatology.rotation(10);

        System.out.println("\u001B[31m" + "----------------------");

        anesthesiology.prepareToOperation();
        System.out.println(anesthesiology.getExperienceInYears());
        anesthesiology.rotation(5);
    }
}
