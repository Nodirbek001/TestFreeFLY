package uz.b.testfreefly.dto.plan;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import uz.b.testfreefly.domains.Plane;

@Getter
@Setter
@Builder
public class PlaneDTO {
    private String name;
    public Plane toPlane(){
        return Plane.builder()
                .name(this.name)
                .build();
    }
}
