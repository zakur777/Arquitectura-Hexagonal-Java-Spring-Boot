package cl.zakur.java.arq.appdemoarqlayers.service;

import cl.zakur.java.arq.appdemoarqlayers.entity.SedeEntity;
import cl.zakur.java.arq.appdemoarqlayers.repository.SedeRepository;
import cl.zakur.java.arq.appdemoarqlayers.service.exception.ServiceException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static cl.zakur.java.arq.appdemoarqlayers.commons.persistencia.QueryUtil.getLike;

@RequiredArgsConstructor
@Service
public class SedeServiceImpl implements SedeService{

    public final SedeRepository sedeRepository;

    /*
    public SedeServiceImpl(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }
     */

    @Override
    public List<SedeEntity> findLike(SedeEntity sedeEntity) throws ServiceException {
        return sedeRepository.findLike(getLike(sedeEntity.getNombreCorto()));
    }

    @Override
    public Optional<SedeEntity> findById(SedeEntity sedeEntity) throws ServiceException {
        return Optional.empty();
    }

    @Override
    public SedeEntity save(SedeEntity sedeEntity) throws ServiceException {
        return null;
    }
}
