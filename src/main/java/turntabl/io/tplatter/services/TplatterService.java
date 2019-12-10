package turntabl.io.tplatter.services;

import org.springframework.stereotype.Service;
import turntabl.io.tplatter.models.DomainTplatter;
import turntabl.io.tplatter.repository.TplatterRepo;

import java.util.List;

@Service
public class TplatterService {
    private TplatterRepo tplatterRepo;

    public
    TplatterService(TplatterRepo tplatterRepo) {
        this.tplatterRepo = tplatterRepo;
    }

    public Iterable<DomainTplatter> list() {
        return tplatterRepo.findAll();
    }

    public DomainTplatter save(List<DomainTplatter> weather){
       return tplatterRepo.save();

    }
}
