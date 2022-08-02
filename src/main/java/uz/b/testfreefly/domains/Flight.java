package uz.b.testfreefly.domains;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Plane plane;
    private Integer user_capacity;
    private String from;
    private String to;
    private Timestamp begin;
    private Timestamp end;
}
