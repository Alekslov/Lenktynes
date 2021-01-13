/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenktynes;

/**
 *
 * @author pc
 */
public class Lenktynes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] masinos = new int[8];
        int interm = 100;
        boolean doRace = true;
        
        while(doRace) {
            // kiekvrina masina pavaziavo po xKM
            for(int i = 0; i < masinos.length; i++) {
                masinos[i] += Math.random() * 10 + 1;
            }
            boolean printInterm = false;
            int intermWinner = 0;
            int intermWinnerKm = 0;
            for(int i = 0; i < masinos.length; i++) {
                if(masinos[i] > intermWinnerKm) {
                    intermWinner = i + 1;
                    intermWinnerKm = masinos[i];
                }
                if(masinos[i] >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if(printInterm) {
                for(int i = 0; i < masinos.length; i++) {
                    System.out.print(masinos[i] + "\t");
                }
                System.out.println();
                System.out.println("Pirmauja: " + intermWinner + ", nuvaziavo: " + intermWinnerKm);
            }
            for(int i = 0; i < masinos.length; i++) {
                // jeigu bent viena masina pasiekie 1000km
                if(masinos[i] >= 1000) {
                    doRace = false;
                    break;
                }
            }
        }
        // rusiavimas
        for(int i = 0; i < masinos.length; i++) {
            for (int j = i+1; j < masinos.length; j++) {
                if(masinos[i] < masinos[j]) {
                    int temp = masinos[i];
                    masinos[i] = masinos[j];
                    masinos[j] = temp;
                }
            }
        }
        // spausdinimas masyvo
        for(int i = 0; i < masinos.length; i++) {
            System.out.print(masinos[i] + " ");
        }

    }
}
