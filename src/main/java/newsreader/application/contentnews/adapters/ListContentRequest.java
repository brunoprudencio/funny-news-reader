package newsreader.application.contentnews.adapters;

import lombok.Getter;

import newsreader.application.contentnews.adapters.utils.SortType;
import newsreader.domain.contentnews.ContentCategory;

@Getter
public class ListContentRequest {

	private ContentCategory category;
	private SortType sortType;
}
