package ar.com.ada.nefly.repo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.nefly.entities.Pelicula;

/**
 * PeliculaRepository
 */
@Repository
public interface PeliculaRepository extends MongoRepository<Pelicula, Integer>{

    Pelicula findBy_id(ObjectId _id);
    Pelicula findByNombre(String nombre);
    
}