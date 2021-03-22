package newsreader.application.contentnews.adapters;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import newsreader.application.contentnews.adapters.utils.SortType;
import newsreader.domain.contentnews.ContentNews;
import newsreader.domain.contentnews.ports.ListContentByCategoryPort;
import newsreader.infrastructure.persistence.contentnews.ContentNewsRepositoryMongoDB;

@Service
public class ListContentByCategoryAdapter implements ListContentByCategoryPort {

	private ContentNewsRepositoryMongoDB repository;

	public ListContentByCategoryAdapter(ContentNewsRepositoryMongoDB repository) {
		this.repository = repository;
	}

	@Override
	public List<ContentNews> execute(ListContentRequest request) {
		if (request.getSortType().equals( SortType.DESC ))
			return repository.findByCategory( request.getCategory() )
					.stream()
					.sorted( Comparator.comparing( ContentNews::getPublishedYear )
							.reversed() )
					.collect( Collectors.toList() );

		return repository.findByCategory( request.getCategory() )
				.stream()
				.sorted( Comparator.comparing( ContentNews::getPublishedYear ) )
				.collect( Collectors.toList() );

	}

}
