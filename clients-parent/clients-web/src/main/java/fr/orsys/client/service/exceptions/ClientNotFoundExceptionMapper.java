package fr.orsys.client.service.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ClientNotFoundExceptionMapper implements ExceptionMapper<ClientNotFoundException> {

	@Override
	public Response toResponse(ClientNotFoundException e) {
		// TODO Auto-generated method stub
		return Response.status(Response.Status.NOT_FOUND).entity(e.getMessage()).build();
	}

}
