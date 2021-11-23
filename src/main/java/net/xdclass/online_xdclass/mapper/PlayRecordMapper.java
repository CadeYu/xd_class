package net.xdclass.online_xdclass.mapper;

import net.xdclass.online_xdclass.model.entity.PlayRecord;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface PlayRecordMapper {


    int saveRecord(PlayRecord playRecord);

}
