package newsreader.domain.contentnews.ports;

import java.util.List;

import newsreader.application.contentnews.adapters.utils.SortType;
import newsreader.domain.contentnews.ContentCategory;
import newsreader.domain.contentnews.ContentNews;

public interface ListContentByCategoryPort {

	List<ContentNews> execute(ContentCategory category, SortType sortType);
}
