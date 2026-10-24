import java.util.ArrayList;
import java.util.List;

public class TestPreparadorBebidasV2 {
    public static void main(String[] args) {

        Cafetera cf2 = new Cafetera();

        Licuadora ld1 = new Licuadora();

        MaquinaTe mt1 = new MaquinaTe();
        //
        List<EquipoCocina> listaEquipos = new ArrayList<>();

        listaEquipos.add(cf2);
        listaEquipos.add(ld1);
        listaEquipos.add(mt1);

        PreparadorBebidasV2 preparadorBebidasV2 = new PreparadorBebidasV2(listaEquipos);

        System.out.println("____________Preparador V2.0______________");
        System.out.println("_________________________________________");
        System.out.println("llamando metodo prepararDesayuno()");
        System.out.println("_________________________________________");
        preparadorBebidasV2.prepararDesayuno();
        System.out.println("_________________________________________");
        System.out.println("llamando metodo apagarTodo()");
        System.out.println("_________________________________________");
        preparadorBebidasV2.apagarTodo();
        System.out.println("_________________________________________");
        System.out.println("Problema encontrado:");
        System.out.println("El preparador de bebidas esta unicamente ligado a \n existencia de la licuadora y la cafetera, si\n queremos agregar otra clase sera mucho mas dificil ");
        System.out.println("_________________________________________");
    }
}
