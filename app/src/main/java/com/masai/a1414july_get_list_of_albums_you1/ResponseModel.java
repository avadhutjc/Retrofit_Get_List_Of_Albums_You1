package com.masai.a1414july_get_list_of_albums_you1;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseModel implements Serializable {

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	@SerializedName("userId")
	private int userId;

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public int getUserId(){
		return userId;
	}

	@Override
 	public String toString(){
		return 
			"ResponseModel{" + 
			"id = '" + id + '\'' + 
			",title = '" + title + '\'' + 
			",userId = '" + userId + '\'' + 
			"}";
		}
}