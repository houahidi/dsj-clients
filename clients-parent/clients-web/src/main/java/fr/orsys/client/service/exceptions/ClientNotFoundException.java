package fr.orsys.client.service.exceptions;

public class ClientNotFoundException extends ServiceException {
	
	private static final long serialVersionUID = 3L;

	public ClientNotFoundException() {
		super("le client n'existe pas");
	}

	public ClientNotFoundException(String message) {
		super(message + "rrr");
	}
	
	

}
