package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@Path("/")
public class Resource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/criminal-identity/suspect")
    public Integer suspect() {
        return 93634870 + new Random().nextInt(10);
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/criminal-identity/suspect")
    public Integer pso() {
        return suspect();
    }

    @GET
    @Path("/criminal-identity/accomplices")
    @Produces("image/jpg")
    public byte[] photo() throws IOException {
        URL url = new URL("https://thispersondoesnotexist.com/image");
        final URLConnection connection = url.openConnection();
        try (InputStream input = connection.getInputStream();
             ByteArrayOutputStream output = new ByteArrayOutputStream()) {
            final byte[] buffer = new byte[8192];
            for (int count; (count = input.read(buffer)) > 0;) {
                output.write(buffer, 0, count);
            }
            return output.toByteArray();
        }
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/labResults/element")
    public Integer labResults() {
        return 37894 + new Random().nextInt(10);
    }
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/labResults/element")
    public Integer plabResults() {
        return 37894 + new Random().nextInt(10);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/labResults/researcher")
    public String labResultsDescription() {
        String[] names = new String[]{"María Carmen", "María", "Carmen", "Josefa", "Ana María", "Isabel",
                "Pilar", "Dolores", "Teresa", "Laura", "Cristina", "Antonia"};
        String[] lastnames = new String[]{"Wang", "Li", "García", "Smith", "Yang", "Fernández", "Díaz", "Arias"};
        final var name = names[new Random().nextInt(names.length - 1)];
        final var lastname = lastnames[new Random().nextInt(lastnames.length - 1)];
        return name + " " + lastname;
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/labResults/researcher")
    public String plabResultsDescription() {
        String[] names = new String[]{"María Carmen", "María", "Carmen", "Josefa", "Ana María", "Isabel",
                "Pilar", "Dolores", "Teresa", "Laura", "Cristina", "Antonia"};
        String[] lastnames = new String[]{"Wang", "Li", "García", "Smith", "Yang", "Fernández", "Díaz", "Arias"};
        final var name = names[new Random().nextInt(names.length - 1)];
        final var lastname = lastnames[new Random().nextInt(lastnames.length - 1)];
        return name + " " + lastname;
    }

}
