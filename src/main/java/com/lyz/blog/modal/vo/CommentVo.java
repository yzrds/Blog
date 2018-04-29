package com.lyz.blog.modal.vo;

import java.io.Serializable;

/**
 * @author youzeliang
 * on 2018/4/29
 */
public class CommentVo implements Serializable {

    /**
     * comment表主键
     */
    private Integer coid;

    /**
     * 评论生成的GMT unix时间戳
     */
    private Integer createTime;

    /**
     * 评论作者
     */
    private String author;

    /**
     * 评论所属用户id
     */
    private Integer authorId;

    /**
     * 评论者ip地址
     */
    private String ip;

    /**
     * 评论内容
     */
    private String content;


}
