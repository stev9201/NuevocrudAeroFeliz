package com.mycompany.proyectoaerofeliz.persistencia;

import com.mycompany.proyectoaerofeliz.logica.PeticionCliente;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class PeticionClienteJpaController implements Serializable {

    private EntityManagerFactory emf = null;
    
    public PeticionClienteJpaController() {
        emf = Persistence.createEntityManagerFactory("bd_peticionesPU"); // Se crea este nuevo constructor escribimos persistence. y ctrl + enter para seleccionar la opcion createmanagerfactory.
        //y como parametro que es lo que esta en parentesis y comillas el nombre de la unidad de persistencia el cual esta en nuestro archivo persistence.xml persistent unit name.
    }

    public PeticionClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // Método para crear un nuevo PeticionCliente
    public void create(PeticionCliente peticionCliente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(peticionCliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para actualizar un PeticionCliente existente
    public void edit(PeticionCliente peticionCliente) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            peticionCliente = em.merge(peticionCliente);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = peticionCliente.getId_cliente();
                if (findPeticionCliente(id) == null) {
                    throw new EntityNotFoundException("El PeticionCliente con id " + id + " no existe.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para eliminar un PeticionCliente por su ID
    public void destroy(int id) throws Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PeticionCliente peticionCliente;
            try {
                peticionCliente = em.getReference(PeticionCliente.class, id);
                peticionCliente.getId_cliente();
            } catch (EntityNotFoundException enfe) {
                throw new EntityNotFoundException("El PeticionCliente con id " + id + " no existe.");
            }
            em.remove(peticionCliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    // Método para encontrar un PeticionCliente por su ID
    public PeticionCliente findPeticionCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PeticionCliente.class, id);
        } finally {
            em.close();
        }
    }

    // Método para obtener todos los PeticionCliente
    public List<PeticionCliente> findPeticionClienteEntities() {
        return findPeticionClienteEntities(true, -1, -1);
    }

    public List<PeticionCliente> findPeticionClienteEntities(int maxResults, int firstResult) {
        return findPeticionClienteEntities(false, maxResults, firstResult);
    }

    private List<PeticionCliente> findPeticionClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PeticionCliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    // Método para obtener el recuento de PeticionCliente
    public int getPeticionClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PeticionCliente> rt = cq.from(PeticionCliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
