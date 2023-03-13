package com.pagination;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
@RequestMapping
public class PageRestController {

	@Autowired
	UserRepository repo;
	
//	@Autowired
//	UserEntity userEnt;
	
	
	 @GetMapping("/page-One")
      public List<UserEntity> getOne(){
    	  
    	 
		 Pageable paging = PageRequest.of(
	              0, 5, Sort.by("user").ascending());
	          Page<UserEntity> page = repo.findAll(paging);
	   
	          // Retrieve the items
	          return page.getContent();
          // Retrieve the items
		 
		 
		 	
		 
        
        
      }
      
      @GetMapping("/page-Two")
      public List<UserEntity> getPageTwo()
      {
   
          // Second page with another 5 items
          Pageable paging = PageRequest.of(
              1, 5, Sort.by("user").ascending());
          Page<UserEntity> page = repo.findAll(paging);
   
          // Retrieve the items
          return page.getContent();
      }
      
	

}
