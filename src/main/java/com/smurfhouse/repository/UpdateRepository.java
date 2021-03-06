package com.smurfhouse.repository;

import com.smurfhouse.domain.Update;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Spring Data JPA repository for the Update entity.
 */
@SuppressWarnings("unused")
public interface UpdateRepository extends JpaRepository<Update,Long> {

    List<Update> findAllByUpdateDateBetweenOrderByUpdateDateDesc(LocalDate fromDate, LocalDate toDate);

}
