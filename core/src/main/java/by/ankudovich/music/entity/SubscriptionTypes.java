package by.ankudovich.music.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(schema = "muzlo", name = "subcsriptionTypes")
public class SubscriptionTypes {
    @Id
    @GeneratedValue
    private Long subscr_Id;

    private String typeName;
    private String description;

}
