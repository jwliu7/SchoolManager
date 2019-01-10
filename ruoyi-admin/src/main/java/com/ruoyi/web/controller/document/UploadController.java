package com.ruoyi.web.controller.document;

import com.ruoyi.common.file.AjaxResult1;
import com.ruoyi.common.file.UploadUtil;
import com.ruoyi.system.domain.DocActivity;
import com.ruoyi.system.domain.DocAppretrsch;
import com.ruoyi.system.domain.DocProject;
import com.ruoyi.system.domain.DocReport;
import com.ruoyi.system.service.IDocActivityService;
import com.ruoyi.system.service.IDocAppretrschService;
import com.ruoyi.system.service.IDocProjectService;
import com.ruoyi.system.service.IDocReportService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/upload/")
public class UploadController {
	/**访问地址*/
	@Value("/upload/")
	private String path;
	/**存放地址*/
	@Value("/service/upload/")
	private String docBase;
	@Autowired
	private UploadUtil uploadUtil;

	/**
	 * 上传图片
	 * @param
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "uploadImg.do")
	@ResponseBody
	public AjaxResult1 uploadImg(HttpServletRequest request) {
		final Map<String, Object> result = new HashMap<String, Object>();
		String filepath = uploadUtil.upload(request, docBase, path);
		result.put("filepath", filepath);
		return new AjaxResult1(1, "上传成功", result);
	}

	/**
	 * 上传文件(注意:前端需要传默认参数:name="files",或者加注解@RequestParam("files")指定参数名)
	 * @param request

	 * @return
	 */
	@RequestMapping(value = "uploadFile.do")
	@ResponseBody
	public AjaxResult1 uploadFile(MultipartFile[] files, HttpServletRequest request) {
		final Map<String, Object> result = new HashMap<String, Object>();
		// 判断file数组不能为空并且长度大于0
		if (files != null && files.length > 0) {
			// 循环获取file数组中得文件
			for (int i = 0; i < files.length; i++) {
				MultipartFile file = files[i];
				// 判断文件是否为空
				if (!file.isEmpty()) {
					String fileName = file.getOriginalFilename();
					// 文件后缀
					String suffixes = fileName.substring(fileName.lastIndexOf("."), fileName.length());
					// 重命名文件
					String nowName = uploadUtil.getNewName(suffixes);

					final ByteArrayOutputStream fileStream = new ByteArrayOutputStream();
					// 存放位置
					String savepath = uploadUtil.getFilePath(docBase, nowName);
					try {
						// 复制文件内容
						IOUtils.copy(file.getInputStream(), fileStream);
						// 复制文件
						FileUtils.copyInputStreamToFile(new ByteArrayInputStream(fileStream.toByteArray()), new File(savepath));
					} catch (Exception e) {
						return new AjaxResult1(0, "上传失败", null);
					}
					result.put("nowname", nowName);
					result.put("filetype", suffixes);
					result.put("filesize", file.getSize());
					result.put("savepath", savepath);
					result.put("url", uploadUtil.getFilePath(path, nowName));
				} else {
					return new AjaxResult1(0, "请选择文件上传", result);
				}
			}
		}
		return new AjaxResult1(1, "上传成功", result);
	}



	@Autowired
	private IDocAppretrschService docAppretrschService;

	@Autowired
	private IDocActivityService docActivityService;

	@Autowired
	private IDocReportService docReportService;

	@Autowired
	private IDocProjectService docProjectService;


	/**
	 * 下载文件
	 * @param response
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("downFile.app")
	public String downAppretrschFile(HttpServletResponse response, int id) throws Exception {
		DocAppretrsch file = docAppretrschService.queryFileByID(id);
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		// 文件路径
		String savePath = file.getSavepath();
		// 文件大小
		long fileSize = file.getFilesize();
		// 设置文件输出类型
		response.setContentType("application/octet-stream");
		// 设置文件输出名称
		response.setHeader("Content-disposition", "attachment; filename=" + new String(file.getFilename().getBytes("UTF-8"), "ISO8859-1"));
		// 获取文件的长度
		response.setHeader("Content-Length", String.valueOf(fileSize));
		// 获取输入流
		bis = new BufferedInputStream(new FileInputStream(savePath));
		// 获取输出流
		bos = new BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
		// 关闭流
		bis.close();
		bos.close();
		return null;
	}

	/**
	 * 下载文件
	 * @param response
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("downFile.act")
	public String downActivityFile(HttpServletResponse response, int id) throws Exception {
		DocActivity file = docActivityService.queryFileByID(id);
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		// 文件路径
		String savePath = file.getSavepath();
		// 文件大小
		long fileSize = file.getFilesize();
		// 设置文件输出类型
		response.setContentType("application/octet-stream");
		// 设置文件输出名称
		response.setHeader("Content-disposition", "attachment; filename=" + new String(file.getFilename().getBytes("UTF-8"), "ISO8859-1"));
		// 获取文件的长度
		response.setHeader("Content-Length", String.valueOf(fileSize));
		// 获取输入流
		bis = new BufferedInputStream(new FileInputStream(savePath));
		// 获取输出流
		bos = new BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
		// 关闭流
		bis.close();
		bos.close();
		return null;
	}

	/**
	 * 下载文件
	 * @param response
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("downFile.rep")
	public String downReportFile(HttpServletResponse response, int id) throws Exception {
		DocReport file = docReportService.queryFileByID(id);
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		// 文件路径
		String savePath = file.getSavepath();
		// 文件大小
		long fileSize = file.getFilesize();
		// 设置文件输出类型
		response.setContentType("application/octet-stream");
		// 设置文件输出名称
		response.setHeader("Content-disposition", "attachment; filename=" + new String(file.getFilename().getBytes("UTF-8"), "ISO8859-1"));
		// 获取文件的长度
		response.setHeader("Content-Length", String.valueOf(fileSize));
		// 获取输入流
		bis = new BufferedInputStream(new FileInputStream(savePath));
		// 获取输出流
		bos = new BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
		// 关闭流
		bis.close();
		bos.close();
		return null;
	}

	/**
	 * 下载文件
	 * @param response
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("downFile.pro")
	public String downProjectFile(HttpServletResponse response, int id) throws Exception {
		DocProject file = docProjectService.queryFileByID(id);
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		// 文件路径
		String savePath = file.getSavepath();
		// 文件大小
		long fileSize = file.getFilesize();
		// 设置文件输出类型
		response.setContentType("application/octet-stream");
		// 设置文件输出名称
		response.setHeader("Content-disposition", "attachment; filename=" + new String(file.getFilename().getBytes("UTF-8"), "ISO8859-1"));
		// 获取文件的长度
		response.setHeader("Content-Length", String.valueOf(fileSize));
		// 获取输入流
		bis = new BufferedInputStream(new FileInputStream(savePath));
		// 获取输出流
		bos = new BufferedOutputStream(response.getOutputStream());
		byte[] buff = new byte[2048];
		int bytesRead;
		while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
			bos.write(buff, 0, bytesRead);
		}
		// 关闭流
		bis.close();
		bos.close();
		return null;
	}

}
