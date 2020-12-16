package com.mmall.service.impl;

import com.google.common.collect.Lists;
import com.mmall.service.IFileService;
import com.mmall.util.FTPUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * ClassName: FileServiceImpl
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/2
 */
@Service("iFileService")
public class FileServiceImpl implements IFileService {
	private Logger mLogger = LoggerFactory.getLogger(FileServiceImpl.class);

	@Override
	public String upload(MultipartFile file, String path) {

		String filename = file.getOriginalFilename();
		// 获取扩展名
		String fileExtensionName = filename.substring(filename.lastIndexOf(".") + 1);
		String uploadFileName = UUID.randomUUID().toString() + "." + fileExtensionName;
		mLogger.info("开始上传文件,上传文件的文件名:{},上传的路径:{},新文件名:{}", filename, path, uploadFileName);

		// 创建目录
		File fileDir = new File(path);
		if (!fileDir.exists()) {
			// 赋予写权限
			fileDir.setWritable(true);
			fileDir.mkdirs();
		}
		// 创建文件
		File targetFile = new File(path, uploadFileName);

		try {
			file.transferTo(targetFile);
			// 文件上传成功
			// 将targetFile上传到Ftp服务器上
			FTPUtil.uploadFile(Lists.newArrayList(targetFile));
			// 上传完成之后,删除upload下的文件
			targetFile.delete();
		} catch (IOException e) {
			mLogger.error("上传文件异常", e);
			return null;
		}
		return targetFile.getName();
	}
}
