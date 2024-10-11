public class Principal {
    Cancha cancha;
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Principal mPrincipal=new Principal();
    }
    public Principal(){
        cancha=new Cancha();
        cancha.operacion();
        cancha.imprimir();
        
       
    }
}
