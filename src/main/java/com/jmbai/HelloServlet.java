/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: HelloServlet
 * Author:   think
 * Date:     2020/8/3 13:56
 * Description: 入口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jmbai;

import com.jmbai.entity.bo.HeadLine;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈入口〉
 *
 * @author think
 * @create 2020/8/3
 * @since 1.0.0
 */
@Slf4j
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    //Logger logger = LoggerFactory.getLogger(HelloServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "我的个人框架";
        req.setAttribute("name", name);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);

        log.debug("name is " + name);

        HeadLine headLine = new HeadLine();
        headLine.setLineId(1L);

    }
}
