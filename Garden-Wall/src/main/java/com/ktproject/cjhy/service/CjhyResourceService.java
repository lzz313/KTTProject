package com.ktproject.cjhy.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestParam;

import com.ktproject.cjhy.model.CjhyResourceModel;

public interface CjhyResourceService {
	
	/**
	 * 查询所有的财经慧眼作家的信息.
	 * @return
	 */
	List<CjhyResourceModel>  queryCjhyResourceAll();
	
	/**
	 * 根据财经学家类别查找相应的财经学家信息.
	 * @param cjxjType
	 * @return
	 */
	Map<String,Object>  queryCjhyResourceByCjxjType(final Map map);
	
	/**
	 * 根据作者ID查找相应的文章列表.
	 * @param map
	 * @return
	 */
	Map<String,Object>  queryCjhyResourceDetailById(final Map map);
	
    /**
     * 根据作家ID查询相应的用户文章信息列表.
     * @param authorId
     * @return 
     */
	CjhyResourceModel  queryArticleByAuthorId(final int authorId);
	
	/**
	 * 查询当天的财经慧眼品论.
	 * @param map
	 * @return
	 */
	Map<String, Object> queryDailyCjhyResource(final  Map  map);
	
	/**
	 * 更新相应的博客关注度.
	 * @param id
	 * @return
	 */
	int  addDailyPopulateById(final Map map);
}
