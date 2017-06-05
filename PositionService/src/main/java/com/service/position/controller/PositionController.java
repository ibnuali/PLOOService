package com.service.position.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PositionController {
	
//	@RequestMapping(value="/insertposition",method = RequestMethod.POST)
//	public Position insert(@RequestBody String input){
//		ObjectMapper mapper = new ObjectMapper();
//		JsonNode node = null;
//		try {
//			node = mapper.readTree(input);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		PositionRepository positionrepo;
//		Pengaju temp_pengaju,pengaju;
//		temp_pengaju = mapper.convertValue(node.get("pengaju"), Pengaju.class);
//		pengaju = pengaju_repo.FindByNim(temp_pengaju.getNim_pengaju());
//		if(pengaju == null){
//			pengaju = temp_pengaju;
//			pengaju = pengaju_repo.save(pengaju);
//		}
//		
//		Ormawa ormawa = ormawa_repo.FindById(node.get("id_ormawa").asInt());
//		Pansus pansus = pansus_repo.FindByNim(node.get("nim_pansus").asText());
//		
//		Position kegiatan = new Position(node.get("nama_kegiatan").asText(),SqlDate,node.get("tempat_kegiatan").asText(),pansus,pengaju,ormawa);
//		return positionrepo.save(kegiatan);
	//}
}