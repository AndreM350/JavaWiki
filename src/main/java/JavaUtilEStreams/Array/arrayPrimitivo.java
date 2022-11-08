package JavaUtilEStreams.Array;

public class arrayPrimitivo {
    public static void main(String[] args) {

        int[] idades = new int[5];

        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 30;
        idades[3] = 40;
        idades[4] = 50;

        int idade4 = idades[4];

        System.out.println(idade4);
        System.out.println(idades.length);


        for(int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        for (int i : idades) {
            System.out.println("Posição: " + i);
        }


    }
}
