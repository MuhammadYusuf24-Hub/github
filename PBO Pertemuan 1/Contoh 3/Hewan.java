/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan1_3;

/**
 *
 * @author LENOVO
 */
public class Hewan {

    /**
     * @return the Jenis
     */
    protected String getJenis() {
        return Jenis;
    }

    /**
     * @param Jenis the Jenis to set
     */
    protected void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    /**
     * @return the Habitat
     */
    protected String getHabitat() {
        return Habitat;
    }

    /**
     * @param Habitat the Habitat to set
     */
    protected void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    /**
     * @return the Pernafasan
     */
    protected String getPernafasan() {
        return Pernafasan;
    }

    /**
     * @param Pernafasan the Pernafasan to set
     */
    protected void setPernafasan(String Pernafasan) { 
        this.Pernafasan = Pernafasan;
    }
    
    private String Jenis;
    private String Habitat;
    private String Pernafasan;
    
}
