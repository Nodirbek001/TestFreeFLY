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
        if(dao.findPlaneByName(planDTO.getName()).isEmpty()){
            throw new BadRequestException("this name already token");
        }
        Plane plane1=planDTO.toPlane();
        dao.create(plane1);
    }
}
