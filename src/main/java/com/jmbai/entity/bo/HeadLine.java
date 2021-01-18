/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: HeadLine
 * Author:   think
 * Date:     2020/8/28 16:26
 * Description: 头条
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jmbai.entity.bo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈头条〉
 *
 * @author think
 * @create 2020/8/28
 * @since 1.0.0
 */
@Getter@Setter
public class HeadLine {
    private Long lineId;
    private String lineName;
    private  String lineLink;
    private String lineImg;
    private Integer priority;
    private Integer enableStatus;
    private Date createTime;
    private Date lastEditTime;
}
