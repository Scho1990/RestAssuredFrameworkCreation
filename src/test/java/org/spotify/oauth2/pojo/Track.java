
package org.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Track {

    @JsonProperty("album")
    private Album album;
    @JsonProperty("artists")
    private List<Artist__1> artists;
    @JsonProperty("available_markets")
    private List<String> availableMarkets;
    @JsonProperty("disc_number")
    private Integer discNumber;
    @JsonProperty("duration_ms")
    private Integer durationMs;
    @JsonProperty("explicit")
    private Boolean explicit;
    @JsonProperty("external_ids")
    private ExternalIds externalIds;
    @JsonProperty("external_urls")
    private ExternalUrls__6 externalUrls;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("popularity")
    private Integer popularity;
    @JsonProperty("preview_url")
    private Object previewUrl;
    @JsonProperty("track_number")
    private Integer trackNumber;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("is_local")
    private Boolean isLocal;
    @JsonProperty("episode")
    private Boolean episode;
    @JsonProperty("track")
    private Boolean track;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Track() {
    }

    /**
     * 
     * @param previewUrl
     * @param trackNumber
     * @param album
     * @param externalIds
     * @param episode
     * @param externalUrls
     * @param type
     * @param uri
     * @param isLocal
     * @param explicit
     * @param discNumber
     * @param artists
     * @param availableMarkets
     * @param popularity
     * @param name
     * @param href
     * @param id
     * @param track
     * @param durationMs
     */
    public Track(Album album, List<Artist__1> artists, List<String> availableMarkets, Integer discNumber, Integer durationMs, Boolean explicit, ExternalIds externalIds, ExternalUrls__6 externalUrls, String href, String id, String name, Integer popularity, Object previewUrl, Integer trackNumber, String type, String uri, Boolean isLocal, Boolean episode, Boolean track) {
        super();
        this.album = album;
        this.artists = artists;
        this.availableMarkets = availableMarkets;
        this.discNumber = discNumber;
        this.durationMs = durationMs;
        this.explicit = explicit;
        this.externalIds = externalIds;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.name = name;
        this.popularity = popularity;
        this.previewUrl = previewUrl;
        this.trackNumber = trackNumber;
        this.type = type;
        this.uri = uri;
        this.isLocal = isLocal;
        this.episode = episode;
        this.track = track;
    }

    @JsonProperty("album")
    public Album getAlbum() {
        return album;
    }

    @JsonProperty("album")
    public void setAlbum(Album album) {
        this.album = album;
    }

    @JsonProperty("artists")
    public List<Artist__1> getArtists() {
        return artists;
    }

    @JsonProperty("artists")
    public void setArtists(List<Artist__1> artists) {
        this.artists = artists;
    }

    @JsonProperty("available_markets")
    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    @JsonProperty("available_markets")
    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    @JsonProperty("disc_number")
    public Integer getDiscNumber() {
        return discNumber;
    }

    @JsonProperty("disc_number")
    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    @JsonProperty("duration_ms")
    public Integer getDurationMs() {
        return durationMs;
    }

    @JsonProperty("duration_ms")
    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    @JsonProperty("explicit")
    public Boolean getExplicit() {
        return explicit;
    }

    @JsonProperty("explicit")
    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    @JsonProperty("external_ids")
    public ExternalIds getExternalIds() {
        return externalIds;
    }

    @JsonProperty("external_ids")
    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    @JsonProperty("external_urls")
    public ExternalUrls__6 getExternalUrls() {
        return externalUrls;
    }

    @JsonProperty("external_urls")
    public void setExternalUrls(ExternalUrls__6 externalUrls) {
        this.externalUrls = externalUrls;
    }

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("popularity")
    public Integer getPopularity() {
        return popularity;
    }

    @JsonProperty("popularity")
    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    @JsonProperty("preview_url")
    public Object getPreviewUrl() {
        return previewUrl;
    }

    @JsonProperty("preview_url")
    public void setPreviewUrl(Object previewUrl) {
        this.previewUrl = previewUrl;
    }

    @JsonProperty("track_number")
    public Integer getTrackNumber() {
        return trackNumber;
    }

    @JsonProperty("track_number")
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @JsonProperty("uri")
    public void setUri(String uri) {
        this.uri = uri;
    }

    @JsonProperty("is_local")
    public Boolean getIsLocal() {
        return isLocal;
    }

    @JsonProperty("is_local")
    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    @JsonProperty("episode")
    public Boolean getEpisode() {
        return episode;
    }

    @JsonProperty("episode")
    public void setEpisode(Boolean episode) {
        this.episode = episode;
    }

    @JsonProperty("track")
    public Boolean getTrack() {
        return track;
    }

    @JsonProperty("track")
    public void setTrack(Boolean track) {
        this.track = track;
    }

}
