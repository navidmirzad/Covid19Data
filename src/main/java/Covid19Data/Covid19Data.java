package Covid19Data;

public class Covid19Data {

    public Covid19Data() {
    }

    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfæde;
    private int døde;
    private int indlagte;
    private String dato;

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getBekræftedeTilfæde() {
        return bekræftedeTilfæde;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfæde, int døde, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekræftedeTilfæde = bekræftedeTilfæde;
        this.døde = døde;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setAldersgruppe(String aldersgruppe) {
        this.aldersgruppe = aldersgruppe;
    }

    public void setBekræftedeTilfæde(int bekræftedeTilfæde) {
        this.bekræftedeTilfæde = bekræftedeTilfæde;
    }

    public void setDøde(int døde) {
        this.døde = døde;
    }

    public void setIndlagte(int indlagte) {
        this.indlagte = indlagte;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "\n " +
                "Region: " + region + " | " +
                "Aldersgruppe: " + aldersgruppe + " | " +
                "BekræftedeTilfæde: " + bekræftedeTilfæde + " | " +
                "Døde=" + døde + " | " +
                "Indlagte: " + indlagte + " | " +
                "Dato: " + dato + '\'' +
                '}';
    }
}
