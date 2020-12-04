public class Alumne extends Persona{

    private int [] notas;

    public Alumne(String nom,String ape1, String ape2, int edad, int DNI, int[]notas){
        super(nom, ape1, ape2, edad, DNI);
    }

    public double Notas(){
        int total=0;
        for(int i=0;i< notas.length;i++){
            total+=this.notas[i];
        }
    return total/(double)this.notas.length;
    }
    public void display(){
        System.out.println("Media notas: "+notas);
    }





}
