
package acme.features.authenticated.duty;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.duties.Duty;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedDutyRepository extends AbstractRepository {

	@Query("select j from Duty j where j.id = ?1")
	Duty findDutyById(int id);

	@Query("select j.descriptor.duties from Job j where j.id = ?1")
	Collection<Duty> findDutiesByJob(int id);

}
