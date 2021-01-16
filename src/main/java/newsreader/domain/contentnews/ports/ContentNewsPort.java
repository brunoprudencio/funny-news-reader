package newsreader.domain.contentnews.ports;

import java.util.List;

import newsreader.domain.contentnews.ContentCategory;
import newsreader.domain.contentnews.ContentNews;

public interface ContentNewsPort {

	void saveContent();

	List<ContentNews> listContentByCategory(ContentCategory category);
}
