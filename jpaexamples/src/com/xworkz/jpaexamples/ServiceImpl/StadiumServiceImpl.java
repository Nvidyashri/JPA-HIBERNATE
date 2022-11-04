package com.xworkz.jpaexamples.ServiceImpl;

import com.xworkz.jpaexamples.Entity.StadiumEntity;
import com.xworkz.jpaexamples.Service.StadiumService;

public class StadiumServiceImpl implements StadiumService{
	public boolean validateAndSave(StadiumEntity entity) {
		System.out.println("create and save");
		
		int id=entity.getId();
		String name=entity.getName();
		int foundedYear=entity.getFounderYear();
		double capacity=entity.getCapacity();
		double entryFees=entity.getEntryFees();
	//	StadiumCredentials type=entity.getType();
		
		if(id>0) {
			System.out.println("Id is valid");
		}
		else {
			return false;
		}
		if(name != null && name.length()>3) {
			System.out.println("name is valid");
		}
		else {
			return false;
		}
		if(foundedYear>0) {
			System.out.println("foundedYear is valid");
		}
		else {
			return false;
		}
		if(capacity>0) {
			System.out.println("capacity is valid");
		}
		else {
			return false;
		}
		if(entryFees>0) {
			System.out.println("entryFees is valid");
		}
		else {
			return false;
		}
		
		
		return repository.save(entity);
	}

}


