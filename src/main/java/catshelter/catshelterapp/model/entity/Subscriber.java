package catshelter.catshelterapp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


    @Entity
    @Table(name = "subscribers")
    public class Subscriber extends BaseEntity {

        @NotNull
        private String subsEmail;

        public String getSubsEmail() {
            return subsEmail;
        }

        public void setSubsEmail(String subsEmail) {
            this.subsEmail = subsEmail;
        }

    }
