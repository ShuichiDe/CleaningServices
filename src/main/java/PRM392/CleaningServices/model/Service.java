package PRM392.CleaningServices.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "services")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long servicesId;

    @Column(nullable = false)
    private String serviceName;

    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer duration; // Duration in minutes

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
