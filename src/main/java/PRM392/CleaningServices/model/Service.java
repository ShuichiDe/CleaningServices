package PRM392.CleaningServices.model;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "services")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long servicesId;

    private String serviceName;
    private String description;
    private Double price;
    private Integer duration; // Duration in minutes
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}