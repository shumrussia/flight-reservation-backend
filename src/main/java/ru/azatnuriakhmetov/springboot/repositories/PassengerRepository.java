package ru.azatnuriakhmetov.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.azatnuriakhmetov.springboot.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{
	
}
