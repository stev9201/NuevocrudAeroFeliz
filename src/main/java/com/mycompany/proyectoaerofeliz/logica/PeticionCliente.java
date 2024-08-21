package com.mycompany.proyectoaerofeliz.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity // La Entity permite que una clase en este caso peticioncliente se convierta en una tabla en nuestra base de datos
public class PeticionCliente implements Serializable {
    
    @Id // Con el @Id estamos indicando que id_Cliente sera nuestra llave primaria dentro de la tabla
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //@GeneratedValue permite que de manera automatica se cree el valor de cliente, 
    // (strategy = GenerationType.SEQUENCE) es la estrategia que usaremos para la enumeracion del cliente automatica para ello hacemos ctrl enter despues de strategy y ally se nos mostraran las opciones.
    //Atributos
    private int id_cliente;
    private String Telefono;
    private String Correo;
    private String Nacional;
    private String Internacional;
    private String Mensaje;
    
//Constructores (sin parametros y con parametros) ();=sin parametros, ("hola" + nombre + "!");=Con parametros
    public PeticionCliente() {
    } //constructor vacion o sin parametros se invoca con alt+insert=constructor

    public PeticionCliente(int id_cliente, String Telefono, String Correo,String Nacional, String Internacional, String Mensaje) {
        this.id_cliente = id_cliente;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Nacional = Nacional;
        this.Internacional = Internacional;
        this.Mensaje = Mensaje;
    } // constructor con parametros se invoca con alt+insert=constructor y seleccionamos todos.
    
  //Metodos (Getter and setter) se invocan con Alt+insert=getetter and setters y seleccionamos todos.
    
    // Método getter para obtener el valor de 'id_cliente'
    // 'public' permite que este método sea accesible desde cualquier lugar
    // 'int' indica que el valor devuelto será de tipo entero
    public int getId_cliente() {
        return id_cliente;
    }
    // Método setter para establecer el valor de 'id_cliente'
    // 'void' significa que este método no devuelve ningún valor
    // Toma un parámetro 'id_cliente' de tipo entero y lo asigna al atributo 'id_cliente'
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente; // Asigna el valor del parámetro al atributo de la clase
    }
    // Método getter para obtener el valor de 'Telefono'
    // 'String' indica que el valor devuelto será de tipo cadena de texto
    public String getTelefono() {
        return Telefono;
    }
    // Método setter para establecer el valor de 'Telefono'
    // Toma un parámetro 'Telefono' de tipo String y lo asigna al atributo 'Telefono'
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono; // Asigna el valor del parámetro al atributo de la clase
    }
    // Método getter para obtener el valor de 'Correo'
    // 'String' indica que el valor devuelto será de tipo cadena de texto
    public String getCorreo() {
        return Correo; // Devuelve el valor actual de 'Correo'
    }
    // Método setter para establecer el valor de 'Correo'
    // Toma un parámetro 'Correo' de tipo String y lo asigna al atributo 'Correo'
    public void setCorreo(String Correo) {
        this.Correo = Correo; // Asigna el valor del parámetro al atributo de la clase
    }
    
    public String getNacional() {
        return Nacional; // Devuelve el valor actual de 'Nacional'
    }
    // Método setter para establecer el valor de 'Nacional'
    // Toma un parámetro 'Nacional' de tipo String y lo asigna al atributo 'Nacional'
    public void setNacional(String Nacional) {
        this.Nacional = Nacional; // Asigna el valor del parámetro al atributo de la clase
    }
    
    public String getInternacional() {
        return Internacional; // Devuelve el valor actual de 'Nacional'
    }
    // Método setter para establecer el valor de 'Internacional'
    // Toma un parámetro 'Internacional' de tipo String y lo asigna al atributo 'Internacional'
    public void setInternacional(String Internacional) {
        this.Internacional = Internacional; // Asigna el valor del parámetro al atributo de la clase
    }
    // Método getter para obtener el valor de 'Mensaje'
    // 'String' indica que el valor devuelto será de tipo cadena de texto
    public String getMensaje() {
        return Mensaje; // Devuelve el valor actual de 'Mensaje'
    }
    // Método setter para establecer el valor de 'Mensaje'
    // Toma un parámetro 'Mensaje' de tipo String y lo asigna al atributo 'Mensaje'
    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje; // Asigna el valor del parámetro al atributo de la clase
    }  
} 




