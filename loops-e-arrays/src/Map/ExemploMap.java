package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemploMap {
    public static void main(String[] args) {
        /*
         * Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
         * modelo = gol - consumo = 14,4km/l
         * modelo = uno - consumo = 15,6 km/l
         * modelo = mobi - consumo = 16,1 km/l
         * modelo = hb20 - consumo = 14,5 km/l
         * modelo = kwid - consumo = 15,6 km/l
         */
        // Map carrosPopulares2020 = new HashMap(); //antes do java 5
        // Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) -
        // Diamont Operator(jdk 7)
        // HashMap<String, Double> carrosPopulares = new HashMap<>();
        // Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6,
        // "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        // criando o map, com tipo da chave e tipo do valor.
        Map<String, Double> carrosPopulares = new HashMap<>() {
            {
                // map o metodo é o put. chave tem que ser unico.
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares.toString());
        // sobrescrevendo o gol com o novo consumo;
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        // containsKey para saber se esta dentro do objeto.
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        // System.out.println("Exiba o terceiro modelo adicionado: ");
        // metodo keyset numa variavel
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        // exibindo o consumo pelo value
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        // colections retorna um double de consumo mais eficiente.
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        // entry e set valor e key separados
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            // primeiro elemento for igual ao consumo mais eficiente
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: " );
        //colections vai retornar um double armazenado em consumo menos eficiente.
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        //metodo value retorna collection(de valores) e kyset retorna um set.
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                //a chave que pertence a ele(consumo) tbm é do modelo menos eficiente.
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        //chama o iterator pq o retorno é um collection.
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
            while(iterator.hasNext()){
                soma += iterator.next();
                        }
            
            System.out.println("Exiba a soma dos consumos: " + soma);
            
            System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
            
             System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        //na ordem informados é no linkedhashmap.
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());
        //apagar toda a lista
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);
        //metodo is empty se esta vazio.
        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
           
        }

    }

