package uz.b.testfreefly.service;

import lombok.NonNull;
import uz.b.testfreefly.dao.PlaneDAO;
import uz.b.testfreefly.domains.Plane;
import uz.b.testfreefly.dto.plan.PlaneDTO;
import uz.b.testfreefly.exceptions.BadRequestException;

public class PlaneService extends Service<PlaneDAO> {

    public PlaneService(PlaneDAO dao) {
        super(dao);
    }

    public void create(@NonNull PlaneDTO planDTO) {
        Plane plane = dao.findPlaneByName(planDTO.getName()).orElseThrow(() -> {
            throw new BadRequestException("alredy token this name");
        });
        Plane plane1=planDTO.toPlane();
        dao.create(plane1);
    }
}
