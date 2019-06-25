package com.wisely.ch8_2.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisely.ch8_2.dao.PersonRepository;
import com.wisely.ch8_2.domain.Person;

@RestController
public class DataController {

	
	
	@Autowired PersonRepository personRepository;
	  
	@RequestMapping("/hello") public String hello() { return "Hello World!!"; }
	 
	/**
	 * 保存
	 * @Title: save
	 * @Description: TODO
	 * @param @param name
	 * @param @param address
	 * @param @param age
	 * @param @return  
	 * @return Person  
	 * @throws 
	 * @param name
	 * @param address
	 * @param age
	 * @return
	 */
	/*
	 * @RequestMapping("/save") public Person save(String name,String
	 * address,Integer age) { Person p = personRepository.save(new
	 * Person(null,name,age,address)); return p; }
	 */
	
	/**
	 * 测试findByAddress
	 * @Title: q1
	 * @Description: TODO
	 * @param @param address
	 * @param @return  
	 * @return List<Person>  
	 * @throws 
	 * @param address
	 * @return
	 */
	/*
	 * @RequestMapping("/q1") public List<Person> q1(String address){ List<Person>
	 * person = personRepository.findByAddress(address); return person; }
	 */
	/**
	 * 测试findByNameAndAddress
	 * @Title: q2
	 * @Description: TODO
	 * @param @param name
	 * @param @param address
	 * @param @return  
	 * @return Person  
	 * @throws 
	 * @param name
	 * @param address
	 * @return
	 */
	/*
	 * @RequestMapping("/q2") public Person q2(String name,String address) { Person
	 * p = personRepository.findByNameAndAddress(name, address); return p; }
	 */
	
	/**
	 * 测试withNameAndAddressQuery
	 * @Title: q3
	 * @Description: TODO
	 * @param @param name
	 * @param @param address
	 * @param @return  
	 * @return Person  
	 * @throws 
	 * @param name
	 * @param address
	 * @return
	 */
	/*
	 * @RequestMapping("/q3") public Person q3(String name,String address) { Person
	 * p = personRepository.withNameAndAddressQuery(name, address); return p; }
	 */
	
	/**
	 * 测试withNameAndAddressNamedQuery
	 * @Title: q4
	 * @Description: TODO
	 * @param @param name
	 * @param @param address
	 * @param @return  
	 * @return Person  
	 * @throws 
	 * @param name
	 * @param address
	 * @return
	 */
	/*
	 * @RequestMapping("/q4") public Person q4(String name,String address) {
	 * List<Person> person = personRepository.withNameAndAddressNamedQuery(name,
	 * address); if(person != null && person.size()>0) { return person.get(0); }
	 * return null; }
	 */
	/**
	 * 测试排序
	 * @Title: sort
	 * @Description: TODO
	 * @param @return  
	 * @return List<Person>  
	 * @throws 
	 * @return
	 */
	/*
	 * @RequestMapping("/sort") public List<Person> sort(){ List<Person> people =
	 * personRepository.findAll(new Sort(Direction.ASC,"age")); return people; }
	 */
	/**
	 * 测试分页
	 * @Title: page
	 * @Description: TODO
	 * @param @return  
	 * @return Page<Person>  
	 * @throws 
	 * @return
	 */
	/*
	 * @RequestMapping("/page") public Page<Person> page(){ Page<Person> pagePeople
	 * = personRepository.findAll(new PageRequest(1,2)); return pagePeople; }
	 */
	
	@RequestMapping("/auto")
	public Page<Person> auto(Person person){
		Page<Person> pagePeople = personRepository.findByAuto(person, new PageRequest(0,10));
		return pagePeople;
	}
	
}
