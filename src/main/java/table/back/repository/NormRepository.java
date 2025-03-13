package table.back.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import table.back.entity.Norm;

@Repository 
public interface NormRepository extends JpaRepository<Norm, Long>{
}

