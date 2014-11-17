package br.com.altamira.data.rest.serialize;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 *
 * @author alessandro.holanda
 */
public class NullCollectionSerializer extends JsonSerializer<Object> {

    /**
     *
     */
    public NullCollectionSerializer() {
		
	}
	
    /**
     *
     * @param value
     * @param jsonGenerator
     * @param provider
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
	public void serialize(Object value, JsonGenerator jsonGenerator,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
		if (value == null) {
			jsonGenerator.writeString("[]");
		} else {
			jsonGenerator.writeObject(value);
		}
		
	}
}
