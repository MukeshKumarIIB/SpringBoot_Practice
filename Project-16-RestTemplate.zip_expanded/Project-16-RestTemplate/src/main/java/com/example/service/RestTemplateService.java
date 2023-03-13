package com.example.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.entity.BankEmployee;

@Service
public class RestTemplateService {
	RestTemplate restTemp = new RestTemplate();
	// url
	public static final String get_all_employee_URL = "http://localhost:8080/getAllEmployee";

	public static final String create_employee_URL = "http://localhost:8080/createEmployee";

	public static final String update_employee_URL = "http://localhost:8080/updateEmployee";

	// public static final String
	// delete_employee_by_id_URL="http://localhost:8080/deleteEmployee/{id}";
	public static final String delete_employee_by_id_URL = "http://localhost:8080/deleteEmployee/";

	// public static final String
	// get_employee_by_id_URL="http://localhost:8080/getEmployee/{employeeId}";
	public static final String get_employee_by_id_URL = "http://localhost:8080/getEmployee/";

	@RequestMapping(value = "/template/getAllEmployee", method = RequestMethod.GET)
	public ResponseEntity<String> allEmployee() {
		// to get all employees
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> response = restTemp.exchange(get_all_employee_URL, HttpMethod.GET, entity, String.class);
		return response;
	}

	@RequestMapping(value = "/template/createEmployee", method = RequestMethod.POST)
	public ResponseEntity<String> createEmployee(BankEmployee employee) {
		// TODO Auto-generated method stub
		// add employee
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> response = this.restTemp.exchange(create_employee_URL, HttpMethod.POST, entity,
				String.class);

		return response;

	}

	/*
	 * public BankEmployee getEmployeeById(int employeeId) { // TODO Auto-generated
	 * method stub Map<String,Integer> param=new HashMap<String,Integer>();
	 * param.put("Id",employeeId); return
	 * restTemp.getForObject(get_employee_by_id_URL,BankEmployee.class,param);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

	@RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET)
	public String getEmployeeById(@PathVariable("id") Integer id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BankEmployee> entity = new HttpEntity<BankEmployee>(headers);
		System.out.println("service");
//	      ResponseEntity<String> response=restTemp.exchange(get_employee_by_id_URL+id, HttpMethod.GET, entity, String.class);
//	      ResponseEntity<String> response = restTemp.exchange(get_employee_by_id_URL+id, HttpMethod.GET, entity, String.class);
		ResponseEntity<String> response = restTemp.exchange("http://localhost:8080/getEmployee/"+id,HttpMethod.GET,entity, String.class);
		System.out.println("res : " + response);
		return response.getBody();

	}

	/*
	 * public void updateEmployee(BankEmployee employee) { // TODO Auto-generated
	 * method stub restTemp.put(update_employee_URL,employee); }
	 */

	@RequestMapping(value = "/template/updateEmployee", method = RequestMethod.PUT)
	public String updateEmployee(@RequestBody BankEmployee employee) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BankEmployee> entity = new HttpEntity<BankEmployee>(employee, headers);

		return restTemp.exchange("update_employee_URL", HttpMethod.PUT, entity, String.class).getBody();
	}
	/*
	 * public void deleteEmployeeById(int employeeId) { // TODO Auto-generated
	 * method stub Map<String,Integer> param=new HashMap<String,Integer>();
	 * param.put("Id",employeeId);
	 * restTemp.getForObject(delete_employee_by_id_URL,BankEmployee.class,param);
	 * 
	 * }
	 */

	@RequestMapping(value = "/template/deleteEmployee/", method = RequestMethod.DELETE)
	public String deleteEmployeeById(@PathVariable("id") String id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BankEmployee> entity = new HttpEntity<BankEmployee>(headers);

		return restTemp.exchange("delete_employee_by_id_URL" + id, HttpMethod.DELETE, entity, String.class).getBody();
	}

}
