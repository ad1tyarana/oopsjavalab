class Player {
    protected String name;
    protected int age;
    protected String position;
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;}
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);}
    public void play() {
        System.out.println(name + " is playing.");
    }
    public void train() {
        System.out.println(name + " is training.");}
}
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position);}
    public void play() {
        System.out.println(name + " is playing cricket as a " + position + ".");}
    public void train() {
        System.out.println(name + " is practicing batting and bowling.");}
}
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position);}
    public void play() {
        System.out.println(name + " is playing football as a " + position + ".");}
    public void train() {
        System.out.println(name + " is practicing dribbling and shooting.");}
}
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position);}
    public void play() {
        System.out.println(name + " is playing hockey as a " + position + ".");}
    public void train() {
        System.out.println(name + " is practicing stick handling and passing.");}
}
public class SportsMain {
    public static void main(String[] args) {
        Cricket_Player cricketPlayer = new Cricket_Player("Virat Kohli", 35, "Batsman");
        Football_Player footballPlayer = new Football_Player("Lionel Messi", 37, "Forward");
        Hockey_Player hockeyPlayer = new Hockey_Player("Wayne Gretzky", 45, "Center");
        System.out.println("Cricket Player:");
        cricketPlayer.displayInfo();
        cricketPlayer.play();
        cricketPlayer.train();
        System.out.println();
        System.out.println("Football Player:");
        footballPlayer.displayInfo();
        footballPlayer.play();
        footballPlayer.train();
        System.out.println();
        System.out.println("Hockey Player:");
        hockeyPlayer.displayInfo();
        hockeyPlayer.play();
        hockeyPlayer.train();}
}
