
package org.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Image__1 {

    @JsonProperty("url")
    private String url;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("width")
    private Integer width;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image__1() {
    }

    /**
     * 
     * @param width
     * @param url
     * @param height
     */
    public Image__1(String url, Integer height, Integer width) {
        super();
        this.url = url;
        this.height = height;
        this.width = width;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

}
