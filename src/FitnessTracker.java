public class FitnessTracker {
    private String name;
    private int year;
    private int month;
    private int day;
    private String email;
    private int phone;
    private String surname;
    private double weight;
    private String pressure;
    private int steps;
    private int age;

    public FitnessTracker(String name, int year, int month, int day, String email, int phone,
                          String surname, double weight, String pressure, int steps) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = 2020 - year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public double getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getSteps() {
        return steps;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void printAccountInfo(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "FitnessTracker{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", pressure='" + pressure + '\'' +
                ", steps=" + steps +
                ", age=" + age +
                '}';
    }
}
