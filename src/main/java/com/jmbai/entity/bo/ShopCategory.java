/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ShopCategory
 * Author:   think
 * Date:     2020/8/28 16:26
 * Description: 商品类别
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jmbai.entity.bo;

import lombok.Data;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商品类别〉
 *
 * @author think
 * @create 2020/8/28
 * @since 1.0.0
 */
@Data
public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;
}
