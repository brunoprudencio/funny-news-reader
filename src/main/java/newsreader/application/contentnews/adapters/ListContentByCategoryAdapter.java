package newsreader.application.contentnews.adapters;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import newsreader.application.contentnews.adapters.utils.SortType;
import newsreader.domain.contentnews.ContentCategory;
import newsreader.domain.contentnews.ContentNews;
import newsreader.domain.contentnews.ports.ListContentByCategoryPort;
import newsreader.infrastructure.persistence.contentnews.ContentNewsRepositoryMongoDB;

public class ListContentByCategoryAdapter implements ListContentByCategoryPort {

	private ContentNewsRepositoryMongoDB repository;

	public ListContentByCategoryAdapter(ContentNewsRepositoryMongoDB repository) {
		this.repository = repository;
	}

	@Override
	public List<ContentNews> execute(ContentCategory category, SortType sortType) {
		if (sortType.equals( SortType.DESC ))
			return repository.findByCategory( category )
					.stream()
					.sorted( Comparator.comparing( ContentNews::getPublishedYear )
							.reversed() )
					.collect( Collectors.toList() );

		return repository.findByCategory( category )
				.stream()
				.sorted( Comparator.comparing( ContentNews::getPublishedYear ) )
				.collect( Collectors.toList() );

	}

}
