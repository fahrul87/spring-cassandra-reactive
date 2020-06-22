package com.fahrul.springcassandrareactive.repository;


import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

import com.fahrul.springcassandrareactive.model.User;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveCassandraRepository<User, Integer> {
	
	@AllowFiltering
	Flux<User> findByAgeLessThan(int age);
	
	
	@AllowFiltering
	Mono<User> findByAddress(String address);

}
