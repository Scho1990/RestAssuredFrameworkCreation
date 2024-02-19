package org.spotify.oauth2.api.applicationApi;

import io.restassured.response.Response;
import org.spotify.oauth2.pojo.Playlists;

import static io.restassured.RestAssured.given;
import static org.spotify.oauth2.api.SpecBuilder.getRequestSpec;
import static org.spotify.oauth2.api.SpecBuilder.getResponseSpec;

public class PlaylistApi {
    static String access_token="BQC8idB-P6qTT_NNzT4bfALv-Ofui5mfXK0ROZR2ZyTOIBKujkA2F9zn6pOAsiHtVtRlDRb98vPLH0dFj6RvIc1r8_Muf7gFxkjlvP6ZSDnBCxideekD4RJp34-bzNMyexu5k-nZOFX_0rE_UXB2aPp2nYuGIvn-DxaZpUd5A7uG9B0tR3WY9bYLzM8fKUkRQSThLMwAQeyQYhxtGA0p-NnPcAQevlQeuHPvJBek4qMU8dhEM--YpMWpVuP7ZNMy8H5iOSuscuJUglXP";
    public static Response post(Playlists requestPlaylists){
        return given(getRequestSpec()).
                body(requestPlaylists).
                header("Authorization","Bearer "+access_token).
        when().post("/users/31pdz2tzh3lt35lb5qt5ooar5lyu/playlists").
        then().spec(getResponseSpec()).
                extract().
                response();
    }

    public static Response post(String token, Playlists requestPlaylists){
        return given(getRequestSpec()).
                body(requestPlaylists).
                header("Authorization","Bearer "+token).
                when().post("/users/31pdz2tzh3lt35lb5qt5ooar5lyu/playlists").
                then().spec(getResponseSpec()).
                extract().
                response();
    }

    public static Response get(String playlistId){
        return given(getRequestSpec()).
                header("Authorization","Bearer "+access_token).
                when().get("/playlists/"+playlistId).
                then().spec(getResponseSpec()).
                extract().
                response();
    }

    public static Response update(String playlistId,Playlists requestPlaylists ){
        return given(getRequestSpec()).
                body(requestPlaylists).
                header("Authorization","Bearer "+access_token).
                when().put("/playlists/"+playlistId).
                then().spec(getResponseSpec()).
                extract().
                response();
    }
}
