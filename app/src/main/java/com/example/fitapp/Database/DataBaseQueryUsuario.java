package com.example.fitapp.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.widget.Toast;

import com.example.fitapp.modelos.ModeloProcesos;

import java.util.ArrayList;

public class DataBaseQueryUsuario {

    private Context context;

    public DataBaseQueryUsuario(Context context) {
        this.context = context;
    }

    public String insertarUsuario(ModeloProcesos u){
        String nombreUsuario=u.getNombre();
        DatabaseHelper databaseHelper = DatabaseHelper.getInstance(context);
        SQLiteDatabase sqLiteDatabase = databaseHelper.getWritableDatabase();

        ContentValues contenido= new ContentValues();
        contenido.put(Config.COLUMNA_NOMBRE_USUARIO,u.getNombre());
        contenido.put(Config.COLUMNA_DETALLE,u.getDetalle());
        contenido.put(Config.COLUMNA_OPCIONES,u.getOpciones());
        contenido.put(Config.COLUMNA_NUMERO_ACTUAL,u.getNumeroActual());

        try{
            sqLiteDatabase.insertOrThrow(Config.TABLA_USUARIO,null,contenido);
        }
        catch(SQLiteException e){
            Toast.makeText(context, "Falló la inserción: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }finally {
            sqLiteDatabase.close();
        }
        return nombreUsuario;
    }

    /*
    public List<procesos> obtenerUsuarios(){

        DatabaseHelper databaseHelper = DatabaseHelper.getInstance(context);
        SQLiteDatabase sqLiteDatabase = databaseHelper.getReadableDatabase();

        Cursor cursor=null;
        try{
            cursor=  sqLiteDatabase.query(Config.TABLA_USUARIO,null,null,null,null,null,null,null);
            if(cursor!=null)
                if(cursor.moveToFirst()){
                    List<procesos> listaObtenida= new ArrayList<>();
                    do{
                        procesos usuarioObtenido=new procesos();
                        //obtengo valores de la BD
                        String nombre = cursor.getString (cursor.getColumnIndex(Config.COLUMNA_NOMBRE_USUARIO));
                        String detalle = cursor.getString(cursor.getColumnIndex(Config.COLUMNA_DETALLE));
                        //se los asigno al usuario
                        usuarioObtenido.setNombre(nombre);
                        usuarioObtenido.setDetalle(detalle);
                        //agrego el usuario a la lista
                        listaObtenida.add(usuarioObtenido);

                    }while(cursor.moveToNext());
                    return listaObtenida;
                }
        }
        catch(SQLiteException e){
            Toast.makeText(context, "Error al listar: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }finally {
            sqLiteDatabase.close();
        }
        return new ArrayList<procesos>();
    }
    */

    public ArrayList<ModeloProcesos> mostrarContactos() {

        DatabaseHelper dbHelper = new DatabaseHelper(context);
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ArrayList<ModeloProcesos> listaContactos = new ArrayList<>();
        ModeloProcesos contacto;
        Cursor cursorContactos;

        cursorContactos = db.rawQuery("SELECT * FROM " + Config.TABLA_USUARIO + " ORDER BY nombre ASC", null);

        if (cursorContactos.moveToFirst()) {
            do {
                contacto = new ModeloProcesos();
                contacto.setNombre(cursorContactos.getString(0));
                contacto.setDetalle(cursorContactos.getString(1));
                listaContactos.add(contacto);
            } while (cursorContactos.moveToNext());
        }

        cursorContactos.close();

        return listaContactos;
    }
}
