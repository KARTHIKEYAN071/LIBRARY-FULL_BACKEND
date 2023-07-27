package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Books;
import com.example.demo.Entity.feedback;
import com.example.demo.Entity.signupentity;
import com.example.demo.Service.signupservice;

@RestController
@CrossOrigin
public class signupcontroller {
	@Autowired
	signupservice ser;
	
	@PostMapping("/addDetails") 
	public signupentity addinfo(@RequestBody signupentity st)
	{
		return ser.saveDetails(st);
	}
	@PostMapping("/addBooks") 
	public Books addinfo(@RequestBody Books bk)
	{
		return ser.saveDetails(bk);
	}
	@PostMapping("/addfeedback") 
	public feedback addinfo(@RequestBody feedback fb)
	{
		return ser.feedbackDetails(fb);
	}
	@GetMapping("/showDetails")
	public List<signupentity> fetchDails()
	{
		return ser.getDetails();
	}
	@GetMapping("/showfeedback")
	public List<feedback> fetDetails()
	{
		return ser.feedDetail();
	}
	@GetMapping("/showAdmin")
	public List<Admin> fetch()
	{
		return ser.Detail();
	}
	@GetMapping("/showBooks")
	public List<Books> fetchDetail()
	{
		return ser.getDetail();
		
	}
	@PutMapping("/updateDetails")
		public signupentity updateInfo(@RequestBody signupentity st)
		{
			return ser.updateDetails(st);
		}
	@PutMapping("/updateBooks")
	public Books updateInfos(@RequestBody Books bk)
	{
		return ser.updateDetail(bk);
	}
	@DeleteMapping("/deleteDetails/{sid}")
	 String deleteInfo(@PathVariable("sid") int sid) {
		ser.deleteDetails(sid);
		return "Deleted the data";
	}
	@DeleteMapping("/deleteBook/{id}")
	 String deleteInfos(@PathVariable("id") int id) {
		ser.deleteDetail(id);
		return "Deleted the data";
	}
	@GetMapping("showDetails/{sname}")
	public List<signupentity> getWithSort(@PathVariable String sname){
		return ser.getSorted(sname);
	}
	@GetMapping("showDetails/{offset}/{pageSize}")
	public List<signupentity> productWithPagination(@PathVariable int offset,@PathVariable int pageSize)
	{
		return ser.getWithPagination(offset,pageSize);
	}
	
}
