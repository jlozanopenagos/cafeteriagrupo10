import java.util.List;

public class PreparadorBebidasV2 {
    private List<EquipoCocina> listaEquipos;

    public PreparadorBebidasV2(List<EquipoCocina> listaEquipos) {
        this.listaEquipos = listaEquipos;

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
