package com.mycompany.proyectoaerofeliz.persistencia;

import com.mycompany.proyectoaerofeliz.logica.PeticionCliente;

public class ConroladoraPersistencia {
    
  PeticionClienteJpaController peticionclienteJpa = new PeticionClienteJpaController();

    //aca se nos crea el metodo creado desde la controladora:
    public void enviar(PeticionCliente petclient) {
    
        //Aqui se crea en la BD el dueño
        peticionclienteJpa.create(petclient);
        
    }
    
}
