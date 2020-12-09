package media;

import javax.swing.JLabel;

import com.oms.bean.Media;
import com.oms.bean.PhysicalMedia;

@SuppressWarnings("serial")
public class PhysicalMediaSinglePane extends MediaSinglePane{
	private JLabel labelBarcode;
	private JLabel labelDescription;
	private JLabel labelQuantity;
	private JLabel labelWeight;
	private JLabel labelDimension;
	private JLabel labelPublisher;
	private JLabel labelPublicationDate;
	private JLabel labelAuthors;
	private JLabel labelNumberOfPages;
	private JLabel labelLanguage;
	
	public PhysicalMediaSinglePane() {
		super();
	}
	
	public PhysicalMediaSinglePane(Media media) {
		this();
		this.t = media;
		
		displayData();
	}
	
	@Override
	public void buildControls() {
		super.buildControls();

		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelBarcode = new JLabel();
		add(labelBarcode, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelDescription = new JLabel();
		add(labelDescription, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelQuantity = new JLabel();
		add(labelQuantity, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelWeight = new JLabel();
		add(labelWeight, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelDimension = new JLabel();
		add(labelDimension, c);
//=====================================================
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublisher = new JLabel();
		add(labelPublisher, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelPublicationDate = new JLabel();
		add(labelPublicationDate, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelAuthors = new JLabel();
		add(labelAuthors, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNumberOfPages = new JLabel();
		add(labelNumberOfPages, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelLanguage = new JLabel();
		add(labelLanguage, c);
	}
	
	@Override
	public void displayData() {
		super.displayData();
		
		if (t instanceof PhysicalMedia) {
			PhysicalMedia pMedia = (PhysicalMedia) t;
			
			labelBarcode.setText("Barcode: " + pMedia.getBarcode());
			labelDescription.setText("Description: " + pMedia.getDescription());
			labelQuantity.setText("Quantity: " + pMedia.getQuantity());
			labelWeight.setText("Weight: " + pMedia.getWeight());
			labelDimension.setText("Dimension: " + pMedia.getDimension());
			labelPublisher.setText("Publisher: " + pMedia.getPublisher());
			labelPublicationDate.setText("Publication Date: " + pMedia.getPublicationDate());
			labelAuthors.setText("Authors: " + pMedia.getAuthors());
			labelNumberOfPages.setText("Number Of Pages: " + pMedia.getNumberOfPages());
			labelLanguage.setText("Language: " + pMedia.getLanguage());
		}
	}
}
