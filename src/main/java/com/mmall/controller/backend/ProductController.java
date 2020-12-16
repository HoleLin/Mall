package com.mmall.controller.backend;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.service.IProductService;
import com.mmall.vo.ProductDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: ProductController
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/2
 */
@Controller
@RequestMapping("/product/")
public class ProductController {
	@Autowired
	private IProductService mIProductService;

	@RequestMapping("detail.do")
	@ResponseBody
	public ServerResponse<ProductDetailVo> detail(Integer productId) {
		return mIProductService.getProductDetail(productId);
	}

	@RequestMapping("list.do")
	@ResponseBody
	public ServerResponse<PageInfo> list(@RequestParam(value = "keyword", required = false) String keyword,
	                                     @RequestParam(value = "categoryId", required = false) Integer categoryId,
	                                     @RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
	                                     @RequestParam(value = "pageSize", defaultValue = "10") int pageSize,
	                                     @RequestParam(value = "orderBy", defaultValue = "") String orderBy) {

		return mIProductService.getProductByKeywordCategory(keyword, categoryId, pageNum, pageSize, orderBy);
	}


}
