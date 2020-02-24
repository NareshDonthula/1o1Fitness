package com.fitness.FitnessApp.controller;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fitness.FitnessApp.modal.MastersModal;
import com.fitness.FitnessApp.repo.Masters;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/masters")
@Api(value = "fitness", description = "CRUD operations on masters")
@CrossOrigin("*")
public class MastersController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());
	private final Masters masters;

	public MastersController(Masters masters) {
		this.masters = masters;
	}

	// Get masters data based on type
	@RequestMapping(value = "/{type}", method = RequestMethod.GET)
	public List<MastersModal> getAllMastersByType(@PathVariable String type) {
		return masters.getAllMastersByType(type);
	}
}
