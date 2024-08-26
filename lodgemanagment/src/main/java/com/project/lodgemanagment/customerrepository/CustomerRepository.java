package com.project.lodgemanagment.customerrepository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.project.lodgemanagment.customerentity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
