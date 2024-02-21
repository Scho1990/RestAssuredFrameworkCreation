package org.spotify.oauth2.tests;

import io.qameta.allure.*;
import io.restassured.response.Response;
import org.spotify.oauth2.api.StatusCode;
import org.spotify.oauth2.api.applicationApi.PlaylistApi;
import org.spotify.oauth2.pojo.Error;
import org.spotify.oauth2.pojo.Playlists;
import org.spotify.oauth2.utils.DataLoader;
import org.spotify.oauth2.utils.FakerUtils;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PlaylistTests extends BaseTest{

    @Step("Adding playlist name, description and playlist accessibility")
    public Playlists playlistBuilder(String name,String description,boolean _public){
        Playlists requestPlaylists = new Playlists();
        requestPlaylists.setName(name);
        requestPlaylists.setDescription(description);
        requestPlaylists.set_public(_public);
        return requestPlaylists;
    }

    @Step("Checking Playlist name, description and accessibility in response")
    public void assertPlaylistEquals(Playlists responsePlaylists, Playlists requestPlaylists){
        assertThat(responsePlaylists.getName(),equalTo(requestPlaylists.getName()));
        assertThat(responsePlaylists.getDescription(),equalTo(requestPlaylists.getDescription()));
        assertThat(responsePlaylists.get_public(),equalTo(requestPlaylists.get_public()));
    }

    @Step("Checking error response")
    public void assertNegativeScenarioPlaylistEquals(Error responseError,String expectedMessage, int expectedStatus){
        assertThat(responseError.getError().getMessage(),equalTo(expectedMessage));
        assertThat(responseError.getError().getStatus(),equalTo(expectedStatus));
    }

    @Step("Checking Status Code")
    public void assertStatusCode(int actualStatusCode, int expectedStatusCode){
        assertThat(actualStatusCode,equalTo(expectedStatusCode));
    }

    @Owner("Santosh Choudhary")
    @Epic("API interface")
    @Feature("Create Playlist features")
    @Story("Playlist Story")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://jira.example.org")
    @Link(name = "allure",type="mylink")
    @TmsLink("TECH-12345")
    @Issue("TECH-5678")
    @Description("This test case is related to create a playlist")
    @Test(description = "Should Be Able To Create A Playlist")
    public void shouldBeAbleToCreateAPlaylist(){
        Playlists requestPlaylists = playlistBuilder(FakerUtils.generateName("Playlists"),FakerUtils.generateDescription("Description"),false);
        Response response = PlaylistApi.post(requestPlaylists);
        assertStatusCode(response.statusCode(), StatusCode.CODE_201.getCode());
        Playlists responsePlaylists = response.as(Playlists.class);
        assertPlaylistEquals(responsePlaylists,requestPlaylists);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("This test case is related to get a playlist")
    @Test(description = "Should Be Able To Get A Playlist")
    public void shouldBeAbleToGetAPlaylist(){
        Response response = PlaylistApi.get(DataLoader.getInstance().getPlaylistId());
        assertStatusCode(response.statusCode(),StatusCode.CODE_200.getCode());
        System.out.println("Request Body of Get: "+response.getBody().jsonPath().getString("name"));
        assertThat(response.getBody().jsonPath().getString("name"),equalTo("My New Playlist"));
        assertThat(response.getBody().jsonPath().getString("description"),equalTo("My New playlist description"));
        assertThat(Boolean.valueOf(response.getBody().jsonPath().getString("public")),equalTo(true));
    }

    @Severity(SeverityLevel.MINOR)
    @Description("This test case is related to update a playlist")
    @Test(description = "Should Be Able To Update A Playlist")
    public void shouldBeAbleToUpdateAPlaylist(){
        Playlists requestPlaylists = playlistBuilder("My New Playlist","My New playlist description",false);
        Response response = PlaylistApi.update(DataLoader.getInstance().getUpdatePlaylistId(), requestPlaylists);
        assertStatusCode(response.statusCode(),StatusCode.CODE_200.getCode());
    }

    @Severity(SeverityLevel.BLOCKER)
    @Description("This test case is related to user is not able to create a playlist with blank name")
    @Test(description = "Should Not Be Able To Create A Playlist With Blank Name")
    public void shouldNotBeAbleToCreateAPlaylistWithBlankName(){
        Playlists requestPlaylists = playlistBuilder("",FakerUtils.generateDescription("Description"),false);
        Response response = PlaylistApi.post(requestPlaylists);
        assertStatusCode(response.statusCode(),StatusCode.CODE_400.getCode());
        Error responseError = response.as(Error.class);
        assertNegativeScenarioPlaylistEquals(responseError,StatusCode.CODE_400.getMsg(), StatusCode.CODE_400.getCode());
    }

    @Severity(SeverityLevel.TRIVIAL)
    @Description("This test case is related to user is not able to create a playlist with invalid/expired token")
    @Test(description = "Should Not Be Able To Create A Playlist With Invalid Token")
    public void shouldNotBeAbleToCreateAPlaylistWithInvalidToken(){
        Playlists requestPlaylists = playlistBuilder(FakerUtils.generateName("Playlists"),FakerUtils.generateDescription("Description"),false);
        Response response = PlaylistApi.post("12345",requestPlaylists);
        assertStatusCode(response.statusCode(),StatusCode.CODE_401.getCode());
        Error responseError = response.as(Error.class);
        assertNegativeScenarioPlaylistEquals(responseError,StatusCode.CODE_401.getMsg(), StatusCode.CODE_401.getCode());
    }


}
