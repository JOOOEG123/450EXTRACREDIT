package com.example450v2.demo450v2.Entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name = "AUTHORS")
public class Authors {
    @Id
    private String PUBLICATIONID;
    public String getPUBLICATIONID() {
        return PUBLICATIONID;
    }
    public void setPUBLICATIONID(String pUBLICATIONID) {
        PUBLICATIONID = pUBLICATIONID;
    }


    @Column(name = "AUTHOR")
    private String AUTHOR;
    public String getAUTHOR() {
        return AUTHOR;
    }
    public void setAUTHOR(String aUTHOR) {
        AUTHOR = aUTHOR;
    }

}
