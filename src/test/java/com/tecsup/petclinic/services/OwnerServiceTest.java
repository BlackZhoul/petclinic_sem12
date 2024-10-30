package com.tecsup.petclinic.services;


import com.tecsup.petclinic.entities.Pet;
import com.tecsup.petclinic.exception.PetNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import com.tecsup.petclinic.services.OwnerServiceImpl;
import com.tecsup.petclinic.services.OwnerServiceImpl;
import com.tecsup.petclinic.entities.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

import lombok.extern.slf4j.Slf4j;

import java.util.List;


@SpringBootTest
@Slf4j
public class OwnerServiceTest {

	@Autowired
	private OwnerService ownerService;



	@Test
	public void testFindOwnerById() {

		String NAME_EXPECTED = "George";

		Integer ID = 1;

		Owner owner = null;

		try {
			owner = this.ownerService.findById(ID);
		} catch ( OwnerNotFoundException e) {
			fail(e.getMessage());
		}
		assertEquals(NAME_EXPECTED, owner.getName());
	}



}
