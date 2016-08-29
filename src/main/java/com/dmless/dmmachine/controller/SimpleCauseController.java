package com.dmless.dmmachine.controller;

import com.dmless.dmmachine.model.cause.SimpleCause;
import com.dmless.dmmachine.service.exceptions.CauseNotFoundException;
import com.dmless.dmmachine.service.causes.SimpleCauseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Serves a base cause
 * Author: Charles Roth
 */
@RestController
public class SimpleCauseController {

	@Autowired
	SimpleCauseService simpleCauseService;

	@RequestMapping(value="/simplecause/{id}",method=RequestMethod.GET)
	@ResponseBody
	public SimpleCause findSimpleCauseById(@PathVariable String id){
		SimpleCause foundCause;
		try{
			foundCause = simpleCauseService.findSimpleCauseById(Long.parseLong(id));
		}catch(CauseNotFoundException e){
			throw new RuntimeException(e);
		}
		return foundCause;
	}

	@RequestMapping(value="/simplecause/random",method=RequestMethod.GET)
	@ResponseBody
	public SimpleCause getRandomCreature(){
		SimpleCause foundCause;
		try {
			foundCause = simpleCauseService.getRandomSimpleCause();
		} catch (CauseNotFoundException e) {
			throw new RuntimeException(e);
		}
		return foundCause;
	}

}
