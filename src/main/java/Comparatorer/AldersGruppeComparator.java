package Comparatorer;

import Covid19Data.Covid19Data;

import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19Data> {
    public int compare(Covid19Data ag1, Covid19Data ag2) {
        return ag1.getAldersgruppe().compareTo(ag2.getAldersgruppe());
    }
}
