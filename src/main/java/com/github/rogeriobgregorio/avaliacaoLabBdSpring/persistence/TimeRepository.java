package com.github.rogeriobgregorio.avaliacaoLabBdSpring.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.rogeriobgregorio.avaliacaoLabBdSpring.entity.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, Integer> {
	
}
