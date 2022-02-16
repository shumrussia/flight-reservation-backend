package ru.azatnuriakhmetov.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.azatnuriakhmetov.springboot.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	
}
