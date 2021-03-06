package com.zdvdev.steamgamesstats.datamodel.model;

import java.io.Serializable;

public class BasicGame implements Serializable {
	private String logo;

	private String name;

	private long appID;

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAppID() {
		return appID;
	}

	public void setAppID(long appID) {
		this.appID = appID;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BasicGame)) return false;

		BasicGame basicGame = (BasicGame) o;

		return appID == basicGame.appID;

	}

	@Override
	public int hashCode() {
		//extracted from Long class
		return (int) (appID ^ (appID >>> 32));
	}

	public int compareTo(Game rhs) {
		return appID < rhs.getAppID() ? -1 : (appID == rhs.getAppID() ? 0 : 1);
	}
}