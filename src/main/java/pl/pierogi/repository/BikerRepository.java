package pl.pierogi.repository;

import pl.pierogi.domain.Biker;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Biker entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BikerRepository extends JpaRepository<Biker, Long> {
}
