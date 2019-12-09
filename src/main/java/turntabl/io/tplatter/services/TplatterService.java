package turntabl.io.tplatter.services;

import turntabl.io.tplatter.models.DomainTplatter;
import turntabl.io.tplatter.repository.TplatterRepo;

import java.util.List;

public class TplatterService {
    private TplatterRepo tplatterRepo;

    public TplatterService(TplatterRepo tplatterRepo) {
        this.tplatterRepo = tplatterRepo;
    }

    public Iterable<DomainTplatter> list() {
        return tplatterRepo.findAll();
    }

    public  Iterable<DomainTplatter> save(List<DomainTplatter> weather){
        return TplatterRepo.save(weather);
    }
}
