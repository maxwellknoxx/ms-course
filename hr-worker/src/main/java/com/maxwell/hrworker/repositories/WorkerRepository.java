package com.maxwell.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maxwell.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
