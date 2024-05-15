public class Deb {
    public static void main(String[] args) {
        System.out.println("iniciou programa metodo main");
        a();
        
    }

    static void a(){
        System.out.println("Inicio Metodo A");
        b();
    }

    static void b() {
        System.out.println("Inicio Metodo B");
        c();
    }

    static void c(){
        System.out.println("Entrada metodo C");
        Thread.dumpStack();
    }
}
