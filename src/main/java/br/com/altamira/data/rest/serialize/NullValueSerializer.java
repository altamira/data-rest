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
public class NullValueSerializer extends JsonSerializer<Object> {

    /**
     *
     * @param nullKey
     * @param jsonGenerator
     * @param unused
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
	public void serialize(Object nullKey, JsonGenerator jsonGenerator,
			SerializerProvider unused) throws IOException,
			JsonProcessingException {
		jsonGenerator.writeString("");
	}

}
