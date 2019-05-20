package com.zhou.test.util;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
* 验证码生成工具类
* @author 01367396
*/
public class VerifyCodeUtil {
    /*********************************************************************
     * 验证码宽度
     */
    public static final int WIDTH = 100;
    /***
     * 验证码高度
     */
    public static final int HEIGHT = 33;

    private static Color getRandomColor() {
        Random ran = new Random();
        Color color = new Color(ran.nextInt(256),
                ran.nextInt(256), ran.nextInt(256));
        return color;
    }

    private static Color getRandomRColor() {
        Random ran = new Random();
        Color color = new Color(70+ran.nextInt(130),
                70+ran.nextInt(130), 70+ran.nextInt(130));
        return color;
    }

    private static Color getRandomFColor() {
        Random ran = new Random();
        Color color = new Color(20+ran.nextInt(150),
                20+ran.nextInt(150), 20+ran.nextInt(150));
        return color;
    }

    private static Color getRandomBColor() {
        Random ran = new Random();
        Color color = new Color(200+ran.nextInt(50),
                200+ran.nextInt(50),200+ ran.nextInt(50));
        return color;

    }



    /***
     * 生成图片方法
     * @param codeStrs
     * @param response
     * @return
     * @throws Exception
     */
    public static boolean getImage(String[] codeStrs, HttpServletResponse response) throws Exception {
        response.reset();
        response.setContentType("image/jpeg");
        // 设置页面不缓存
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        // 在内存中创建图象
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

        // 获取图形上下文
        Graphics2D graphics = (Graphics2D)image.getGraphics();
        // 设定背景色
        graphics.setColor(getRandomBColor());
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        // 设定字体
        graphics.setFont(new Font("微软雅黑", Font.BOLD, 40));
        // 生成随机类
        Random random = new Random();
        String baseNumLetter="123456789abcdefghijklmnopqrstuvwxyzABCDEFGHJKLMNPQRSTUVWXYZ";
        StringBuffer sBuffer = new StringBuffer();
        int x = 10;  //旋转原点的 x 坐标
        String ch = "";
        for(int i = 0;i < 4;i++){
            graphics.setColor(getRandomFColor());
            graphics.setFont(getRandomFont());
            //设置字体旋转角度
            int degree = random.nextInt() % 30;  //角度小于30度
            int dot = random.nextInt(baseNumLetter.length());
            ch = baseNumLetter.charAt(dot) + "";
            sBuffer.append(ch);
            //正向旋转
            graphics.rotate(degree * Math.PI / 180, x, 25);
            graphics.drawString(ch, x, 25);
            //反向旋转
            graphics.rotate(-degree * Math.PI / 180, x, 25);
            x += 22;
        }




        // 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到
        for (int i = 0; i < 15; i++) {
            int x1 = random.nextInt(WIDTH);
            int y1 = random.nextInt(HEIGHT);
            int x2 = random.nextInt(40);
            int y2 = random.nextInt(40);
            graphics.setColor(getRandomRColor());
            graphics.drawLine(x1, y1, x1 + x2, y1 + y2);
        }

        //添加噪点
        for(int i=0;i<20;i++){
            int x1 = random.nextInt(WIDTH);
            int y1 = random.nextInt(HEIGHT);
            graphics.setColor(getRandomColor());
            graphics.fillRect(x1, y1, 2,2);
        }

        // 图象生效
        graphics.dispose();
        // 输出图象到页面
        return ImageIO.write(image, "JPEG", response.getOutputStream());
    }

    /**
     *  随机生成字体、文字大小
     * @return
     */
    public static Font getRandomFont() {
        String[] fonts = {"Georgia", "Verdana", "Arial", "Tahoma", "Time News Roman", "Courier New", "Arial Black", "Quantzite"};
        int fontIndex = (int)Math.round(Math.random() * (fonts.length - 1 ));
        int fontSize =15+ (int) Math.round(10);
        return new Font(fonts[fontIndex], Font.PLAIN, fontSize);
    }
}
