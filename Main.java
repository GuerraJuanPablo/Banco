import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        Long idBuscado = 0l;
        long id = 1l;
        LocalDate fechaDeHoy = LocalDate.of(2023, 3, 27);
        LocalDate fecha = LocalDate.of(2022, 04, 15);
        long antiguedadDeCuenta = ChronoUnit.MONTHS.between(fecha, fechaDeHoy);
        String nombre = "Pepe";
        String apellido = "Diaz";
        String telefono = "0913212321";
        String email = "pepe.cias@pepemail.com";
        Float ingresoMensual = 200f;

        Cuenta cuenta1 = new Cuenta(1, true, 500.0f);
        Cuenta cuenta2 = new Cuenta(2, true, 350.0f);
        Cuenta[] cuentas1 = {cuenta1, cuenta2};

        Prestamo prestamo1 = new Prestamo(1, 2000f);
        Prestamo prestamo2 = new Prestamo(1, 5000f);
        
        Prestamo[] prestamos2 = {prestamo2};
        Prestamo[] prestamos1 = {prestamo1};

        if(ingresoMensual > 2000.0f && antiguedadDeCuenta > 12l){
            ClienteA clienteA1 = new ClienteA(id, nombre, apellido, telefono,email, fecha, cuentas1, ingresoMensual, prestamos1);
            clientes.add(clienteA1);
        }else if(ingresoMensual == 0.0f){
            Estudiante Estudiante1 = new Estudiante(id, nombre, apellido, telefono, email, fecha, cuentas1[0]);
            clientes.add(Estudiante1);
        }else if(ingresoMensual > 0.0f){
            ClienteB clienteB1 = new ClienteB(id, nombre, apellido, telefono, email, fecha, cuentas1, ingresoMensual, prestamos2);
            clientes.add(clienteB1);
        }

        for (int i = 0; i < clientes.size(); i++) {
            Cliente x = clientes.get(i);
            //if(idBuscado == x.getIdCliente()){
            //    clientes.remove(i)
            //}      
          }
          
        System.out.println(antiguedadDeCuenta);
        System.out.println(clientes);
    }   
}
