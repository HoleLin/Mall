package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

/**
 * InterfaceName: ICategoryService
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/4/21
 */
public interface ICategoryService {
	public ServerResponse addCategory(String categoryName, Integer parentId);

	public ServerResponse updateCategoryName(Integer categoryId, String categoryName);

	public ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
	/**
	 * 递归查询本节点的ID以孩子节点的ID
	 * @param categoryId
	 * @return
	 */
	public ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
