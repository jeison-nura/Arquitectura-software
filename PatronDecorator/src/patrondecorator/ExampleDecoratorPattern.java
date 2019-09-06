package patrondecorator;

public class ExampleDecoratorPattern {
    //Cliente
    public static void main(String[] args) {
        VentaAuto automovil= new ChevroletSail();
        automovil=new Mp4Player(automovil);
        automovil=new LlantasLujo(automovil);
        automovil=new AireAcondicionado(automovil);
        automovil=new VidriosElectricos(automovil);        
        
        System.out.println(automovil.getDescription());
        System.out.println("Su precio es: "+ automovil.getPrice());
        
        
        VentaAuto automovil2 = new BWM();
        automovil2 = new RadioGps(automovil2);
        automovil2 = new blindaje(automovil2);
        automovil = new polarizado(automovil2);
        
        System.out.println(automovil2.getDescription());
        System.out.println(" Su precio es :" + automovil2.getPrice());
          
    }
    
}
