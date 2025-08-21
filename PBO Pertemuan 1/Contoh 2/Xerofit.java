/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan1_2;

/**
 *
 * @author LENOVO
 */
public class Xerofit extends Tumbuhan {

    /**
     * @return the daun
     */
    protected String getDaun() {
        return daun;
    }

    /**
     * @param daun the daun to set
     */
    protected void setDaun(String daun) {
        this.daun = daun;
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
    
    private String daun;
    private String Perkembangbiakan;

    
    
    
    
    
//    public static void main(String[] args) {
//        Xerofit x = new Xerofit();
//        x.setHabitat("Kering");
//        x.setAkarxerofit("Panjang");
//        x.setBatangxerofit("Tebal");
//
//        System.out.println("===== Xerofit ======");
//        System.out.println("Habitat Xerofit : " + x.getHabitat());
//        System.out.println("Akar Xerofit    : " + x.getAkarxerofit());
//        System.out.println("Batang Xerofit  : " + x.getBatangxerofit());
//    }
}
