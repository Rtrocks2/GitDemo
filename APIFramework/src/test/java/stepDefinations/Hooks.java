package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException {
		stepDefinations m = new stepDefinations();
		if (stepDefinations.place_id == null) {
			m.add_place_payload_with("Rohan", "Marathi", "Goa");
			m.user_calls_with_http_request("addPlaceAPI", "POST");
			m.verify_place_Id_created_maps_to_using("Rohan", "getPlaceAPI");
		}
	}

}
