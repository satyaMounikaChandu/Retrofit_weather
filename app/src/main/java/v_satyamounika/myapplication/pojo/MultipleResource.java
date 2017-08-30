package v_satyamounika.myapplication.pojo;

import com.squareup.moshi.Json;

import java.util.List;

/**
 * Created by v-satya.chandu on 8/25/2017.
 */

public class MultipleResource {

    @Json(name = "page")
    private Integer page;
    @Json(name = "total_results")
    private Integer totalResults;
    @Json(name = "total_pages")
    private Integer totalPages;
    @Json(name = "results")
    private List<TempList> results = null;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public List<TempList> getResults() {
        return results;
    }

    public void setResults(List<TempList> results) {
        this.results = results;
    }

}


