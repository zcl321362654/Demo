package com.zcl.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@RestController
@RequestMapping("/api/image")
public class ImageController {

    @Resource
    private HttpServletResponse response;

    @GetMapping(value = "/getImage")
    public void getImage() throws IOException {
        OutputStream os = null;
        try {
//        读取图片
            BufferedImage image = ImageIO.read(new FileInputStream(new File("C:\\Users\\xxx\\Pictures\\Camera Roll\\ABT96F75F00B69B7C0F3B96B70986BEC8549D03602EF65A7E49CE759EFF8D03FAFE.jpg")));
            response.setContentType("image/png");
            os = response.getOutputStream();

            if (image != null) {
                ImageIO.write(image, "png", os);
            }
        } catch (IOException e) {
                e.printStackTrace();
        } finally {
            if (os != null) {
                os.flush();
                os.close();
            }
        }
    }

}
