package v_satyamounika.myapplication.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by v-satya.chandu on 8/28/2017.
 */

public class TempList {

    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<MultipleResource> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<MultipleResource> getResults() {
        return results;
    }

    public void setResults(List<MultipleResource> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}