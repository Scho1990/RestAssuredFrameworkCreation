
package org.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {

    @JsonProperty("added_at")
    private String addedAt;
    @JsonProperty("added_by")
    private AddedBy addedBy;
    @JsonProperty("is_local")
    private Boolean isLocal;
    @JsonProperty("track")
    private Track track;
    @JsonProperty("primary_color")
    private Object primaryColor;
    @JsonProperty("video_thumbnail")
    private VideoThumbnail videoThumbnail;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param videoThumbnail
     * @param addedAt
     * @param addedBy
     * @param primaryColor
     * @param track
     * @param isLocal
     */
    public Item(String addedAt, AddedBy addedBy, Boolean isLocal, Track track, Object primaryColor, VideoThumbnail videoThumbnail) {
        super();
        this.addedAt = addedAt;
        this.addedBy = addedBy;
        this.isLocal = isLocal;
        this.track = track;
        this.primaryColor = primaryColor;
        this.videoThumbnail = videoThumbnail;
    }

    @JsonProperty("added_at")
    public String getAddedAt() {
        return addedAt;
    }

    @JsonProperty("added_at")
    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }

    @JsonProperty("added_by")
    public AddedBy getAddedBy() {
        return addedBy;
    }

    @JsonProperty("added_by")
    public void setAddedBy(AddedBy addedBy) {
        this.addedBy = addedBy;
    }

    @JsonProperty("is_local")
    public Boolean getIsLocal() {
        return isLocal;
    }

    @JsonProperty("is_local")
    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    @JsonProperty("track")
    public Track getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(Track track) {
        this.track = track;
    }

    @JsonProperty("primary_color")
    public Object getPrimaryColor() {
        return primaryColor;
    }

    @JsonProperty("primary_color")
    public void setPrimaryColor(Object primaryColor) {
        this.primaryColor = primaryColor;
    }

    @JsonProperty("video_thumbnail")
    public VideoThumbnail getVideoThumbnail() {
        return videoThumbnail;
    }

    @JsonProperty("video_thumbnail")
    public void setVideoThumbnail(VideoThumbnail videoThumbnail) {
        this.videoThumbnail = videoThumbnail;
    }

}
