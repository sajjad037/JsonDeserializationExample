package com.tavl.Domain;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MessageData {

	@Generated("org.jsonschema2pojo")
	@SerializedName("messageId")
	@Expose
	private Integer messageId;
	@SerializedName("dataSourceId")
	@Expose
	private Integer dataSourceId;
	@SerializedName("value")
	@Expose
	private Double value;
	@SerializedName("dataSourceName")
	@Expose
	private String dataSourceName;

	/**
	 * 
	 * @return The messageId
	 */
	public Integer getMessageId() {
		return messageId;
	}

	/**
	 * 
	 * @param messageId
	 *            The messageId
	 */
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	/**
	 * 
	 * @return The dataSourceId
	 */
	public Integer getDataSourceId() {
		return dataSourceId;
	}

	/**
	 * 
	 * @param dataSourceId
	 *            The dataSourceId
	 */
	public void setDataSourceId(Integer dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	/**
	 * 
	 * @return The value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 *            The value
	 */
	public void setValue(Double value) {
		this.value = value;
	}

	/**
	 * 
	 * @return The dataSourceName
	 */
	public String getDataSourceName() {
		return dataSourceName;
	}

	/**
	 * 
	 * @param dataSourceName
	 *            The dataSourceName
	 */
	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}

}
