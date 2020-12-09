package com.oms.bean;

import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(value = CompactDisc.class, name = "cd"), @Type(value = DigitalVideoDisc.class, name = "dvd"), @Type(value = Book.class, name = "book")})
public class PhysicalMedia extends Media{
	private String barcode;
	private String description;
	private int quantity;
	private float weight;
	private Dimension dimension;
	private String publisher;
	private Date publicationDate;
	private ArrayList<String> authors;
	private int numberOfPages;
	private String language;
	
	public PhysicalMedia() {
	}
	
	public PhysicalMedia(String id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	
	public PhysicalMedia(String id, String title, String category, float cost, String barcode, String description, int quantity, float weight, Dimension dimension,
			String publisher) {
		super(id, title, category, cost);
		
		this.barcode = barcode;
		this.description = description;
		this.quantity = quantity;
		this.weight = weight;
		this.dimension = dimension;
		this.publisher = publisher;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Date getPublicationDate() {
		return publicationDate;
	}
	
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	public ArrayList<String> getAuthors() {
		return authors;
	}
	
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", barcode: " + barcode + ", description: " + description + ", quantity: " + quantity + ", weight: " + weight + ", dimension: " + dimension;
	}
	
	@Override
	public boolean match(Media media) {
		if (media == null)
			return true;
		
		
		boolean res = super.match(media);
		if (!res) {
			return false;
		}
		
		
		if (!(media instanceof PhysicalMedia))
			return false;
		PhysicalMedia pMedia = (PhysicalMedia) media;
		
		
		
		if (pMedia.barcode != null && !pMedia.barcode.equals("") && !this.barcode.contains(pMedia.barcode)) {
			return false;
		}
		if (pMedia.description != null && !pMedia.description.equals("") && !this.description.contains(pMedia.description)) {
			return false;
		}
		if (pMedia.quantity != 0 && this.quantity != pMedia.quantity) {
			return false;
		}
		if (pMedia.weight != 0 && this.weight != pMedia.weight) {
			return false;
		}
		return true;
	}
}