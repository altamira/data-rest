package br.com.altamira.data.rest.serialize;

import java.io.IOException;
//import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 *
 * @author alessandro.holanda
 */
public class DateSerializer extends JsonSerializer<Date> {

    /**
     *
     */
    public DateSerializer() {

	}

    /**
     *
     * @param date
     * @param jgen
     * @param provider
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
	public void serialize(Date date, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
		if (date == null) {
			jgen.writeString("");
		} else {
			//jgen.writeString(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(date));
			jgen.writeNumber(date.getTime());
		}
	}
}
