public class App {
    public static void main(String[] args) throws Exception {
        // Creamos la instancia de la clase
        MetodoOrdenamientoInsercion ordenar = new MetodoOrdenamientoInsercion();

        // Creamos un arreglo de enteros
        int[] arreglo = { 3, 5, 1, 2, 4 };

        // Llamamos al método sortInsertion
        int[] arregloOrdenado = ordenar.sortInsertion(arreglo, true);
        // Imprimimos el arreglo ordenado

        ordenar.printArray(arregloOrdenado);
    }
}
