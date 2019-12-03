
package acme.features.authenticated.thread;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedThreadRepository extends AbstractRepository {

	@Query("select t from Thread t where t.id = ?1")
	acme.entities.threads.Thread findThreadById(int id);

	/*
	 * @Query("select t.users from Thread t ")
	 * Collection<Authenticated> findAllUsersWithTopics();
	 */

	@Query("select t from Thread t")
	Collection<acme.entities.threads.Thread> findAllThread();

}
