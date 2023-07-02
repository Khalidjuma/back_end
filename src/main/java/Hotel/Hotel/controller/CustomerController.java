package Hotel.Hotel.controller;

import Hotel.Hotel.model.Customer;
import Hotel.Hotel.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/customer")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping(value = "/list")
    public List<Customer> getcustomer() {
        return  customerRepository.findAll();
    }

    @PostMapping(value = "/save")

    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);

    }
//
//    @PutMapping(value = "update/{id}")
//    public String updatecustomer(@PathVariable Long id, @RequestBody customer customer) {
//        customer updatedcustomer = customerRepository.findById(id).get();
//        customerRepository.save(updatedcustomer);
//        return "upadated...";
    //}
    @DeleteMapping(value = "/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        Customer deletecustomer = customerRepository.findById(id).get();
        customerRepository.delete(deletecustomer);
        return "delete room id: " + id;
    }
}
