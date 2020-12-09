package media;

import com.oms.bean.Book;
import com.oms.bean.Media;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;
import abstractdata.IDataManageController;
import editdialog.BookEditDialog;


public abstract class AdminMediaPageController extends ADataPageController<Media> {
	
	
	public AdminMediaPageController() {
		super();
	}
	

	
	@Override
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}
	
	public void editBook (Book book) {
		new BookEditDialog(book, new BookDataController());
	}
}
