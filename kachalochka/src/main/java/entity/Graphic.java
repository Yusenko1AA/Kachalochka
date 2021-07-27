package entity;

import java.util.Date;

public class Graphic {
    private Date startDate;
    private Date endDate;
    private Client client;
    private EquipmentTypeEnum equipment;
    private Trainer trainer;

    public Graphic(Date startDate, Date endDate, Client client, Trainer trainer) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.client = client;
        this.trainer = trainer;
    }

}
