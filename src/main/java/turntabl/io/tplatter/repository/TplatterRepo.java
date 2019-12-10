package turntabl.io.tplatter.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import turntabl.io.tplatter.models.DomainTplatter;

@Repository
public interface TplatterRepo extends CrudRepository<DomainTplatter, Long> {
    DomainTplatter save();
}
