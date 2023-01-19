package com.adso.proyectitodef.repositorio;

import com.adso.proyectitodef.modelo.Personajes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajesRepositorio extends JpaRepository<Personajes,Integer> {
}
