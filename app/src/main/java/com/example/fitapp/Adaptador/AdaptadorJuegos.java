package com.example.fitapp.Adaptador;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.fitapp.Interfaces.VerPropiedades;
import com.example.fitapp.R;
import com.example.fitapp.modelos.procesos;

public class AdaptadorJuegos extends RecyclerView.Adapter<AdaptadorJuegos.ViewHolderJuegos> {


    ArrayList<procesos> listaJuegos;

    public AdaptadorJuegos(ArrayList<procesos> listaJuegos) {
        this.listaJuegos = listaJuegos;
    }

    @NonNull
    @Override
    public ViewHolderJuegos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_procesos,null,false);
        return new ViewHolderJuegos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderJuegos holder, int position) {

        holder.itemNombre.setText(listaJuegos.get(position).getNombre());
        holder.itemInformacion.setText(listaJuegos.get(position).getDetalle());

    }

    @Override
    public int getItemCount() {
        return listaJuegos.size();
    }

    public class ViewHolderJuegos extends RecyclerView.ViewHolder {

        //referenciar componentes gráficos
        TextView itemNombre,itemInformacion;
        public ViewHolderJuegos(@NonNull View itemView) {
            super(itemView);
            itemNombre= (TextView)  itemView.findViewById(R.id.nombreDeLista);
            itemInformacion = (TextView)  itemView.findViewById(R.id.detalleDeLaLista);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, VerPropiedades.class);
                    intent.putExtra("ID", listaJuegos.get(getAdapterPosition()).getNombre());
                    context.startActivity(intent);
                }
            });
        }
    }
}
