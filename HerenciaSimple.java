
package herenciasimple;

public class HerenciaSimple {

    public static void main(String[] args) {
 ClasePadre padre = new ClasePadre();
 ClaseHija hija = new ClaseHija();
 
 padre.metodoUno();
 padre.metodoDos();
 hija.metodo();
 hija.metodoUno();
 hija.metodoDos();
 hija.cantar();
 System.out.print("velocidad Maxima" + hija.getVelocidadMaxima());
    }
    
}
