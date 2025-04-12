public class Fundas extends Accesorios{
    Fundas() {
        super();
        System.out.println("Fundas creado");
    }
    public String compatibilidad;
    public String material;

    public Fundas(String compatibilidad,String material){
        this.compatibilidad=compatibilidad;
        this.material=material;
    }

}
