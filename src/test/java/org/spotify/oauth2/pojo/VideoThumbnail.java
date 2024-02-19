
package org.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoThumbnail {

    @JsonProperty("url")
    private Object url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public VideoThumbnail() {
    }

    /**
     * 
     * @param url
     */
    public VideoThumbnail(Object url) {
        super();
        this.url = url;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

}
