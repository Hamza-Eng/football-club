package akaza.gdt.com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Adresse {

	String Latitude;
	String Longitude;
	String city;
	String street;
	String fullAdresse;
}
