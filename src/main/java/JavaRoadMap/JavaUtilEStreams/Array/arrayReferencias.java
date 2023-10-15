
package JavaRoadMap.JavaUtilEStreams.Array;

import JavaRoadMap.ClasseTesteParaObjetos.Cofre;

public class arrayReferencias {
    public static void main(String[] args) {

        //int[] idades = new int[5];

        Cofre cofre1 = new Cofre();
        Cofre cofre2 = new Cofre();
        Cofre cofre3 = new Cofre();



        Cofre [] objetosCofre =  new Cofre[3];

        //posição 1 do array é o objeto cofre1
        objetosCofre[0] = cofre1;

        System.out.println(cofre1.getSaldo());












    }


}
