package Comparatorer;

import Covid19Data.Covid19Data;

import javax.swing.plaf.synth.Region;
import java.util.Comparator;

public class RegionComparator implements Comparator<Covid19Data> {

    public int compare(Covid19Data r1, Covid19Data r2) {
        return r1.getRegion().compareTo(r2.getRegion());
    }
}

