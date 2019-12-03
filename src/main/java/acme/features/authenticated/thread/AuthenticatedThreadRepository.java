
package acme.features.authenticated.thread;

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

	/*
	 * @Query("select t from Threads t where ?1 is member of t.users")
	 * Collection<acme.entities.threads.Thread> findAllThreadByUser(Authenticated authenticated);
	 */
}
