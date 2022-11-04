package com.xworkz.jpaexamples.Elite;
import static com.xworkz.jpaexamples.enums.StadiumCredentials.INNERGROUND;

import com.xworkz.jpaexamples.entity.StadiumEntity;
import com.xworkz.jpaexamples.repo.StadiumRepository;
import com.xworkz.jpaexamples.repo.StadiumRepositoryImpl;
import com.xworkz.jpaexamples.service.StadiumService;
import com.xworkz.jpaexamples.service.StadiumServiceImpl;

public class StadiumMain {

	public static void main(String[] args) {
		StadiumEntity ent = new StadiumEntity(1, "Kanteerava", 1988, 5000, 350,INNERGROUND);

		StadiumRepository repository = new StadiumRepositoryImpl();

		StadiumService serv = new StadiumServiceImpl(repository);
		serv.validateAndSave(ent);

		System.out.println(ent);

	

	}

}
