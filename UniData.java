public class UniData {
    private String rank;
    private String name;
    private String country;
    private String overallScore;

    public UniData(String rank, String name, String country, String overallScore) {
        this.rank = rank;
        this.name = name;
        this.country = country;
        this.overallScore = overallScore;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Rank: " + rank);
        System.out.println("Institution Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Overall Score: " + overallScore);
        System.out.println("-------------------------");
    }
}
