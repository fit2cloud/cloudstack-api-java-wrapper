package com.fit2cloud.cloudstack.wsclient.model.response.ssh;

import com.fit2cloud.cloudstack.wsclient.model.response.Response;

public class DeleteSSHKeyPairResponse extends Response {
	private String displaytext;
	public String getDisplaytext() {
		return displaytext;
	}
	public void setDisplaytext(String displaytext) {
		this.displaytext = displaytext;
	}
	private String success;
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

}
