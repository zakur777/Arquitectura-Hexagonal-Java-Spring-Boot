package cl.zakur.java.arq.appdemoarqlayers.rest.api;

import cl.zakur.java.arq.appdemoarqlayers.entity.SedeEntity;
import cl.zakur.java.arq.appdemoarqlayers.service.SedeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Objects.isNull;
import static cl.zakur.java.arq.appdemoarqlayers.rest.commons.APIEndPointConst.API_SEDE;
import static cl.zakur.java.arq.appdemoarqlayers.rest.commons.APIMessageConst.MSG_INTERNAL_SERVER_ERROR;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(API_SEDE)
public class SedeREST {

    private final SedeService sedeService;

    @GetMapping
    public ResponseEntity<?> findLike(@RequestParam(value = "nombre", defaultValue = "") String nombre) {
        try {
            List<SedeEntity> sedes = sedeService.findLike(SedeEntity.builder().nombreCorto(nombre).build());
            if (isNull(sedes) || sedes.isEmpty()) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.ok(sedes);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(MSG_INTERNAL_SERVER_ERROR);
        }
    }
}
