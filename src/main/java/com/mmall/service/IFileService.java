package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * ClassName: IFileService
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/2
 */

public interface IFileService {
	public String upload(MultipartFile file, String path);
}
