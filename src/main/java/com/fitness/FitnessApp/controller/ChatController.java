package com.fitness.FitnessApp.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fitness.FitnessApp.modal.ChatModal;

@RestController
@RequestMapping(value = "/video_chat")
@CrossOrigin("*")
public class ChatController extends Throwable {

	private final ChatModal chatModal;

	public ChatController(ChatModal chatModal) {
		this.chatModal = chatModal;
	}

	// Get vidyo token
	@RequestMapping(value = "/token", method = RequestMethod.GET)
	public String getToken(@PathVariable String input) {
		System.out.println("Entered into the class.");
		System.out.println("Started.");
		String result = "";
		String newResult = "";
		String[] array = input.split("-");
		System.out.println("Started123.");
		try {
			System.out.println("process buildr start.");
			Process process = new ProcessBuilder("java", "-jar", "/home/ec2-user/generateToken.jar",
					"--key=" + array[0], "--appID=" + array[1], "--userName=" + array[2], "--expiresInSecs=" + array[3])
							.start();
			System.out.println("token reader...");
			BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
			while ((result = in.readLine()) != null) {
				System.out.println(result);
				newResult = result;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newResult;
	}
}
