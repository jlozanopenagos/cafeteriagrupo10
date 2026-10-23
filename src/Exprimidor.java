public class Exprimidor implements EquipoCocina{
    private boolean encendido = false;
    private int intensidad = 5;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Exprimidor encendido.");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Exprimidor apagado.");
    }

    @Override
    public void preparar() {
        if (encendido) {
            System.out.println("Sacandole todo el jugo a la fruta con intensidad " +
                    intensidad + ".");
        }
    }

    @Override
    public void ajustarIntensidad() {
        if (encendido && intensidad < 2) {
            intensidad++;
            System.out.println("intensidad del exprimidor: " +
                    intensidad);
        }
    }
}
