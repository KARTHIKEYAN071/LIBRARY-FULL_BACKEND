package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Books;
import com.example.demo.Entity.feedback;
import com.example.demo.Entity.signupentity;
import com.example.demo.Repository.adminrepo;
import com.example.demo.Repository.bookrepo;
import com.example.demo.Repository.feedrepo;
import com.example.demo.Repository.signuprepo;

@Service
public class signupservice {
	@Autowired(required=true)
	signuprepo Repo;
	@Autowired(required=true)
	bookrepo bkrp;
	@Autowired(required=true)
	adminrepo adrp;
	@Autowired(required=true)
	feedrepo fbrp;
	public signupentity saveDetails(signupentity e)
	{
		return Repo.save(e);
	}
	public Books  saveDetails(Books b)
	{
		return bkrp.save(b);
	}
	public feedback  feedbackDetails(feedback fb)
	{
		return fbrp.save(fb);
	}
	public List<signupentity> getDetails(){
		return Repo.findAll();
	} 
	
	public List<Books> getDetail(){
		return bkrp.findAll();
	}
	public List<feedback> feedDetail(){
		return fbrp.findAll();
	}
	public List<Admin> Detail(){
		return adrp.findAll();
	}
	public signupentity updateDetails(signupentity e) {
		return Repo.saveAndFlush(e);
	}
	public Books updateDetail(Books b) {
		return bkrp.saveAndFlush(b);
	}
	public Admin update(Admin ad) {
		return adrp.saveAndFlush(ad);
	}
	public void deleteDetails(int id) {
		Repo.deleteById(id);
		
	}
	public void deleteDetail(int id) {
		bkrp.deleteById(id);
		
	}
	public List<signupentity> getSorted(String sname){
		return Repo.findAll(Sort.by(Sort.Direction.ASC,sname));
	}

	public List<signupentity> getWithPagination(@PathVariable int offset,@PathVariable int pageSize){
		Page<signupentity> page = Repo.findAll(PageRequest.of(offset,pageSize));
		return page.getContent();


}
}
