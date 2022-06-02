package com.walace.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walace.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}