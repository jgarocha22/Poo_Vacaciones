package Polimorfismo;

public class Principal5 {

    public static void main(String[] args) {
        Vehiculo[] misVehiculos = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("GH67","Ferrari","A89");
        misVehiculos[1] = new VehiculoTurismo("78HJ","Audi","P14",4);
        misVehiculos[2] = new VehiculoDeportivo("45HG","Toyota","Yaris GR",500);
        misVehiculos[3] = new VehiculoFurgoneta("J18","Toyota","Tundra",2000);

        for(Vehiculo vehiculos: misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());
            System.out.println();
        }
    }
}
