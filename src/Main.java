import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader brDep = new BufferedReader(new FileReader("department.csv"));
        BufferedReader brIns = new BufferedReader(new FileReader("instructor.csv"));

        List<String> instructors = new ArrayList<>();
        List<String> departments = new ArrayList<>();

        String id = "22222";
        String name = "Einstein";

        String resultRow = "";
        String resultRow2 = "";

        String line;
        String line2;

        // consume instructor csv
        while ((line = brIns.readLine()) != null) {
            instructors.add(line);
        }

        // consume department csv
        while ((line2 = brDep.readLine()) != null) {
            departments.add(line2);
        }

        // select name
        for (String instructor : instructors) {
            String[] values = instructor.split(",");
            if (values[0].equals(id)) { // instructor id == "22222"
                resultRow = values[1];
                break;
            }
        }
        System.out.println(resultRow);

        // select building
        for (String instructor : instructors) {
            String[] values = instructor.split(",");
            for (String department : departments) {
                String[] values2 = department.split(",");
                if (values[2].equals(values2[0]) && values[1].equals(name)) { // instructor.dept_name == department.dept_name and name = "Einstein"
                    resultRow2 = values2[1];
                    break;
                }
            }
        }
        brIns.close();
        brDep.close();
        System.out.println(resultRow2);
    }
}