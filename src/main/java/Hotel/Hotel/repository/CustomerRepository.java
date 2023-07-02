package Hotel.Hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Hotel.Hotel.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
