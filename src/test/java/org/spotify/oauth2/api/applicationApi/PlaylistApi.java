package org.spotify.oauth2.api.applicationApi;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.spotify.oauth2.api.RestResource;
import org.spotify.oauth2.api.TokenManager;
import org.spotify.oauth2.pojo.Playlists;
import org.spotify.oauth2.utils.ConfigLoader;

import static org.spotify.oauth2.api.Route.PLAYLISTS;
import static org.spotify.oauth2.api.Route.USERS;

public class PlaylistApi {

    @Step("Playlist Post Request Payload")
    public static Response post(Playlists requestPlaylists){
        return RestResource.post(USERS+ "/" +ConfigLoader.getInstance().getUserId() +PLAYLISTS, TokenManager.getToken(),requestPlaylists);
    }

    @Step("Playlist Post Request Payload for Invalid Token")
    public static Response post(String token, Playlists requestPlaylists){
        return RestResource.post(USERS+ "/" +ConfigLoader.getInstance().getUserId() +PLAYLISTS,token,requestPlaylists);
    }

    @Step("Get PlaylistID")
    public static Response get(String playlistId){
        return RestResource.get(PLAYLISTS+"/"+playlistId,TokenManager.getToken());
    }

    @Step("Update Playlist Request Payload")
    public static Response update(String playlistId,Playlists requestPlaylists ){
        return RestResource.update(PLAYLISTS+"/"+playlistId,TokenManager.getToken(),requestPlaylists);
    }
}
