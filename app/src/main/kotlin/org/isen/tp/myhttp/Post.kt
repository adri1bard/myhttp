package org.isen.tp.myhttp

import com.github.kittinunf.fuel.core.Response
import com.github.kittinunf.fuel.core.ResponseDeserializable
import  com.google.gson.Gson

class Post (val userid: Int, val id: Int, val title: String, val body: String) {
     class  Deserializer: ResponseDeserializable<Array<Post>>{
         override fun deserialize(content: String): Array<Post> {
             return Gson().fromJson(content, Array<Post>::class.java)
         }
     }
}