public class Profesor extends Persona {

    private String especialidad;

    public Profesor(String nom, String ape1, String ape2,int edad,int DNI, String especialidad){
        super(nom,ape1,ape2,edad,DNI);
    }
    public void display(){
        System.out.println("Especialidad: "+especialidad);
    }




}
