package com.mycompany.proyectoaerofeliz.logica;

import com.mycompany.proyectoaerofeliz.persistencia.ConroladoraPersistencia;

public class Controladora {
    
  ConroladoraPersistencia controlPersis = new ConroladoraPersistencia();
    
  // Despues de crear el metodo en nuestro principal este aparecera aca de la siguiente manera:
    public void Enviar(String telefono, String correo, String mensaje, 
            String nacionales, String internacionales) { // todos estos datos los pasamos a la logica
       
        // creamos la peticion y asignamos sus valores
        PeticionCliente  petclient = new PeticionCliente(); // se crea la instancia para practicar los getter y setter
        
        //asignacion de valores:
        petclient.setTelefono(telefono);
        petclient.setCorreo(correo);
        petclient.setMensaje(mensaje);
        petclient.setNacional(nacionales);
        petclient.setInternacional(internacionales);
        
        //ahora nos falta pasar los datos de la logica a la persistencia asi:  
       controlPersis.enviar(petclient); //como el metodo no esta creado nos aparecera error entonces hacemos alt + enter y creamos el metodo
        
    }
           
}
