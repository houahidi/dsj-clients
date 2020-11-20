package fr.orsys.client.service.exceptions;

public class ServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super("erreur : pb serveur");
	}

	public ServiceException(String message) {
		super(message);
	}
	
	

}
