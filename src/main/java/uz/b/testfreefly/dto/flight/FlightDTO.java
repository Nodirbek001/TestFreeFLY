package uz.b.testfreefly.dto.flight;

import lombok.*;
import uz.b.testfreefly.domains.Flight;
import uz.b.testfreefly.domains.Plane;

import java.sql.Timestamp;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class FlightDTO {
    private Plane plane;
    private String from;
    private String to;
    private Timestamp begin;
    private Timestamp end;


    public Flight toFlight(){
       return Flight.builder()
                .plane(this.plane)
                .from(this.from)
                .to(this.to)
                .begin(this.begin)
                .end(this.end)
                .build();

    }

}
