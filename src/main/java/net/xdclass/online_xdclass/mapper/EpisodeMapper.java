package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.Episode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EpisodeMapper {

    /**
    * 功能描述
    * @Param:
     * @param videoId
    * @Return: net.xdclass.online_xdclass.model.entity.Episode
    * @Author: changYu
    * @Date: 2021/11/16 15:04
    * @Description: 通过VideoId查询指定集的信息
    */

    Episode findFirstEpisodeByVideoId(@Param("video_id") int videoId);

}
