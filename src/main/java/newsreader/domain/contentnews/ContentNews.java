package newsreader.domain.contentnews;

import java.util.UUID;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(access = AccessLevel.PROTECTED)
public class ContentNews {

	private UUID id;
	private String author;
	private String content;
	private String contentTitle;
	private String publishedYear;
	private ContentCategory contentCategory;
	private ContentProvider contentProvider;

}

