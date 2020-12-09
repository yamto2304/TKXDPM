package media;

import com.oms.bean.Book;
import com.oms.bean.Media;

import api.MediaApi;

public class BookDataController extends PhysicalDataController {
	
	@Override
	public void update(Media t) {
		// TODO Auto-generated method stub
		super.update(t);
		new MediaApi().updateBook((Book) t);
	}

}
