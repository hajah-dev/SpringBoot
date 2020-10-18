package org.study.studying;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.study.studying.dao.EtudiantRepository;
import org.study.studying.entities.Etudiant;

import java.util.Date;

@SpringBootApplication
public class StudyingApplication implements CommandLineRunner {
	/**
	 * Dans le cas suivant, quand on démarre l'application, SpringApplication.run(...) va
	 * démarrer. Une fois que le démarrage se fait, automatiquement Spring va exécuter la
	 * méthode run(...)
	 */
	@Autowired
	private EtudiantRepository etudiantRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudyingApplication.class, args);
	};

	@Override
	public void run(String... args) throws Exception {
		etudiantRepository.save(new Etudiant(null, "Haja","haja@yahoo.fr",new Date(),112));
		etudiantRepository.save(new Etudiant(null, "Mirana","Mirana@gmail.com",new Date(),112));
		etudiantRepository.save(new Etudiant(null, "Malalatiana","mlttn@gmail.fr",new Date(),85));
		etudiantRepository.findAll().forEach(etudiant -> {
			System.out.println(etudiant);
		});
		/**
		 * Pour chercher un etudiant avec sa clé primaire
		 */
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		Etudiant etudiant = etudiantRepository.findById(2L).get();
		System.out.println(etudiant.getName());
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		etudiantRepository.findByScore(112).forEach(et -> {
			System.out.println(et.getName());
		});
	}
}

