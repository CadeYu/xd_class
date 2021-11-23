package net.xdclass.online_xdclass.config;

/**
 * @ClassName CacheKeyManager
 * @Description 缓存管理类
 * @Author changYU
 * @Date 2021/11/16 16:12
 * @Version 1.0
 **/

public class CacheKeyManager {


    //首页轮播图缓存key

   public static final String INDEX_BANNER_KEY = "index:banner:list";

    //视频列表缓存key

    public static final String INDEX_VIDEO_LIST_KEY = "index:video:list";


    //视频详情缓存key, %s是视频id

    public static final String VIDEO_DETAIL = "video:detail:%s";

}
