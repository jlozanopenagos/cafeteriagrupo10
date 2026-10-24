import java.util.List;

public class PreparadorBebidasV3 {

    private List<EquipoCocina> lista3;

    public PreparadorBebidasV3(List<EquipoCocina> lista3){
        this.lista3 = lista3;
    }

    public void prepararDesayuno() {
        System.out.println("Iniciando preparacion del desayuno...");
        for(int i = 0; i < lista3.size(); i++){
            lista3.get(i).encender();
            lista3.get(i).preparar();
        }
        System.out.println("Desayuno listo.");
    }

    public void apagarTodo() {
        System.out.println("Apagando equipos...");
        for (EquipoCocina equipoCocina : lista3) {
            equipoCocina.apagar();
        }
        System.out.println("Equipos apagados.");
    }

}
