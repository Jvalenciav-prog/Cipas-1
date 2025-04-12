public class Audifonos extends Accesorios{
    Audifonos() {
        super();
        System.out.println("Audifonos creado");
    }
    public String cable;
    public String inalambrico;
    public String diseño;

    public Audifonos(String cable, String inalambrico, String diseño){
        this.cable=cable;
        this.inalambrico=inalambrico;
        this.diseño=diseño;

    }


    public void sonido(){
        System.out.println("Music");
    }

}
