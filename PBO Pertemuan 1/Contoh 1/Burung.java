/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan1_1;

/**
 *
 * @author LENOVO
 */
public class Burung extends Hewan {

    /**
     * @return the cakar
     */
    protected String getCakar() {
        return cakar;
    }

    /**
     * @param cakar the cakar to set
     */
    protected void setCakar(String cakar) {
        this.cakar = cakar;
    }

    /**
     * @return the penglihatan
     */
    protected String getPenglihatan() {
        return penglihatan;
    }

    /**
     * @param penglihatan the penglihatan to set
     */
    protected void setPenglihatan(String penglihatan) {
        this.penglihatan = penglihatan;
    }

    /**
     * @return the strukturparuh
     */
    protected String getStrukturparuh() {
        return strukturparuh;
    }

    /**
     * @param strukturparuh the strukturparuh to set
     */
    protected void setStrukturparuh(String strukturparuh) {
        this.strukturparuh = strukturparuh;
    }

    /**
     * @return the bulu
     */
    protected String getBulu() {
        return bulu;
    }

    /**
     * @param bulu the bulu to set
     */
    protected void setBulu(String bulu) {
        this.bulu = bulu;
    }
    
    private String strukturparuh;
    private String bulu;
    private String cakar;
    private String penglihatan;
    
    
    
    
    
    //    public static void main(String[] args) {
//        Burung b = new Burung();
//        b.setJummata(2);
//        b.setJumkaki(2);
//        b.setPerkembangbiakan("Bertelur");
//        
//        System.out.println("====== Burung ======");
//        System.out.println("Jumlah Mata      : " + b.getJummata());
//        System.out.println("Jumlah Kaki      : " + b.getJumkaki());
//        System.out.println("Perkembangbiakan : " + b.getPerkembangbiakan());
//    }
}
