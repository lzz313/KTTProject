/**
 * 创建于: 2014年6月15日 上午8:38:55<br>
 * 所属项目:财汇网
 * 文件名称:MorningNewsDAOImpl.java
 * 作者:ZJJ
 * 版权信息: 版权所有 © 2001-2013 科投股份有限公司
 */
package com.ktproject.mornnews.dao.impl;

import java.util.List;
import java.util.Map;

import com.ktproject.mornnews.dao.MorningNewsDAO;
import com.ktproject.mornnews.model.MorningNewsVO;

/**
 * 类功能描述：
 * MorningNewsDAOImpl.java
 * @author ZJJ
 * @version 0.1.0
 * @history 2014年6月15日 ZJJ 创建MorningNewsDAOImpl.java
 */
public class MorningNewsDAOImpl implements MorningNewsDAO {

	/**
	 * @see com.ktproject.mornnews.dao.MorningNewsDAO#queryChinaMorningNews(java.util.Map)
	 */
	public List<MorningNewsVO> queryChinaMorningNews(
			Map<String, Object> filterMap) {
		
		return null;
	}

	/**
	 * @see com.ktproject.mornnews.dao.MorningNewsDAO#queryChinaMorningNewsCount(java.util.Map)
	 */
	public int queryChinaMorningNewsCount(Map<String, Object> filterMap) {
		
		return 0;
	}

}