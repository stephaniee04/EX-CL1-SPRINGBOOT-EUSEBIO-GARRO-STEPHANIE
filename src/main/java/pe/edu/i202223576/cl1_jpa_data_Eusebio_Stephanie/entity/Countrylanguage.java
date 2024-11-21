package pe.edu.i202223576.cl1_jpa_data_Eusebio_Stephanie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Countrylanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Country country;
    private String Language;
    private String IsOfficial;
    private double Percentage;
}






