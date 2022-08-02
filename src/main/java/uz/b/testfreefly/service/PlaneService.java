package uz.b.testfreefly.service;

import lombok.NonNull;
import uz.b.testfreefly.dao.PlaneDAO;
import uz.b.testfreefly.dto.plan.PlaneDTO;

public class PlaneService extends Service<PlaneDAO> {

    public PlaneService(PlaneDAO dao) {
        super(dao);
    }
    public void create(@NonNull PlaneDTO planDTO){

    }
}
