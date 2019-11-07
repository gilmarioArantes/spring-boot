package br.com.gilmarioarantes.springbootmongocrudoperations.dao;

import br.com.gilmarioarantes.springbootmongocrudoperations.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends MongoRepository<Employee,Integer> {

}
