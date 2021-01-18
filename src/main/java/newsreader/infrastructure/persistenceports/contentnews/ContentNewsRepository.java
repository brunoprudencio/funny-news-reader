package newsreader.infrastructure.persistenceports.contentnews;

import java.util.Set;

import newsreader.domain.contentnews.ContentCategory;
import newsreader.domain.contentnews.ContentNews;

public interface ContentNewsRepository {

	Set<ContentNews> findByCategory(ContentCategory category);

	void save(ContentNews content);
}
