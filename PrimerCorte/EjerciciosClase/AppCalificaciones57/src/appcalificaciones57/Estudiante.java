
package appcalificaciones57;

public class Estudiante {
    //Atributos
    private String codigo;
    private String nombre;
    private float  nota1;
    private float  nota2;
    private float  nota3;
    private float  notaFinal;
    
    //Métodos

    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, float nota1, float nota2, float nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
    public void calcularNotaFinal(){
      this.notaFinal=Math.round((this.nota1+this.nota2+this.nota3)/3);
    }
    
    
    
    
}
