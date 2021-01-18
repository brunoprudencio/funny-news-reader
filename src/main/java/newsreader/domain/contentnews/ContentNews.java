package newsreader.domain.contentnews;

import java.time.LocalDate;
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
	private ContentCategory contentCategory;
	private ContentProvider contentProvider;
	private LocalDate publishedYear;
	private String contentTitle;

}

