public class Student {
    String name;
    private int grad ;
    int ID;
    double GPA;
    int abs;

    public Student(String name, int grad, int ID, double GPA, int abs) {
        this.name = name;
        this.grad = grad;
        this.ID = ID;
        this.GPA = GPA;
        this.abs = abs;
    }
    public Student(String name, int grad, int ID, double GPA){
        this.name = name;
        this.grad = grad;
        this.ID = ID;
        this.GPA = GPA;
    }

    public boolean isGraduating() {
        return (GPA > 2.0 && abs < 10 && grad == 12);
    }
    public double getGpa() {
        return GPA;
    }
    public void setName(String name) {
        if (name.indexOf(" ") != -1) {
            throw new IllegalArgumentException("names cannot contain spaces");
        }
        this.name = name.toLowerCase();
    }
}
