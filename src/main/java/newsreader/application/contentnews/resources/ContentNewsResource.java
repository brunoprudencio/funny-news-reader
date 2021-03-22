package newsreader.application.contentnews.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import newsreader.application.contentnews.adapters.ListContentByCategoryAdapter;
import newsreader.application.contentnews.adapters.ListContentRequest;
import newsreader.domain.contentnews.ContentNews;

@RestController
@RequestMapping("/contents")
public class ContentNewsResource {

	private ListContentByCategoryAdapter listcontent;

	public ContentNewsResource(ListContentByCategoryAdapter listcontent) {
		this.listcontent = listcontent;
	}

	@GetMapping("/list")
	public List<ContentNews> getContentByCategory(@RequestBody ListContentRequest request) {
		return listcontent.execute( request );
	}
}
