package newsreader.infrastructure.persistence.contentnews;

import java.util.Set;

import newsreader.domain.contentnews.ContentCategory;
import newsreader.domain.contentnews.ContentNews;
import newsreader.infrastructure.persistenceports.contentnews.ContentNewsRepository;

public class ContentNewsRepositoryMongoDB implements ContentNewsRepository {
	@Override public Set<ContentNews> findByCategory(ContentCategory category) {
		return null;
	}

	@Override public void save(ContentNews content) {

	}
}
