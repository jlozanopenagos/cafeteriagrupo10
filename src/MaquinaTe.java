public class MaquinaTe implements EquipoCocina {
    private boolean encendida = false;
    private int intensidad = 1;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Maquina de té encendida.");
    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Maquina de té apagada.");
    }

    @Override
    public void preparar() {
        if (encendida) {
            System.out.println("Calentando agua.....integrando hierbas a intensidad" +
                    intensidad + ".");
        }

    }

    @Override
    public void ajustarIntensidad() {
        if (encendida && intensidad < 2) {
            intensidad++;
            System.out.println("intensidad del té: " +
                    intensidad);
        }

    }

    public void agregarhierbasFrutales(){
        if(encendida){
            System.out.println("agregando hierbas frutales");
        }
    }
}
