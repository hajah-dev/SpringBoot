package org.study.studying.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.studying.entities.Etudiant;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    public List<Etudiant> findByScore(int score);
}
