public class StudentManager {
    public static void main (String[] args) {
        Student ada = new Student("Ada Lovelace", 10,  12336, 4);
        Student alan = new Student("Alan Turing", 12, 12346, 3.8, 9);
        Student margret = new Student("Margret Hamilton", 12, 12347, 3.92, 0);
        System.out.println(ada.isGraduating());
        System.out.println(alan.isGraduating());
        System.out.println(margret.isGraduating());
        System.out.println(ada.ID);
        System.out.println(ada.getGpa());
        ada.setName("Ricky");
        System.out.println(ada.name);
    }
}
