 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan1_1;

/**
 *
 * @author LENOVO
 */
public class BurungElang extends Burung {
    public static void main(String[] args) {
         BurungElang e = new BurungElang();
         e.setJenis("Burung");
         e.setHabitat("Pegunungan, Hutan, Padang Rumput, Perairan");
         e.setJummata(2);
         e.setJumkaki(2);
         e.setPenglihatan("Tajam");
         e.setStrukturparuh("Melengkung dan Kuat");
         e.setBulu("Kuat dan Tahan Air"); 
         e.setCakar("Kuat dan Tajam");
         e.setPerkembangbiakan("Bertelur");
         
         System.out.println("\t===== Burung Elang =====");
         System.out.println("Jenis                  : " + e.getJenis());
         System.out.println("Habitat Elang          : " + e.getHabitat());
         System.out.println("Jumlah Mata Elang      : " + e.getJummata());
         System.out.println("Jumlah kaki Elang      : " + e.getJumkaki());
         System.out.println("Penglihatan Elang      : " + e.getPenglihatan());
         System.out.println("Struktur Paruh Elang   : " + e.getStrukturparuh());
         System.out.println("Bulu Elang             : " + e.getBulu());
         System.out.println("Cakar Elang            : " + e.getCakar());
         System.out.println("Perkembangbiakan Elang : " + e.getPerkembangbiakan());
         
    }
    
}
