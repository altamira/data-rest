package br.com.altamira.data.rest.serialize;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 *
 * @author alessandro.holanda
 */
public class NullCollectionDeserializer extends JsonDeserializer<Object> {

    /**
     *
     * @param jp
     * @param ctxt
     * @return
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
	public Object deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		
		if (jp.getText() == "") {
			return null;
		}
		
		Object value = null;
		
		super.deserialize(jp, ctxt, value);
		
		return value;
	}

}
