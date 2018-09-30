package com.team.admin.server.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.team.admin.server.model.FileInfo;

public interface FileService {

	FileInfo save(MultipartFile file) throws IOException;

	void delete(String id);

}
