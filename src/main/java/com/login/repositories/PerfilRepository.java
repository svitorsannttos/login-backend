package com.login.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.models.PerfilModel;

@Repository
public interface PerfilRepository extends JpaRepository<PerfilModel, Integer>{

}
