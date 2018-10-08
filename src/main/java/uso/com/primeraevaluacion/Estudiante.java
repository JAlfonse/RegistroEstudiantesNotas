package uso.com.primeraevaluacion;

public class Estudiante {

    //Declaracion de Variables
    public String Nombre;
    public String Codigo;
    public String Materia;
    public Double NotaParcialUno;
    public Double NotaParcialDos;
    public Double NotaParcialTres;
    public Double Promedio;

    public Estudiante(String nombre, String codigo, String materia, Double notaParcialUno, Double notaParcialDos, Double notaParcialTres, Double promedio) {
        Nombre = nombre;
        Codigo = codigo;
        Materia = materia;
        NotaParcialUno = notaParcialUno;
        NotaParcialDos = notaParcialDos;
        NotaParcialTres = notaParcialTres;
        Promedio = promedio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public Double getNotaParcialUno() {
        return NotaParcialUno;
    }

    public void setNotaParcialUno(Double notaParcialUno) {
        NotaParcialUno = notaParcialUno;
    }

    public Double getNotaParcialDos() {
        return NotaParcialDos;
    }

    public void setNotaParcialDos(Double notaParcialDos) {
        NotaParcialDos = notaParcialDos;
    }

    public Double getNotaParcialTres() {
        return NotaParcialTres;
    }

    public void setNotaParcialTres(Double notaParcialTres) {
        NotaParcialTres = notaParcialTres;
    }

    public Double getPromedio() {
        return Promedio;
    }

    public void setPromedio(Double promedio) {
        Promedio = promedio;
    }
}
