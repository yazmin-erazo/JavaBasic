package EjemploInterfaz;

public class Ejemplo {
    public static void main(String[] args) {
        CocheCRUDImpl coche = new CocheCRUDImpl();
        coche.save();
        coche.findAll();
        coche.delete();
    }

    // -------------------------------- CLASE: implementa los metodos de la interface
    public static class CocheCRUDImpl implements CocheCRUD {

        @Override
        public void save() {
            System.out.println("Nombre del metodo: Save");
        }

        @Override
        public void findAll() {
            System.out.println("Nombre del metodo: findAll");
        }

        @Override
        public void delete() {
            System.out.println("Nombre del metodo: delete");
        }
    }


    // -------------------------------- ITERFACE: Se declaran los metodos
    public interface CocheCRUD {
        void save();

        void findAll();

        void delete();
    }
}
