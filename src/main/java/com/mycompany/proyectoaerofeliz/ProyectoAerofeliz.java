package com.mycompany.proyectoaerofeliz;

import com.mycompany.proyectoaerofeliz.igu.Principal;


public class ProyectoAerofeliz {
//Por medio de esta funcion mostramos en pantalla nuestro Formulario
    public static void main(String[] args) {
       Principal princ = new Principal (); //se crea la isntancia
       princ.setVisible(true); // indica que sea visible en pantalla (SetVisible)
       princ.setLocationRelativeTo(null); // Que el panel se abra en el centro de nustra pantalla
    }
}
