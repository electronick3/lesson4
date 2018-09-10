package ru.chagay.adv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chagay.adv.models.Advertisement;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {

}