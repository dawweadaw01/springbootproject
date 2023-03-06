package com.comic.springbootproject.common.service;

import com.comic.springbootproject.common.vo.Result;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;

/**
 * image service
 */
public interface ImageService {
    //上传动漫图片
    Result<String> uploadImage(MultipartFile mf, String imageTypeName) throws FileNotFoundException;
}
