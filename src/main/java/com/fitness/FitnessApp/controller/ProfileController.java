package com.fitness.FitnessApp.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
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
import org.springframework.web.client.RestTemplate;
import com.fitness.FitnessApp.modal.ProfileModal;
import com.fitness.FitnessApp.modal.TestModal;
import com.fitness.FitnessApp.repo.Profile;
import com.fitness.FitnessApp.repo.ProfileRepository;
import com.google.gson.Gson;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/trainer")
@Api(value = "fitness", description = "CRUD operations on trainer")
@CrossOrigin("*")
public class ProfileController extends Throwable {

	private static final long serialVersionUID = 1L;
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	private final ProfileRepository profileRepository;
	private final Profile profile;

	public ProfileController(ProfileRepository profileRepository, Profile profile) {
		this.profileRepository = profileRepository;
		this.profile = profile;
	}

	// Create a trainer (or) Update a trainer
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ProfileModal addTrainer(@RequestBody ProfileModal inputprofile) {
		String userId = inputprofile.getUserId();
		ProfileModal result = profile.getByUserId(userId);
		if (result != null) {
			return profile.UpdateProfile(userId, inputprofile);
		}
		return profileRepository.save(inputprofile);
	}

	// Get all trainers
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<ProfileModal> getAllTrainers() {
		return profileRepository.findAll();
	}

	// Get a trainer by id or id's
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public List<ProfileModal> getTtainer(@PathVariable String id) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";
		Pattern pat = Pattern.compile(emailRegex);
		boolean result = pat.matcher(id).matches();
		if (result == true) {
			List<ProfileModal> list = new ArrayList<ProfileModal>();
			list.add(profile.getByUserName(id));
			return list;
		} else {
			return profile.getAllTrainers(id);
		}
	}

	// Get trainer data with
	// userId,imgPath,firstName,lastName,mp4Destination,thumbnailDestination,city
	@RequestMapping(value = "/trainers", method = RequestMethod.GET)
	public List<ProfileModal> getTrainers() {
		LOG.info("Getting trainer limited data.");
		return profile.getLimitedFields();
	}
	
	// Get all trainees registered to a program
	@RequestMapping(value = "/trainees/{Ids}", method = RequestMethod.GET)
	public List<ProfileModal> getTrainees(@PathVariable String Ids) {
		
		return profile.getAllTrainers(Ids);

	}

	// Delete a Trainer user
	@RequestMapping(value = "/delete/{userId}", method = RequestMethod.POST)
	public ProfileModal deleteTrainer(@RequestBody String userId) {
		return profileRepository.deleteByUserId(userId);
	}

	// Get trainers by latitude and longitude
	@RequestMapping(value = "/location", method = RequestMethod.GET)
	public List<ProfileModal> getTrainersByLocation(@RequestBody TestModal test) {
		String longitude = test.getLangitude();
		String latitude = test.getLatitude();
		final String uri = "https://maps.googleapis.com/maps/api/geocode/json?latlng=" + latitude + "," + longitude
				+ "&key=AIzaSyCLzIebD9TXUULS7MkCoPuYGgDUPESLmvM";
		RestTemplate restTemplate = new RestTemplate();
		Object result = restTemplate.getForObject(uri, Object.class);
		String state = "";
		String country = "";
		Gson gson = new Gson();
		String json = gson.toJson(result);
		System.out.println(json);
		// JSONParser parser = new JSONParser();

		JSONObject jsonObject;
		try {
			jsonObject = new JSONObject(json);
			JSONArray results = (JSONArray) jsonObject.get("results");
			JSONObject obj1 = (JSONObject) results.get(1);
			JSONArray address_components = (JSONArray) obj1.get("address_components");
			for (int i = 0; i < address_components.length(); i++) {
				JSONObject obj2 = (JSONObject) address_components.get(i);
				JSONArray types = (JSONArray) obj2.get("types");
				if (types.length() > 1) {
					for (int j = 0; j < types.length(); j++) {
						String sublocality = (String) types.get(j);
						if (sublocality.equals("locality")) {
							state = (String) obj2.get("long_name");
							System.out.println("State is..." + state);
						}
						if (sublocality.equals("country")) {
							country = (String) obj2.get("long_name");
							System.out.println("Country is..." + country);
						}
					}
				}
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return profile.getTrainersByLocation(state);
	}

	@ExceptionHandler({ ProfileController.class })
	public void handleException() {
		System.out.println(getMessage());
	}
}
