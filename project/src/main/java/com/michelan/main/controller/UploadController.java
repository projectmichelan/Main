package com.michelan.main.controller;


import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import org.apache.tomcat.jni.File;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.multipart.MultipartFile;


@Controller

public class UploadController {
    @GetMapping("/upload")
    public String upload() {


        return "upload";
    }
    @PostMapping("/upload") public String upload(@RequestParam("file") MultipartFile multipartFile) {
        log.info("upload");
        File targetFile = new File(path.resolve(multipartFile.getOriginalFilename()).toString());
        try {
            InputStream fileStream = multipartFile.getInputStream(); FileUtils.copyInputStreamToFile(fileStream, targetFile);
        } catch (IOException e) {
            FileUtils.deleteQuietly(targetFile);
            log.error("Failed to upload ", e);
        }
        return "redirect:/form"; }


}
