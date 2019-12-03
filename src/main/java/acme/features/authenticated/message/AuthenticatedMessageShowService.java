
package acme.features.authenticated.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedMessageShowService implements AbstractShowService<Authenticated, acme.entities.messages.Message> {

	//		Internal states ------------------

	@Autowired
	private AuthenticatedMessageRepository repository;


	// AbstractShowService<Authenticated, Message> interface -----

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
	public acme.entities.messages.Message findOne(final Request<acme.entities.messages.Message> request) {
		assert request != null;

		acme.entities.messages.Message result = null;
		int id;

		id = request.getModel().getInteger("id");

		return result;
	}
}
