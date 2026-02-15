package DesignQuestions.DesignParkingLot.model;

import java.util.Date;

public class BaseModel {

    private int id;
    private Date createdAt;
    private Date updatedAt;


    public Date getCreatedAt() {
        return createdAt;
    }

    public int getId() {
        return id;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
