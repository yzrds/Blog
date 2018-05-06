package com.lyz.blog.controller;

import com.lyz.blog.utils.MapCache;

/**
 * @author youzeliang
 * on 2018/4/28
 */
public abstract class BaseController {

    protected MapCache cache = MapCache.single();
}
