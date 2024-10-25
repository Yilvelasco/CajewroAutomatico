
package clases;

public class ClaseHija_Deposito extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {
        System.out.print("¿Cuanto deseas depositar?: ");
        Deposito();//metodo que se trae desde la clase Padre

        transacciones = getSaldo(); //recupera el saldo actual y lo guarda en la variable transacciones
        setSaldo(transacciones + deposito); // coloca dentro de la variable saldo 
        System.out.println("*********************************");
        System.out.println("Depositastes: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("*********************************");
    }
}
