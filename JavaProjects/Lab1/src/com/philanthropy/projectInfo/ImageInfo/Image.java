package com.philanthropy.projectInfo.ImageInfo;

public class Image {
	private String path;
	private int imageID;
	private int projectID;
	
	public Image(int imageID,  int projectID ,  String path){
		this.path = path;
		this.projectID = projectID;
		this.imageID = imageID;
	}
	
	/**
	 * @return the projectID
	 */
	public int getProjectID() {
		return projectID;
	}

	/**
	 * @return the imageID
	 */
	public int getImageID() {
		return imageID;
	}

	/**
	 * @param imageID the imageID to set
	 */
	public void setImageID(int imageID) {
		this.imageID = imageID;
	}

	/**
	 * @param projectID the projectID to set
	 */
	public void setProjectID(int projectID) {
		this.projectID = projectID;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	

}
