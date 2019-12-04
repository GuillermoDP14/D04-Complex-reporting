
package acme.features.employer.auditRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.auditorRecords.AuditRecord;
import acme.entities.roles.Employer;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.services.AbstractShowService;

@Service
public class EmployerAuditRecordShowService implements AbstractShowService<Employer, AuditRecord> {

	//		Internal states ------------------

	@Autowired
	private EmployerAuditRecordRepository repository;


	// AbstractShowService<Authenticated, Duty> interface -----

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

		request.unbind(entity, model, "title", "moment", "body");

	}

	@Override
	public AuditRecord findOne(final Request<AuditRecord> request) {
		assert request != null;

		AuditRecord result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findAuditRecordById(id);

		return result;
	}
}
