package cl.zakur.java.arq.appdemoarqlayers.repository;

import cl.zakur.java.arq.appdemoarqlayers.entity.SedeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SedeRepository extends GenericRepository<SedeEntity, Long>{

    @Query("select p from SedeEntity p where upper(p.nombreCorto) like upper(:nombre) and p.estado='1'")
    List<SedeEntity> findLike(@Param("nombre") String nombre);
}
