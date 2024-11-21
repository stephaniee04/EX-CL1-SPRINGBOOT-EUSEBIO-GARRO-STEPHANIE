package pe.edu.i202223576.cl1_jpa_data_Eusebio_Stephanie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202223576.cl1_jpa_data_Eusebio_Stephanie.Repository.CountryRepository;
import pe.edu.i202223576.cl1_jpa_data_Eusebio_Stephanie.entity.Country;
import pe.edu.i202223576.cl1_jpa_data_Eusebio_Stephanie.entity.Countrylanguage;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class Cl1JpaDataEusebioStephanieApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataEusebioStephanieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	/*	// Buscar el país Argentina (ARG)
		Optional<Country> paisArgentina = countryRepository.findById("ARG");

		// Usar ifPresentOrElse para manejar el caso de Argentina
		paisArgentina.ifPresentOrElse(
				// Si existe el país Argentina, mostrar sus lenguajes
				pais -> {
					System.out.println("Lenguajes hablados en Argentina:");
					pais.getCountrylanguage().forEach(l -> System.out.println(l.getLanguage()));
				},
				// Si no existe Argentina, buscar y mostrar los lenguajes de Perú
				() -> {
					System.out.println("No se encontró el país Argentina. Mostrando lenguajes de Perú:");
					Optional<Country> paisPeru = countryRepository.findById("PER");
					paisPeru.ifPresentOrElse(
							pais -> pais.get().forEach(l -> System.out.println(l.getLanguage())),
							() -> System.out.println("No se encontraron lenguajes para Perú.")
					);
				}
		);
		}
	*/
		/*//deleteAllById()
		// Lista de países a eliminar
		List<String> lista = List.of("COL", "ARG");

		// Filtrar solo los países que existen en la base de datos
		List<String> existentes = lista.stream()
				.filter(countryRepository::existsById)
				.collect(Collectors.toList());
		// Eliminar los países existentes
		countryRepository.deleteAllById(existentes);

	}*/

	}
}