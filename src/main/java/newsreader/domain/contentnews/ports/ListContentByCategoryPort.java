package newsreader.domain.contentnews.ports;

import java.util.List;

import newsreader.application.contentnews.adapters.ListContentRequest;
import newsreader.domain.contentnews.ContentNews;

public interface ListContentByCategoryPort {

	List<ContentNews> execute(ListContentRequest request);
}
