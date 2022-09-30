package com.challenge.challenge.controller;

import java.io.File;
import java.util.Date;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ChallengeController {
	
	@GetMapping("/getCurrentDate")
	public Date getCurrentDate() {
		return new Date();
	}
	
	@GetMapping("/getSystemStats")
	public String getSystemStats() {
		File cDrive = new File("C:");
		StringBuilder stats = new StringBuilder();
		stats.append("Total Space: "+( (double)cDrive.getTotalSpace() /1073741824));
		stats.append(" , ");
		stats.append("Free Space: "+((double)cDrive.getFreeSpace() /1073741824));
		stats.append(" , ");
		stats.append("Usable Space: "+((double)cDrive.getUsableSpace() /1073741824));
		return stats.toString();
	}

}
