package newsreader.domain.contentnews.ports;

import newsreader.domain.contentnews.ContentNews;

public interface AddContentPort {

	void execute(ContentNews content);
}
