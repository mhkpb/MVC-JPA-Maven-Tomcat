/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa_bayan;

/**
 *
 * @author hasan
 */

 
import java.util.List;
 
import jpa_bayan.Person;

 
public interface PersonDAO {
 
    public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public void removePerson(int id);
}