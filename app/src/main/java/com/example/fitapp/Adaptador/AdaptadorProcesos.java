package com.example.fitapp.Adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.fitapp.R;
import com.example.fitapp.modelos.ModeloProcesos;

public class AdaptadorProcesos extends RecyclerView.Adapter<AdaptadorProcesos.ViewHolderJuegos> {


    ArrayList<ModeloProcesos> listaProcesos;

    public AdaptadorProcesos(ArrayList<ModeloProcesos> listaJuegos) {
        this.listaProcesos = listaJuegos;
    }

    @NonNull
    @Override
    public ViewHolderJuegos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_procesos,null,false);
        return new ViewHolderJuegos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderJuegos holder, int position) {

        holder.itemNombre.setText(listaProcesos.get(position).getNombre());
        holder.itemDetalle.setText(listaProcesos.get(position).getDetalle());

    }

    @Override
    public int getItemCount() {
        return listaProcesos.size();
    }

    public class ViewHolderJuegos extends RecyclerView.ViewHolder {

        //referenciar componentes gráficos
        TextView itemNombre, itemDetalle;
        public ViewHolderJuegos(@NonNull View itemView) {
            super(itemView);
            itemNombre = (TextView)  itemView.findViewById(R.id.nombreDeLista);
            itemDetalle = (TextView)  itemView.findViewById(R.id.descripcionDeLaLista);

            /*
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, VerPropiedades.class);
                    intent.putExtra("ID", listaJuegos.get(getAdapterPosition()).getNombre());
                    context.startActivity(intent);
                }
            });

             */
        }
    }
}
