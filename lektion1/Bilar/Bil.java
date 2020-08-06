public class Bil {
    private String registreringsnummer;
    private String tillverkare;
    private int år;

    public Bil(String registreringsnummer, String tillverkare, int år) {
        this.registreringsnummer = registreringsnummer;
        this.tillverkare = tillverkare;
        this.år = år;
    }

    public void printInformation() {
        System.out.println(registreringsnummer + ": ");
        System.out.println("\t" + tillverkare + " - " + år);
    }
}