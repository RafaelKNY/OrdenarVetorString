import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Main n = new Main();

        String vetA[] = new String[]{"Angola", "Chile", "Grécia", "Itália", "Moçambique", "Portugal", "Rússia", "Suécia" };
        String vetB[] = new String[]{"Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França", "Inglaterra", "Turquia", "Uruguai", "Venezuela", "Zimbabwe" };

        n.addVet(vetA,vetB);

    }

    public void addVet (String vet1[], String vet2[]){
        int auxA = vet1.length + vet2.length;
        ArrayList vet3 = new ArrayList<>();

        for (int i=0; i< vet1.length;i++){
            vet3.add(vet1[i]);
        }
        for (int i =0; i < vet2.length;i++){
            vet3.add(vet2[i]);
        }
        Collections.sort(vet3);

        for (int i = 0;i < vet3.size();i++){
            System.out.println(vet3.get(i));
        }
    }


}