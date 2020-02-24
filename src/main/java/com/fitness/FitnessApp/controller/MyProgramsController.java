package com.fitness.FitnessApp.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fitness.FitnessApp.repo.MyProgramRepository;
import com.fitness.FitnessApp.modal.MyProgramModal;
import com.fitness.FitnessApp.repo.MyProgram;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/program")
@Api(value = "fitness", description = "CRUD operations on program")
@CrossOrigin
public class MyProgramsController extends Throwable {
	private static final long serialVersionUID = 1L;
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final MyProgramRepository myProgramRepository;
	private final MyProgram myProgram;

	public MyProgramsController(MyProgramRepository myProgramRepository, MyProgram myProgram) {
		this.myProgramRepository = myProgramRepository;
		this.myProgram = myProgram;

	}

	// Create a program (or) Update a program
	@RequestMapping(value = "", method = RequestMethod.POST)
	public MyProgramModal addProgram(@RequestBody MyProgramModal inputprogram) {
		String programId = inputprogram.getProgramId();
		MyProgramModal result = myProgram.getProgramByProgramId(programId);
		if (result != null) {
			return myProgram.UpdateMyprogram(programId, inputprogram);
		}
		return myProgramRepository.save(inputprogram);
	}

	// Get a program by program id
	@RequestMapping(value = "/{program_id}", method = RequestMethod.GET)
	public MyProgramModal getProgramById(@PathVariable String program_id) {
		return myProgram.getProgramByProgramId(program_id);
	}
    
	// Get all program created by a trainer by trainer id
	@RequestMapping(value = "/trainer/{trainer_id}", method = RequestMethod.GET)
	public List<MyProgramModal> getAllProgramsById(@PathVariable String trainer_id) {
		return myProgram.getAllProgramsById(trainer_id);
	}

	/*
	 * @RequestMapping(value = "/delete/", method = RequestMethod.POST) public
	 * Object deleteExercise(@RequestBody String exerciseId) { return
	 * exerciseRepository.deleteByExerciseId(exerciseId); }
	 */

	@ExceptionHandler({ ExerciseController.class })
	public void handleException() {
		System.out.println(getMessage());
	}
}
