package pokemon.com.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

import pokemon.com.R;
import pokemon.com.activities.MainActivity;
import pokemon.com.models.RetroPokemon;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private List<RetroPokemon> dataList;
    private Context context;

    public CustomAdapter(Context context, List<RetroPokemon> dataList){
        this.context = context;
        this.dataList = dataList;
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new CustomAdapter.CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomAdapter.CustomViewHolder holder, int position) {
        holder.txtTitle.setText(dataList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


class CustomViewHolder extends RecyclerView.ViewHolder {

    public final View mView;

    TextView txtTitle;

    CustomViewHolder(View itemView) {
        super(itemView);
        mView = itemView;

        txtTitle = mView.findViewById(R.id.title);
    }
}
}