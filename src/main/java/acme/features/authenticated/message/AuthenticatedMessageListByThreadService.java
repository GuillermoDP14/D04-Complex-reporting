
package acme.features.authenticated.message;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedMessageListByThreadService implements AbstractListService<Authenticated, acme.entities.messages.Message> {

	// Internal interface --------------------

	@Autowired
	AuthenticatedMessageRepository repository;


	// AbstractListService<Authenticated, acme.entities.messages.Message> interface ------

	@Override
	public boolean authorise(final Request<acme.entities.messages.Message> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<acme.entities.messages.Message> request, final acme.entities.messages.Message entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "body", "title", "moment");
	}

	@Override
	public Collection<acme.entities.messages.Message> findMany(final Request<acme.entities.messages.Message> request) {
		assert request != null;

		Collection<acme.entities.messages.Message> result = null;
		Integer jobId;

		jobId = request.getModel().getInteger("id");
		return result;
	}

}
