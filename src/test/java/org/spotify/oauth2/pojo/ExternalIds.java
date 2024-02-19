
package org.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalIds {

    @JsonProperty("isrc")
    private String isrc;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalIds() {
    }

    /**
     * 
     * @param isrc
     */
    public ExternalIds(String isrc) {
        super();
        this.isrc = isrc;
    }

    @JsonProperty("isrc")
    public String getIsrc() {
        return isrc;
    }

    @JsonProperty("isrc")
    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

}
