package com.philanthropy.projectInfo.ImageInfo;

import com.philanthropy.interfaces.Manager;

public class ImageManager  implements Manager<Image>{

	protected ImageDao imageDao;
	
	public ImageManager(){
		this.imageDao = new ImageDao();
		//this.donationDoa = new DonationsDao();
	}
	
	@Override
	public int additem(Image item) {
		int result = imageDao.add(item);
		if(result == 0){
			System.out.println("Error: adding donor from database.");
		}
		//should I remove 
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public int removeitem(int imageID) {
		int result = imageDao.delete(imageID);
		//make this a add exception
		if(result == 0){
			System.out.println("Error: Removing project to database");
		}
		return result;
		
	}
	@Override
	public String displayAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayOne(int itemID) {
		// TODO Auto-generated method stub
		return null;
	}

}
