
package org.spotify.oauth2.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Album {

    @JsonProperty("album_type")
    private String albumType;
    @JsonProperty("total_tracks")
    private Integer totalTracks;
    @JsonProperty("available_markets")
    private List<String> availableMarkets;
    @JsonProperty("external_urls")
    private ExternalUrls__3 externalUrls;
    @JsonProperty("href")
    private String href;
    @JsonProperty("id")
    private String id;
    @JsonProperty("images")
    private List<Image__1> images;
    @JsonProperty("name")
    private String name;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("release_date_precision")
    private String releaseDatePrecision;
    @JsonProperty("type")
    private String type;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("artists")
    private List<Artist> artists;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Album() {
    }

    /**
     * 
     * @param images
     * @param releaseDate
     * @param externalUrls
     * @param type
     * @param uri
     * @param totalTracks
     * @param artists
     * @param albumType
     * @param availableMarkets
     * @param name
     * @param releaseDatePrecision
     * @param href
     * @param id
     */
    public Album(String albumType, Integer totalTracks, List<String> availableMarkets, ExternalUrls__3 externalUrls, String href, String id, List<Image__1> images, String name, String releaseDate, String releaseDatePrecision, String type, String uri, List<Artist> artists) {
        super();
        this.albumType = albumType;
        this.totalTracks = totalTracks;
        this.availableMarkets = availableMarkets;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.releaseDate = releaseDate;
        this.releaseDatePrecision = releaseDatePrecision;
        this.type = type;
        this.uri = uri;
        this.artists = artists;
    }

    @JsonProperty("album_type")
    public String getAlbumType() {
        return albumType;
    }

    @JsonProperty("album_type")
    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    @JsonProperty("total_tracks")
    public Integer getTotalTracks() {
        return totalTracks;
    }

    @JsonProperty("total_tracks")
    public void setTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
    }

    @JsonProperty("available_markets")
    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    @JsonProperty("available_markets")
    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    @JsonProperty("external_urls")
    public ExternalUrls__3 getExternalUrls() {
        return externalUrls;
    }

    @JsonProperty("external_urls")
    public void setExternalUrls(ExternalUrls__3 externalUrls) {
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

    @JsonProperty("images")
    public List<Image__1> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image__1> images) {
        this.images = images;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("release_date")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("release_date")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @JsonProperty("release_date_precision")
    public String getReleaseDatePrecision() {
        return releaseDatePrecision;
    }

    @JsonProperty("release_date_precision")
    public void setReleaseDatePrecision(String releaseDatePrecision) {
        this.releaseDatePrecision = releaseDatePrecision;
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

    @JsonProperty("artists")
    public List<Artist> getArtists() {
        return artists;
    }

    @JsonProperty("artists")
    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

}
