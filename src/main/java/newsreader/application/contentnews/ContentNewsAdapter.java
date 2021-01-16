package newsreader.application.contentnews;

import java.util.List;

import newsreader.domain.contentnews.ContentCategory;
import newsreader.domain.contentnews.ContentNews;
import newsreader.domain.contentnews.ports.ContentNewsPort;
import newsreader.infrasctructure.repositories.contentnews.ContentNewsRepository;

public class ContentNewsAdapter implements ContentNewsPort {

	private final ContentNewsRepository repository;

	public ContentNewsAdapter(ContentNewsRepository repository) {
		this.repository = repository;
	}

	@Override public void saveContent() {

	}

	@Override public List<ContentNews> listContentByCategory(ContentCategory category) {
		return null;
	}
}
