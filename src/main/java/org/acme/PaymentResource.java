package org.acme;

import org.acme.Api.PaymentApi;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("/payment")
public class PaymentResource {

    @Inject
    @RestClient
    PaymentApi sibsPaymentGatewayApi;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getResponse() {
        String param1 = "value1";
        String param2 = "value2";
        String authorizationHeader = "Bearer my-token";
        String jsonBody =
        return sibsPaymentGatewayApi.makePaymentForm(authorizationHeader, param1, param2);
    }

}
