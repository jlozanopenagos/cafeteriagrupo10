public class TestPreparadorBebidas {
    public static void main(String[] args) {
        Cafetera cf1 = new Cafetera();
        Cafetera cf2 = new Cafetera();

        Licuadora ld1 = new Licuadora();

        MaquinaTe mt1 = new MaquinaTe();

        PreparadorBebidas pb1 = new PreparadorBebidas(cf1, ld1, mt1);
        System.out.println("_________________________________________");
        System.out.println("llamando metodo prepararDesayuno()");
        System.out.println("_________________________________________");
        pb1.prepararDesayuno();
        System.out.println("_________________________________________");
        System.out.println("llamando metodo apagarTodo()");
        System.out.println("_________________________________________");
        pb1.apagarTodo();
        System.out.println("_________________________________________");
        System.out.println("Problema encontrado:");
        System.out.println("El preparador de bebidas esta unicamente ligado a \n existencia de la licuadora y la cafetera, si\n queremos agregar otra clase sera mucho mas dificil ");
        System.out.println("_________________________________________");
    }
}
