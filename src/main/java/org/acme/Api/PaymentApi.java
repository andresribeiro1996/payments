package org.acme.Api;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;

@Path("/payments")
@RegisterRestClient(configKey = "payments-api")
public interface PaymentApi {
    @POST
    String makePaymentForm(@HeaderParam("authorization") String authorization,
                           @QueryParam("param1") String param1,
                           @QueryParam("param2") String param2);

    @GET
    String checkPaymentStatus(@QueryParam("param1") String param1, @QueryParam("param2") String param2);
}
