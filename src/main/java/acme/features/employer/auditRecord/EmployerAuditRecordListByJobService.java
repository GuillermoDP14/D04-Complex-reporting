
package acme.features.employer.auditRecord;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.auditRecords.AuditRecord;
import acme.entities.roles.Employer;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.services.AbstractListService;

@Service
public class EmployerAuditRecordListByJobService implements AbstractListService<Employer, AuditRecord> {

	// Internal interface --------------------

	@Autowired
	EmployerAuditRecordRepository repository;


	// AbstractListService<Authenticated, Duty> interface ------

	@Override
	public boolean authorise(final Request<AuditRecord> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<AuditRecord> request, final AuditRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "moment", "job.title");
	}

	@Override
	public Collection<AuditRecord> findMany(final Request<AuditRecord> request) {
		assert request != null;

		Collection<AuditRecord> result;
		result = this.repository.findAuditRecordByJob(request.getModel().getInteger("id"));

		return result;
	}

}
