package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Video;
import net.xdclass.online_xdclass.model.entity.VideoBanner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VideoMapper{

    /**
     * 查询视频列表
     * @return
     */
    List<Video> listVideo();

    /**
     * 首页轮播图列表
     * @return
     */
    List<VideoBanner> listVideoBanner();

    /**
     * 查询视频详情
     * @param videoId
     * @return
     */
    Video findDetailById(@Param("video_id") int videoId);

    /**
     * 简单查询视频信息
     * @param videoId
     * @return
     */
    Video findById(@Param("video_id") int videoId);
}
