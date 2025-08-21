/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan1_3;

/**
 *
 * @author LENOVO
 */
public class Amfibi extends Hewan {

    /**
     * @return the bentubuh
     */
    protected String getBentubuh() {
        return bentubuh;
    }

    /**
     * @param bentubuh the bentubuh to set
     */
    protected void setBentubuh(String bentubuh) {
        this.bentubuh = bentubuh;
    }

    /**
     * @return the kulit
     */
    protected String getKulit() {
        return kulit;
    }

    /**
     * @param kulit the kulit to set
     */
    protected void setKulit(String kulit) {
        this.kulit = kulit;
    }

    /**
     * @return the Perkembangbiakan
     */
    protected String getPerkembangbiakan() {
        return Perkembangbiakan;
    }

    /**
     * @param Perkembangbiakan the Perkembangbiakan to set
     */
    protected void setPerkembangbiakan(String Perkembangbiakan) {
        this.Perkembangbiakan = Perkembangbiakan;
    }

    /**
     * @return the gerakan
     */
    protected String getGerakan() {
        return gerakan;
    }

    /**
     * @param gerakan the gerakan to set
     */
    protected void setGerakan(String gerakan) {
        this.gerakan = gerakan;
    }
    
    private String bentubuh;
    private String kulit;
    private String Perkembangbiakan;
    private String gerakan;
    
    
    
    
    
    
//    public static void main(String[] args) {
//        Amfibi a = new Amfibi();
//        a.setHabitat("Darat dan Air");
//        a.setPernafasan("Paru-Paru dan Kulit ");
//        
//        System.out.println("\t===== Amfibi =====");
//        System.out.println("Habitat    : " + a.getHabitat());
//        System.out.println("Pernafasan : " + a.getPernafasan());
//    }
}
