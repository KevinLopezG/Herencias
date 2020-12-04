public class Persona {
    private String nom;
    private String ape1;
    private String ape2;
    private int edad;
    private int DNI;

    public Persona(String nom,String ape1, String ape2, int edad, int DNI){
        this.nom=nom;
        this.ape1=ape1;
        this.ape2=ape2;
        this.edad=edad;
        this.DNI=DNI;
    }

    public String getNom() { return this.nom; }
    public String getApe1() {return this.ape1;}
    public String getApe2(){return this.ape2;}
    public int getEdad(){return this.edad;}
    public int getDNI(){return this.DNI;}

    public void setNom(String nom) {this.nom = nom;}
    public void setApe1(String ape1){this.ape1=ape1;}
    public void setApe2(String ape2){this.ape2=ape2;}
    public void setEdad(int edad){this.edad=edad;}
    public void setDNI(int DNI){this.DNI=DNI;}


    public void display(){
        System.out.println("Nombre: "+nom);
        System.out.println("Apellidos: "+ape1 +ape2);
        System.out.println("Edad: "+edad);
        System.out.println("DNI: "+DNI);

    }

}
