package cl.zakur.java.arq.appdemoarqlayers.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@EqualsAndHashCode(callSuper = false)
@Builder
@Data
@Entity(name = "SedeEntity")
@Table(name = "TBL_SEDE")
@NoArgsConstructor
@AllArgsConstructor
public class SedeEntity extends GenericEntity {

    private static final long serialVersionUID = 4438102336059872786L;

    @Id
    @Column(name = "SEDE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqSede")
    @SequenceGenerator(name = "seqSede", allocationSize = 1, sequenceName = "SEQ_SEDE")
    @Builder.Default
    private Long id = 0L;

    @Size(min = 4, max = 120, message = "El nombre corto es requerido y debe ser mayor que {min} y máximo {max} caracteres")
    @Column(name="NOMBRE_CORTO")
    private String nombreCorto;

    @Size(min = 20, max = 400, message = "El nombre largo es requerido y debe ser mayor que {min} y máximo {max} caracteres")
    @Column(name="NOMBRE_LARGO")
    private String nombreLargo;
}
