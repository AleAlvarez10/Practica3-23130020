package alumnos;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class alumno {
    private String nombre;
    private String apaterno;
    private String amaterno;
    private String CURP;
    private String telefono;
    private String correo;
    private boolean discapacidad;
    private String sexo;
    private int edad;

    public alumno(String nombre,String apaterno,String amaterno,String CURP,String telefono,String correo,boolean discapacidad,String sexo)
    {
        this.nombre=nombre;
        this.apaterno=apaterno;
        this.amaterno=amaterno;
        this.CURP=CURP;
        this.telefono=telefono;
        this.correo=correo;
        this.discapacidad=discapacidad;
        this.sexo=sexo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getAPaterno() {
        return apaterno;
    }
    public String getAMaterno() {
        return amaterno;
    }
    public String getCURP() {return CURP;}
    public String getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public boolean isDiscapacidad() {
        return discapacidad;
    }
    public String getSexo() {
        return sexo;
    }
    public String getDiscapacidad(){
        if(discapacidad==true)
            return "Si";
        else
            return "No";
    }

    public Integer EdadXCurp(String curp){
        String FECHAn = CURP.substring(4, 10);

        DateTimeFormatter FORMAT= DateTimeFormatter.ofPattern("yyMMdd");
        LocalDate FECHANAC = LocalDate.parse(FECHAn, FORMAT);

        if (FECHANAC.isAfter(LocalDate.now())) {
            FECHANAC = FECHANAC.minusYears(100);
        }

        Period EDAD = Period.between(FECHANAC, LocalDate.now());
        return EDAD.getYears();
    }
}
