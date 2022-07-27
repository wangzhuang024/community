package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // @Param 取别名 或者 动态的拼一个条件并且该方法有且只有一个条件则需要@Param
    // @Param注解用于给参数取别名
    // 如果只有一个参数，并且在<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    // 根据帖子Id更新帖子回复数量
    int updateCommentCount(int id, int commentCount);

    // 改帖子的类型
    int updateType(int id, int type);

    // 改帖子的状态
    int updateStatus(int id, int status);

}
