package table.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import table.back.entity.Ppp;

@Repository 
public interface PppRepository extends JpaRepository<Ppp, String> {
}
