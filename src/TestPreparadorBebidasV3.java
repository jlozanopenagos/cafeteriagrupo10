import java.util.ArrayList;
import java.util.List;

public class TestPreparadorBebidasV3 {
    public static void main(String[] args) {
        List<EquipoCocina> dispositivosCocina = new ArrayList<>();

        Cafetera cf1 = new Cafetera();

        Cafetera cf2 = new Cafetera();

        Licuadora ld1 = new Licuadora();

        Exprimidor exp1 = new Exprimidor();

        dispositivosCocina.add(cf1);
        dispositivosCocina.add(cf2);
        dispositivosCocina.add(ld1);
        dispositivosCocina.add(exp1);

        PreparadorBebidasV3 pbv3 = new PreparadorBebidasV3(dispositivosCocina);
        pbv3.prepararDesayuno();
        pbv3.apagarTodo();

    System.out.println("Mis dispositivos en lista: " + dispositivosCocina.size());
    }
}
