import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Agregar valores al TreeMap
        treeMap.put(3, "Valor 3");
        treeMap.put(2, "Valor 2");
        treeMap.put(5, "Valor 5");
        treeMap.put(4, "Valor 4");
        treeMap.put(6, "Valor 6");
        treeMap.put(7, "Valor 7");
        treeMap.put(9, "Valor 9");
        treeMap.put(8, "Valor 8");
        treeMap.put(1, "Valor 1");

        // Imprimir el TreeMap (Debido a la naturaleza de BST, esto imprimirá los valores en orden ascendente de las claves)
        System.out.println("Contenido del TreeMap: " + treeMap);

        // Obtener un valor usando una clave
        System.out.println("Valor para la clave 2: " + treeMap.get(2));

        // Verificar si el TreeMap contiene una clave
        System.out.println("¿Contiene la clave 3?: " + treeMap.containsKey(3));
        System.out.println("¿Contiene la clave 11?: " + treeMap.containsKey(11));

        // Eliminar un valor usando una clave
        treeMap.remove(3);
        System.out.println("Contenido del TreeMap después de eliminar: " + treeMap);

        // Obtener el tamaño del TreeMap
        System.out.println("Tamaño del TreeMap: " + treeMap.size());

        // Limpiar el TreeMap
        treeMap.clear();
        System.out.println("Contenido del TreeMap después de limpiar: " + treeMap);
    }
}
