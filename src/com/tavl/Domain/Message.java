package com.tavl.Domain;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// use this 'http://www.jsonschema2pojo.org/' to generate this model.
public class Message {
	
	@Generated("org.jsonschema2pojo")
	@SerializedName("objectId")
	@Expose
	private Integer objectId;
	@SerializedName("comment")
	@Expose
	private String comment;
	@SerializedName("imageCode")
	@Expose
	private Object imageCode;
	@SerializedName("clientName")
	@Expose
	private String clientName;
	@SerializedName("groupName")
	@Expose
	private String groupName;
	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("unitId")
	@Expose
	private Integer unitId;
	@SerializedName("gpsTime")
	@Expose
	private String gpsTime;
	@SerializedName("latitude")
	@Expose
	private Double latitude;
	@SerializedName("longitude")
	@Expose
	private Double longitude;
	@SerializedName("landMark")
	@Expose
	private String landMark;
	@SerializedName("angle")
	@Expose
	private Integer angle;
	@SerializedName("speed")
	@Expose
	private Integer speed;
	@SerializedName("altitude")
	@Expose
	private Integer altitude;
	@SerializedName("satellites")
	@Expose
	private Integer satellites;
	@SerializedName("number")
	@Expose
	private String number;
	@SerializedName("messageData")
	@Expose
	private List<MessageData> messageData = new ArrayList<MessageData>();

	/**
	 * 
	 * @return The objectId
	 */
	public Integer getObjectId() {
		return objectId;
	}

	/**
	 * 
	 * @param objectId
	 *            The objectId
	 */
	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	/**
	 * 
	 * @return The comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 
	 * @param comment
	 *            The comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * 
	 * @return The imageCode
	 */
	public Object getImageCode() {
		return imageCode;
	}

	/**
	 * 
	 * @param imageCode
	 *            The imageCode
	 */
	public void setImageCode(Object imageCode) {
		this.imageCode = imageCode;
	}

	/**
	 * 
	 * @return The clientName
	 */
	public String getClientName() {
		return clientName;
	}

	/**
	 * 
	 * @param clientName
	 *            The clientName
	 */
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	/**
	 * 
	 * @return The groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * 
	 * @param groupName
	 *            The groupName
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * 
	 * @return The id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The unitId
	 */
	public Integer getUnitId() {
		return unitId;
	}

	/**
	 * 
	 * @param unitId
	 *            The unitId
	 */
	public void setUnitId(Integer unitId) {
		this.unitId = unitId;
	}

	/**
	 * 
	 * @return The gpsTime
	 */
	public String getGpsTime() {
		return gpsTime;
	}

	/**
	 * 
	 * @param gpsTime
	 *            The gpsTime
	 */
	public void setGpsTime(String gpsTime) {
		this.gpsTime = gpsTime;
	}

	/**
	 * 
	 * @return The latitude
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * 
	 * @param latitude
	 *            The latitude
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * 
	 * @return The longitude
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * 
	 * @param longitude
	 *            The longitude
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * 
	 * @return The landMark
	 */
	public String getLandMark() {
		return landMark;
	}

	/**
	 * 
	 * @param landMark
	 *            The landMark
	 */
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	/**
	 * 
	 * @return The angle
	 */
	public Integer getAngle() {
		return angle;
	}

	/**
	 * 
	 * @param angle
	 *            The angle
	 */
	public void setAngle(Integer angle) {
		this.angle = angle;
	}

	/**
	 * 
	 * @return The speed
	 */
	public Integer getSpeed() {
		return speed;
	}

	/**
	 * 
	 * @param speed
	 *            The speed
	 */
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	/**
	 * 
	 * @return The altitude
	 */
	public Integer getAltitude() {
		return altitude;
	}

	/**
	 * 
	 * @param altitude
	 *            The altitude
	 */
	public void setAltitude(Integer altitude) {
		this.altitude = altitude;
	}

	/**
	 * 
	 * @return The satellites
	 */
	public Integer getSatellites() {
		return satellites;
	}

	/**
	 * 
	 * @param satellites
	 *            The satellites
	 */
	public void setSatellites(Integer satellites) {
		this.satellites = satellites;
	}

	/**
	 * 
	 * @return The number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * 
	 * @param number
	 *            The number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * 
	 * @return The messageData
	 */
	public List<MessageData> getMessageData() {
		return messageData;
	}

	/**
	 * 
	 * @param messageData
	 *            The messageData
	 */
	public void setMessageData(List<MessageData> messageData) {
		this.messageData = messageData;
	}

}
