package yen.estatea_gency.controller;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import yen.estatea_gency.model.enums.StatusCodeEnum;
import yen.estatea_gency.model.response.CommonResponse;
import yen.estatea_gency.tool.FileUtils;

import java.io.File;
import java.io.IOException;

@Slf4j
@RestController("/file")
public class FileController {

    @Value("${file.upload.path}")
    private String uploadPath;

    private Gson gson = new Gson();

    @PostMapping("/upload")
    @Transactional
    public CommonResponse upload(@RequestParam("file") MultipartFile[] files) {
        if (files == null && files.length == 0) {
            return CommonResponse.error(StatusCodeEnum.NO_FILE, null);
        }
        for (MultipartFile file : files) {
            if (FileUtils.isLegalFormat(file)) {
                return CommonResponse.error(StatusCodeEnum.FILE_TYPE_NOT_ALLOWED, gson.toJson(file.getOriginalFilename()));
            }
            try {
                file.transferTo(new File(uploadPath));
            } catch (IOException e) {
                log.error("檔案上傳失敗，請稍後在試");
            }
        }
        return CommonResponse.success(gson.toJson(files));
    }

}
