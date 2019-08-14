package com.example.nave.recyclerview3c_t6

class MyAdapter(var lista : MutableList<Android>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.lista_androids, parent, false)
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


    inner class MyViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){

        var nome = itemView.txtAndroid
        var versao = itemView.txtVersao
        var api = itemView.txtApi
        var avatar = itemView.imgAvatar
        var listaView = itemView.viewLista
    }
}
