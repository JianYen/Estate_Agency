package yen.estatea_gency.tool;

import org.springframework.web.multipart.MultipartFile;

public class FileUtils {


    public static boolean isLegalFormat(MultipartFile multipartFile) {
        String filename = multipartFile.getOriginalFilename();
        String fileType = filename.substring(filename.lastIndexOf(".") + 1).toLowerCase();
        if (!fileType.contains("jpg") || !fileType.contains("png")) {
            return false;
        }
        return true;
    }

}
