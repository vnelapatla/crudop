package com.example.crud.crudop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetImageApi
{
	
	@Autowired
	@Qualifier("Bean2")
	RestTemplate rt;
//given api lorem picsum
	//create api to get the imges
	//pass the id-
	//pass the length and breadth
	@GetMapping(value="/getimagebyId",produces = MediaType.IMAGE_PNG_VALUE)
	public byte[] getImage(@RequestParam("id") int id, @RequestParam("l") int l,@RequestParam("b")int b )
	{
		String url="https://picsum.photos/id/"+id+ "/"+l+"/"+b;
		
		//in java we have webclient or rest templte
		//RestTemplate rt=new RestTemplate();
		byte[] response=rt.getForObject(url, byte[].class);
		
		return response;
	}
}
