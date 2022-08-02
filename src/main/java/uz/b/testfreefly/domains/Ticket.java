package uz.b.testfreefly.domains;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ManyToAny;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToAny
    private List<Users> users;
    @ManyToOne
    private TicketForm ticketForm;
    private String from;
    private String to;
}
