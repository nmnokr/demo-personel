package com.example.demo.personel.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.personel.model.personel;
import com.example.demo.personel.repository.PersonelRepository;
 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class personelController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private PersonelRepository repository;

	@GetMapping("/getall")
	public List<personel> getAll() {
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


}
