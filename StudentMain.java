public class StudentMain{
    public static void main(String[] args) {
        Student s1 = new Student("Med", "Seab");
        Student s2 = new Student("CSA", "Ian");
        System.out.println(s1.isSameClub(s2));
    }
}