import Comparatorer.AldersGruppeComparator;
import Comparatorer.RegionComparator;
import Covid19Data.Covid19Data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Covid19Data> dataObjekter = new ArrayList<>();

        FileHandler filehandler = new FileHandler();
        dataObjekter = filehandler.loadData();
        Collections.sort(dataObjekter, new RegionComparator().thenComparing(new RegionComparator()));
        System.out.println("Liste over Covid19Data:" + "\n" +
                "Listen er sorteret primært efter region, & sekundært aldersgruppe: " + dataObjekter);
    }
}
