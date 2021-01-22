package com.example.demo.personel.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.personel.model.personel;
import com.example.demo.personel.repository.PersonelRepository;

@RestController
public class personelController {
	@Autowired
	private PersonelRepository repository;

	@GetMapping("/deneme")
	public List<personel> getAll() {
		return repository.findAll();
	}
}
