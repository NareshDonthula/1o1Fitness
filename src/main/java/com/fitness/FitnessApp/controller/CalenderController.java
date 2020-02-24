package com.fitness.FitnessApp.controller;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fitness.FitnessApp.repo.CalenderRepository;
import com.fitness.FitnessApp.modal.CalenderModal;
import com.fitness.FitnessApp.repo.Calender;
import io.swagger.annotations.Api;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

@RestController
@RequestMapping(value = "/calendar")
@Api(value="fitness", description="CRUD operations on calendar")
@CrossOrigin
public class CalenderController extends Throwable{
	
	private static final long serialVersionUID = 1L;
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	private final CalenderRepository calenderRepository;
	private final Calender calender;

	public CalenderController(CalenderRepository calenderRepocitory, Calender calender) {
		this.calenderRepository = calenderRepocitory;
		this.calender = calender;

	}
	
	// Create a calendar (or) Update a calendar
	@RequestMapping(value = "", method = RequestMethod.POST)
	public CalenderModal addCalender(@RequestBody CalenderModal inputcalender) {
		String calenderId = inputcalender.getCalenderId();
		CalenderModal result = calender.getCalenderByCalenderId(calenderId);
		if (result != null) {
			return calender.UpdateCalenderData(calenderId, inputcalender);
		}
		return calenderRepository.save(inputcalender);
	}
	
	// Get calendar data created by a trainer by program id
	@RequestMapping(value = "/{program_id}", method = RequestMethod.GET)
	public CalenderModal getCalenderByProgramId(@PathVariable String program_id) {
		return calender.getDataByProgramId(program_id);
		/*
		 * CalenderModal calendar = null; calendar =
		 * calender.getDataByProgramId(program_id); String days = calendar.getDays();
		 * JSONParser parser = new JSONParser(); try { JSONObject json = (JSONObject)
		 * parser.parse(days); System.out.println(json); } catch (ParseException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } return calendar;
		 */
	}
	
	@ExceptionHandler({ExerciseController.class})
	public void handleException() {
		System.out.println(getMessage());
	}
}
