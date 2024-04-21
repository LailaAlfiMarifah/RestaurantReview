package data.response;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("restaurant")
	private Restaurant restaurant;

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;

	public Restaurant getRestaurant(){

		return restaurant;
	}

	public boolean isError(){

		return error;
	}

	public String getMessage(){

		return message;
	}

	public boolean isSuccessful() {
		return false;
	}

	public Response body() {
		return null;
	}
}