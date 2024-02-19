
package org.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Image {

    @JsonProperty("url")
    private String url;
    @JsonProperty("height")
    private Object height;
    @JsonProperty("width")
    private Object width;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param width
     * @param url
     * @param height
     */
    public Image(String url, Object height, Object width) {
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
    public Object getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Object height) {
        this.height = height;
    }

    @JsonProperty("width")
    public Object getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Object width) {
        this.width = width;
    }

}
