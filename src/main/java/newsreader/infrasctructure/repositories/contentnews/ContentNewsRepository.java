package newsreader.infrasctructure.repositories.contentnews;

import java.util.List;
import java.util.Optional;

import newsreader.domain.contentnews.ContentCategory;
import newsreader.domain.contentnews.ContentNews;

public interface ContentNewsRepository {

	Optional<List<ContentNews>> findByCategory(ContentCategory category);

	void save(ContentNews content);
}
