import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String csvFile = "2026 QS World University Rankings 2.csv"; 
        searchUniversity(csvFile, "Chiang Mai University");
    }

    public static void searchUniversity(String filePath, String searchName) {
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1); 
                
                if (data.length >= 30) {
                    UniData uni = new UniData(data[0], data[2].replace("\"", ""), data[3], data[29]);
                    
                    if (uni.getName().equalsIgnoreCase(searchName)) {
                        System.out.println("University found:");
                        uni.displayInfo();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
