package cl.zakur.java.arq.appdemoarqlayers.service;

import cl.zakur.java.arq.appdemoarqlayers.service.exception.ServiceException;

import java.util.List;
import java.util.Optional;

public interface GenericService<T> {
    List<T> findLike(T t) throws ServiceException;

    Optional<T> findById(T t) throws ServiceException;

    T save(T t) throws ServiceException;
}
