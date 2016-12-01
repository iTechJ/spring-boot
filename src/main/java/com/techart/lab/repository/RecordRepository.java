package com.techart.lab.repository;

import com.techart.lab.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by alexander on 11/21/16.
 */
public interface RecordRepository extends JpaRepository<Record, Integer> {
}
