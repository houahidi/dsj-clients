package fr.orsys.client.service.exceptions;

public class ClientExisteDejaException extends ServiceException {
	
	private static final long serialVersionUID = 2L;

	public ClientExisteDejaException() {
		super("le client existe déjà");
	}

	public ClientExisteDejaException(String message) {
		super(message);
	}
	
	

}
