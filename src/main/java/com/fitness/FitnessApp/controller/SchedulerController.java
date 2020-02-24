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
import com.fitness.FitnessApp.modal.DayModal;
import com.fitness.FitnessApp.modal.SchedulerModal;
import com.fitness.FitnessApp.repo.Scheduler;
import com.fitness.FitnessApp.repo.SchedulerRepository;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/scheduler")
@Api(value = "fitness", description = "CRUD operations on scheduler")
@CrossOrigin("*")
public class SchedulerController extends Throwable {

	private static final long serialVersionUID = 1L;
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	private final SchedulerRepository schedulerRepository;
	private final Scheduler scheduler;

	public SchedulerController(SchedulerRepository schedulerRepository, Scheduler scheduler) {
		this.schedulerRepository = schedulerRepository;
		this.scheduler = scheduler;
	}

	// Create a scheduler (or) Update a scheduler
	@RequestMapping(value = "", method = RequestMethod.POST)
	public SchedulerModal addSchedular(@RequestBody SchedulerModal inputScheduler) {
		SchedulerModal result = scheduler.getSchedulerData(inputScheduler);
		if (result != null) {
			return scheduler.updateScheduler(inputScheduler);
		}
		return schedulerRepository.save(inputScheduler);
	}

	// Get scheduler created by a trainer by trainer id and month
	@RequestMapping(value = "/trainer", method = RequestMethod.POST)
	public SchedulerModal getSchedulerByTrainer(@RequestBody SchedulerModal inputScheduler) {
		return scheduler.getSchedulerData(inputScheduler);
	}

	// Get scheduled day slot by trainer id and day id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Object getDayFromSchedulerById(@PathVariable String id) {
		return scheduler.getDayFromSchedulerById(id);
	}

	// Get scheduled day by trainer id and date
	@RequestMapping(value = "/day/{date}", method = RequestMethod.GET)
	public List<SchedulerModal> getDayFromScheduler(@PathVariable String date) {
		return scheduler.getDayFromScheduler(date);
	}

	// Update a day in scheduler
	@RequestMapping(value = "/day", method = RequestMethod.POST)
	public Object updateDayInScheduler(@RequestBody DayModal day) {
		return scheduler.updateDay(day);
	}

	@ExceptionHandler({ SchedulerController.class })
	public void handleException() {
		System.out.println(getMessage());
	}
}
