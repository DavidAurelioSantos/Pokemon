package pokemon.com.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import pokemon.com.R;
import pokemon.com.adapters.CustomAdapter;
import pokemon.com.models.RetroPokemon;
import pokemon.com.network.GetDataService;
import pokemon.com.network.ListCards;
import pokemon.com.network.RetrofitClientInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private CustomAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Aguarde....");
        progressDialog.show();

        /*Create handle for the RetrofitInstance interface*/
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);

        Call<RetroPokemon> call = service.getAllPokemons();
        call.enqueue(new Callback<ListCards>() {

            @Override
            public void onResponse(Call<ListCards> call, Response<ListCards> response) {
                progressDialog.dismiss();
                generateListCards(response.body().getCards());
            }

            @Override
            public void onFailure(Call<ListCards> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, "Ocorreu algum erro...Tente novamente mais tarde!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    /*Method to generate List of data using RecyclerView with custom adapter*/
    private void generateListCards(List<RetroPokemon> pokemonList) {
        recyclerView = (RecyclerView) findViewById(R.id.customRecyclerView);
        adapter = new CustomAdapter(this,pokemonList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}