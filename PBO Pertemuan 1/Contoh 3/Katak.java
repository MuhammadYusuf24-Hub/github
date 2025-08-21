/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPertemuan1_3;

/**
 *
 * @author LENOVO
 */
public class Katak extends Amfibi {

    public static void main(String[] args) {
        Katak k = new Katak();
        k.setJenis("Amfibi");
        k.setHabitat("Darat dan Air");
        k.setPernafasan("Paru-Paru dan Kulit");
        k.setBentubuh("Ramping");
        k.setKulit("Licin dan Basah");
        k.setPerkembangbiakan("Bertelur");
        k.setGerakan("Melompat");

        System.out.println("\t===== KATAK =====");
        System.out.println("Jenis                 : " + k.getJenis());
        System.out.println("Habitat Katak         : " + k.getHabitat());
        System.out.println("Pernafasan Katak      : " + k.getPernafasan());
        System.out.println("Bentuk Tubuh Katak    : " + k.getBentubuh());
        System.out.println("Kulit Katak           : " + k.getKulit());
        System.out.println("Gerakan Katak         : " + k.getGerakan());
        System.out.println("Perkembangbiakan      : " + k.getPerkembangbiakan());

    }

}
