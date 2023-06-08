package akaza.gdt.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import akaza.gdt.com.entity.Adresse;
import akaza.gdt.com.entity.TeamHeader;
import akaza.gdt.com.entity.Terain;
import akaza.gdt.com.serviceImplement.AdresseServiceImpl;
import akaza.gdt.com.serviceImplement.TeameHeaderServiceImpl;
import akaza.gdt.com.serviceImplement.TerainServiceImpl;

@SpringBootApplication
public class GestionDesTerainApplication implements CommandLineRunner {

	@Autowired
	private TerainServiceImpl terainServiceImpl;
	@Autowired
	private TeameHeaderServiceImpl teameHeaderServiceImpl;
	@Autowired
	private AdresseServiceImpl adresseServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(GestionDesTerainApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		create();
	}

	private void create() {
		terainServiceImpl.saveOrUpdate(Terain.builder().name("hamza").prix_per_houre(150)
				.address(Adresse.builder().city("beni mellal").Latitude("321323").Longitude("àçé_àçé_ç_'").fullAdresse("full adresse").build())
				.build());
		teameHeaderServiceImpl.saveOrUpdate(TeamHeader.builder().name("hamza").build());

	}

}
