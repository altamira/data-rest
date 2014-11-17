package br.com.altamira.data.rest.serialize;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 *
 * @author alessandro.holanda
 */
@Provider
@Produces(MediaType.APPLICATION_JSON)
public class JacksonConfig implements ContextResolver<ObjectMapper>
{
    private final ObjectMapper objectMapper;

    /**
     *
     */
    public JacksonConfig()
    {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Hibernate4Module());
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true);
        objectMapper.getSerializerProvider().setNullValueSerializer(new NullValueSerializer());
    }

    /**
     *
     * @param objectType
     * @return
     */
    @Override
    public ObjectMapper getContext(Class<?> objectType)
    {
        return objectMapper;
    }
}