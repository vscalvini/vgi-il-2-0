package it.vwgroup.il.soap.web.services.wscrm.savexml;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.HttpEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.xml.sax.SAXException;

import it.vwgroup.il.wscrm.SaveXmlRequest;
import it.vwgroup.il.wscrm.SaveXmlResponse;


@Endpoint
public class SaveXmlEndpoint {

	  @PayloadRoot(namespace = "http://il.vwgroup.it/wscrm", localPart = "SaveXmlRequest")
	  @ResponsePayload
	  public SaveXmlResponse processCourseDetailsRequest(@RequestPayload SaveXmlRequest request) {
	    SaveXmlResponse response = new SaveXmlResponse();

	    /*** gestione request e response da implementare **************************/

	    SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
	    try {
	        Schema schema = schemaFactory.newSchema(new File("src/main/resources/xsd/MainSchema.xsd"));
	        StreamSource source = new StreamSource(new StringReader(request.getXmlData()));

	        Validator validator = schema.newValidator();
	        validator.validate(source);

	        JSONObject xmlJSONObj = XML.toJSONObject(request.getXmlData());
            String jsonPrettyPrintString = xmlJSONObj.toString(4);

            RestTemplate restTemplate = new RestTemplate();
            String resourceUrl = "http://192.168.1.102:8899/sendLead";
            MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
            headers.add("Authorization", "Bearer 7bba003e-1947-42c8-b0fd-199dad4bd277");

            HttpEntity<String> httpRequest = new HttpEntity<>(jsonPrettyPrintString, headers);
            restTemplate.postForObject(resourceUrl, httpRequest, Boolean.class);

            response.setSaveXmlResult(jsonPrettyPrintString);
	    } catch (SAXException | IOException e) {
	        e.printStackTrace();
	        response.setSaveXmlResult("KO: " + e.getMessage());
	    } catch (JSONException e) {
			e.printStackTrace();
			response.setSaveXmlResult("KO: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			response.setSaveXmlResult("KO: " + e.getMessage());
		}

	    return response;
	  }
}
