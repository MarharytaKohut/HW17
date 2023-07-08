public class Program {
    public static void main(String[] args) {
        FitnessTracker will = new FitnessTracker("Will", 1970, 8, 20, "willking@gmail.com",
                380964477, "King", 81, "130/80", 1500);
        will.printAccountInfo();
        FitnessTracker melissa = new FitnessTracker("Melissa", 1990, 10, 13, "melissaking@gmail.com",
                380631930, "King", 62, "120/80", 3100);
        melissa.printAccountInfo();
        melissa.setWeight(66);
        melissa.setSteps(4500);
        melissa.printAccountInfo();
        FitnessTracker harold = new FitnessTracker("Harold", 1991, 9, 1, "harold91@gmail.com",
                38050492, "Assange", 85, "110/72", 1200);
        harold.printAccountInfo();
        harold.setSurname("King");
        harold.setPressure("136/90");
        harold.printAccountInfo();
    }
}
