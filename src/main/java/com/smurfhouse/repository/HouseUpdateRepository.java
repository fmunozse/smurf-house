package com.smurfhouse.repository;

import com.smurfhouse.domain.HouseUpdate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Spring Data JPA repository for the HouseUpdate entity.
 */
@SuppressWarnings("unused")
public interface HouseUpdateRepository extends JpaRepository<HouseUpdate,Long> {

    List<HouseUpdate> findAllByUpdateIdOrderByOperationAscHousePriceAsc (Long id);

}
