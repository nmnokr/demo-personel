package com.example.demo.personel.resource;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.personel.SystemLogger;
import com.example.demo.personel.model.personel;
import com.example.demo.personel.repository.PersonelRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
 
@RestController
@RequestMapping("/test")
@Api(value = "Test Rest Api", description = "Test Rest Service")

@ApiResponses(value = { @ApiResponse(code = 200, message = "istek basarili oldu."),
		@ApiResponse(code = 401, message = "istek kullanıcı dogrulaması veya mesaj gerektiriyor."),
		@ApiResponse(code = 403, message = "erişim yetki srounu"),
		@ApiResponse(code = 404, message = "adres bulunamadı") })
public class personelController {

	@Autowired
	private PersonelRepository repository;

	@WriteOperation
	@GetMapping("/getall")
	@ApiOperation(value = "Test api operation")
	public List<personel> getAll() throws IOException {
		SystemLogger.getInstance().write("deneme");
		return repository.findAll();
	}

	@RequestMapping(value = "/addpersonel", method = RequestMethod.POST)
	public ResponseEntity<String> postCharacter(@RequestBody personel per) {
		repository.save(per);
		return new ResponseEntity<>("Kayıt İşlemi Başarılı!", HttpStatus.OK);
	}

	@DeleteMapping("/deleteallpersonel")
	public ResponseEntity<HttpStatus> deleteAllTutorials() {
		try {
			repository.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/deletepersonel/{id}")
	public void deleteEmployee(@PathVariable String id) {
		repository.deleteById(id);
	}

	@GetMapping("/getpersonel/{id}")
	public personel findCustomerById(@PathVariable String id) {
		return repository.findCustomerById(id);
	}

	@RequestMapping("/deneme")
	public String index() {
		return "denemetest";
	}

	@PutMapping("/employmentTerminationDate/{date}")
	personel replaceEmployee(@RequestBody personel newEmployee, @PathVariable String date) {

		newEmployee.setEmploymentTerminationDate(date);

		return repository.save(newEmployee);

	}

}
