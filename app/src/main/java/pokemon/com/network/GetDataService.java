package pokemon.com.network;

import java.util.List;

import pokemon.com.models.RetroPokemon;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("cards")
    Call<RetroPokemon> getAllPokemons();
}
