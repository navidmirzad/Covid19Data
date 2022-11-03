import Covid19Data.Covid19Data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<Covid19Data> loadData() throws IOException {
        Scanner reader = new Scanner(new File("data/11_noegletal_pr_region_pr_aldersgruppe.csv"), StandardCharsets.ISO_8859_1);

        ArrayList<Covid19Data> dataObjekter = new ArrayList<>();

        reader.nextLine();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();

            Covid19Data dataObjekt = parseCSVLine(line);

            dataObjekter.add(dataObjekt);
        }
        return dataObjekter;
    }

    private Covid19Data parseCSVLine(String line) {
        String[] parts = line.split(";");

        Covid19Data dataObjekt = new Covid19Data();
        dataObjekt.setRegion(parts[0]);
        dataObjekt.setAldersgruppe(parts[1]);
        int tilfælde = Integer.parseInt(parts[2]);
        dataObjekt.setBekræftedeTilfæde(tilfælde);
        dataObjekt.setDøde(Integer.parseInt(parts[3]));
        dataObjekt.setIndlagte(Integer.parseInt(parts[4]));
        dataObjekt.setDato(parts[5]);
        return dataObjekt;
    }

}
