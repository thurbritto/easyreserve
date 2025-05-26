package com.easyreserve.reserve.repository;

import com.easyreserve.reserve.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRepository extends JpaRepository<Reserve, Integer> {

}
