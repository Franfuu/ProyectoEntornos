public class DistanciaManhattan extends Distancia {

    // Clase DistanciaManhattan que hereda de Distancia
    @Override
    public double medir(Punto origen, Punto destino) {
        return 0;
    }

        // Constructor
        public DistanciaManhattan(double origen_x, double origen_y, double destino_x, double destino_y) {
            super(origen_x, origen_y, destino_x, destino_y);
        }

        // Método principal para probar la clase
        public static void main(String[] args) {
            double origen_x = 0;
            double origen_y = 0;
            double destino_x = 10;
            double destino_y = 4;

            DistanciaManhattan distanciaManhattan = new DistanciaManhattan(origen_x, origen_y, destino_x, destino_y);
            double distancia = distanciaManhattan.medir(origen_x, origen_y, destino_x, destino_y);
            System.out.println("La distancia de Manhattan entre los puntos es: " + distancia);
        }
    }


