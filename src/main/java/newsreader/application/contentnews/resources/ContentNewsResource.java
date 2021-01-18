package newsreader.application.contentnews.resources;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import newsreader.application.contentnews.adapters.ListContentByCategoryAdapter;
import newsreader.application.contentnews.adapters.utils.SortType;
import newsreader.domain.contentnews.ContentCategory;
import newsreader.domain.contentnews.ContentNews;

@RestController
@RequestMapping("/contents")
public class ContentNewsResource {

	private ListContentByCategoryAdapter listcontent;

	public ContentNewsResource(ListContentByCategoryAdapter listcontent) {
		this.listcontent = listcontent;
	}

	@GetMapping("listby/{category}/{sortType}")
	public List<ContentNews> getContentByCategory(
			@PathParam("category") ContentCategory category,
			@PathParam("sortType") SortType sortType) {

		return listcontent.execute( category, sortType );
	}
}
