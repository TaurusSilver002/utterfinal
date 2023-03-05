package com.example.techstormxml

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView


class CardChildAdapter(private val itemCardList : List<ItemCard>) : RecyclerView.Adapter<CardChildAdapter.CardChildViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  CardChildViewHolder{
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return CardChildViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CardChildViewHolder, position: Int) {
        val currentitem = itemCardList[position]
        holder.titleImage.setImageResource(currentitem.titleImage)
        holder.cardName.text = currentitem.strng
        holder.itemView.setOnClickListener {
            val a = currentitem.strng
            val bundle = Bundle()
            val browserIntent : Intent
            if (currentitem.strng=="CODE-BEE") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_codebee.html"))
            }
            else if (currentitem.strng=="OMEGATRIX") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_omegatrix.html"))
            }
            else if (currentitem.strng=="WEB-O-LOGY") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_webology.html"))
            }
            else if (currentitem.strng=="TECHNOMANIA") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_technomania.html"))
            }
            else if (currentitem.strng=="APP MANIA") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_appmania.htm"))
            }
            else if (currentitem.strng=="RO NAVIGATOR") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_ronavigator.html"))
            }
            else if (currentitem.strng=="RO SOCCER") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_rosoccer.html"))
            }
            else if (currentitem.strng=="RO COMBAT(LIGHT)"  || currentitem.strng=="RO COMBAT(HEAVY)") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_rocombat.html"))
            }
            else if (currentitem.strng=="RO PUZZLE") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_ropuzzle.html"))
            }
            else if (currentitem.strng=="RO TERRANCE") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_roterrance.html"))
            }
            else if (currentitem.strng=="POWER PULL") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_powerpull.html"))
            }
            else if (currentitem.strng=="FIFA") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_fifa.html"))
            }
            else if (currentitem.strng=="PES") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_pes.html"))
            }
            else if (currentitem.strng=="KHET(INTRA-COLLEGE)") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_khet.html"))
            }
            else if (currentitem.strng=="VALORANT") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_valorant.html"))
            }
            else if (currentitem.strng=="PASSION WITH REELS") {
                // block of code to be executed if the condition is true
                browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/rules_passionwithreels.html"))
            }
            else{
                browserIntent =Intent(Intent.ACTION_VIEW, Uri.parse("https://techstorm-23.vercel.app/category.html"))
            }

            startActivity(it!!.context,browserIntent,bundle)
//            Toast.makeText(it!!.context, "You Clicked $a", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return itemCardList.size
    }
    class CardChildViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
        var titleImage : ShapeableImageView = itemview.findViewById((R.id.title_image))
        var cardName : TextView = itemview.findViewById(R.id.cardName)



    }



}