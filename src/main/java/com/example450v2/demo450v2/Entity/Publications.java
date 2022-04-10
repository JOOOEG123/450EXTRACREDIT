package com.example450v2.demo450v2.Entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import lombok.Getter;
import lombok.Setter;
@Entity
@DiscriminatorColumn(name = "PUBLICATIONS")
public class Publications {
    @Id
    private String PUBLICATIONID;
    public String getPUBLICATIONID() {
        return PUBLICATIONID;
    }
    public void setPUBLICATIONID(String pUBLICATIONID) {
        PUBLICATIONID = pUBLICATIONID;
    }
    public String getTITLE() {
        return TITLE;
    }
    public void setTITLE(String tITLE) {
        TITLE = tITLE;
    }
    public String getYEAR() {
        return YEAR;
    }
    public void setYEAR(String yEAR) {
        YEAR = yEAR;
    }
    public String getTYPE() {
        return TYPE;
    }
    public void setTYPE(String tYPE) {
        TYPE = tYPE;
    }
    public String getSUMMARY() {
        return SUMMARY;
    }
    public void setSUMMARY(String sUMMARY) {
        SUMMARY = sUMMARY;
    }
    private String TITLE;
    private String YEAR;
    private String TYPE;
    private String SUMMARY;
}
