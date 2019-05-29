/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss;

import Client.SimpleService_P1_Client;

/**
 *
 * @author ALE
 */
    public class SoapAsyncRequest extends Thread {
	
    private String toModifyTile;
    private String modifiedTitle;

	public SoapAsyncRequest (String toModifyTile) {
		this.toModifyTile = toModifyTile;
		this.modifiedTitle = "";
	}
	
	public String getModifiedTitle() {
		return this.modifiedTitle;
	}
	
	public void run() {
		SimpleService_P1_Client soapClient = new SimpleService_P1_Client();
		this.modifiedTitle = soapClient.modifyDrupalTitle(toModifyTile);
	}
}
