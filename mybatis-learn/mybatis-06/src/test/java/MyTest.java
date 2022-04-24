import com.kuang.dao.BlogMapper;
import com.kuang.pojo.Blog;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class MyTest {
    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId("4");
        blog.setTitle("Flutter会火吗?");
        blog.setAuthor("MiYuan");
        blog.setCreateTime(new Date());
        blog.setViews(1);

        mapper.addBlog(blog);
        sqlSession.close();
    }

    @Test
    public void queryBlogIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("author","MiYuan");

        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) System.out.println(blog);
        sqlSession.close();
    }

    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("views", 1);
        map.put("author", "MiYuan");
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for(Blog blog : blogs) System.out.println(blog);
        sqlSession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("id", 1);
        map.put("title", "React");
        mapper.updateBlog(map);
        sqlSession.close();
    }
}
