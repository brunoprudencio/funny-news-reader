package newsreader.core.domain.newscontent;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
public class ContentNews {

	@Id
	private UUID id;
	private String author;
	private String content;
	private String contentTitle;
	private String publishedYear;
	private ContentCategory contentCategory;
	private ContentProvider contentProvider;

}
