/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan1_2;

/**
 *
 * @author LENOVO
 */
public class Kaktus extends Xerofit{
    public static void main(String[] args) {
        Kaktus k = new Kaktus();
        k.setJenis("Xerofit");
        k.setHabitat("Lingkungan Kering");
        k.setBatangxerofit("Tebal");
        k.setAkarxerofit("Panjang");
        k.setDaun("Berduri");
        k.setPerkembangbiakan("Generatif atau Vegetatif");
        
        System.out.println("\t===== KAKTUS =====");
        System.out.println("Jenis            : " + k.getJenis());
        System.out.println("Habitat Kaktus   : " + k.getHabitat());
        System.out.println("Batang Kaktus    : " + k.getBatangxerofit());
        System.out.println("Akar Kaktus      : " + k.getAkarxerofit());
        System.out.println("Daun Kaktus      : " + k.getDaun());
        System.out.println("Perkembangbiakan : " + k.getPerkembangbiakan());
        
        
    }
    
}
