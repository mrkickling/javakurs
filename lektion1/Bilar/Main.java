public class Main {
    public static void main(String[] args) {
        Bil bil1 = new Bil("ABC123", "Opel", 2010);
        Bil bil2 = new Bil("HXU493", "Volvo", 2009);
        Bil bil3 = new Bil("VKU953", "Tesla", 2018);
        bil1.printInformation();
        bil2.printInformation();
        bil3.printInformation();
    }
}