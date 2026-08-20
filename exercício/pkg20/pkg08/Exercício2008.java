package exercício.pkg20.pkg08;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Exercício2008 {

    public static void main(String[] args) {
        ArrayList<Double> lista= new ArrayList<>();
        lista.add(0 ,0.1);
        lista.add(1 ,1.2);
        lista.add(2 ,2.3);
        lista.add(3 ,3.4);
        
        lista.remove(1);
        System.out.println(lista);
        double media = 0;
        
        for(int i = 0; i <lista.size(); i++){
            System.out.println(lista.get(i));
            media = media + lista.get(i);

            System.out.println(media/lista.size());
        }
        Collections.sort(lista);
        System.out.println(lista);

        }
    
    }
