package cl.zakur.java.arq.appdemoarqlayers.service;

import cl.zakur.java.arq.appdemoarqlayers.entity.SedeEntity;
import cl.zakur.java.arq.appdemoarqlayers.service.exception.ServiceException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SedeServiceImpl implements SedeService{

    @Override
    public List<SedeEntity> findLike(SedeEntity sedeEntity) throws ServiceException {
        return null;
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
