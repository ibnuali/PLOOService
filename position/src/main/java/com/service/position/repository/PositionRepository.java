package com.service.position.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.service.position.model.Position;

@Repository
public interface PositionRepository extends CrudRepository<Position, String>{
	
	//findpositionbyplayer
	
//	@Query("SELECT p FROM PlayerPosition p WHERE p.id_player =?1")
//	List<Position> findPositionByPlayer(PositionPlayer id_player);

	
//	@Query("SELECT c FROM City c WHERE c.id_province = ?1")
//	List<City> findByProvince(Province prov);
//	
//	@Query("SELECT c FROM City c")
//	List<City> findAll();
}
