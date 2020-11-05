package com.zj.network.service

import com.zj.model.model.ArticleList
import com.zj.model.model.BaseModel
import com.zj.model.room.entity.ProjectClassify
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * 版权：Zhujiang 个人版权
 * @author zhujiang
 * 版本：1.5
 * 创建日期：2020/5/19
 * 描述：PlayAndroid
 *
 */
interface OfficialService {

    @GET("wxarticle/chapters/json")
    fun getWxArticleTree(): Call<BaseModel<List<ProjectClassify>>>

    @GET("wxarticle/list/{cid}/{page}/json")
    fun getWxArticle(@Path("page") page: Int, @Path("cid") cid: Int): Call<BaseModel<ArticleList>>

}