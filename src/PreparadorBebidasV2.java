import java.util.List;
import java.util.Objects;

public class PreparadorBebidasV2 {
    private List<EquipoCocina> listaEquipos;

    public PreparadorBebidasV2(List<EquipoCocina> listaEquipos) {
      //  this.listaEquipos = listaEquipos;
        this.listaEquipos = Objects.requireNonNull(listaEquipos, "La lista de items no puede ser nula");

    }


    public void prepararDesayuno() {
        System.out.println("Iniciando preparacion del desayuno...");
        //for preparar
        for(EquipoCocina equipo:listaEquipos ){
            equipo.encender();
            equipo.preparar();
        }
        System.out.println("Desayuno listo.");
    }

    public void apagarTodo() {

        System.out.println("Apagando equipos...");

        for(EquipoCocina equipo:listaEquipos){
            equipo.apagar();
        }
        System.out.println("Equipos apagados.");


    }
}
