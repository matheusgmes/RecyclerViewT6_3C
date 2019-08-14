package com.example.nave.recyclerview3c_t6

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.androids_list.view.*

class MyAdapter(var lista : MutableList<Android>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.androids_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.nome.text = lista[position].nome
        holder.versao.text = lista[position].versao
        holder.api.text = lista[position].api
        holder.avatar.setImageResource(lista[position].avatar)
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var nome = itemView.txtAndroid
        var versao = itemView.txtVersion
        var api = itemView.txtAPI
        var avatar = itemView.imageView
        var listaView = itemView.rvLista
    }
}
