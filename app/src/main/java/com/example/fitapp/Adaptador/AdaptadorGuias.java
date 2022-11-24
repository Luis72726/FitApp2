package com.example.fitapp.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitapp.R;
import com.example.fitapp.modelos.ModeloGuias;

import java.util.ArrayList;


public class AdaptadorGuias extends RecyclerView.Adapter<AdaptadorGuias.ViewHolderJuegos> {


    ArrayList<ModeloGuias> listaGuias;

    public AdaptadorGuias(ArrayList<ModeloGuias> listaJuegos) {
        this.listaGuias = listaJuegos;
    }

    @NonNull
    @Override
    public ViewHolderJuegos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_guias,null,false);
        return new ViewHolderJuegos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderJuegos holder, int position) {

        holder.itemTitulo.setText(listaGuias.get(position).getTitulo());
        holder.itemDescripcion.setText(listaGuias.get(position).getDescripcion());
        holder.itemFoto.setImageResource(listaGuias.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaGuias.size();
    }

    public class ViewHolderJuegos extends RecyclerView.ViewHolder {

        //referenciar componentes gráficos
        TextView itemTitulo,itemDescripcion;
        ImageView itemFoto;
        public ViewHolderJuegos(@NonNull View itemView) {
            super(itemView);
            itemTitulo = (TextView)  itemView.findViewById(R.id.nombreDeLista);
            itemDescripcion = (TextView)  itemView.findViewById(R.id.descripcionDeLaLista);
            itemFoto = (ImageView) itemView.findViewById(R.id.imageViewDeLista);

        }
    }
}
