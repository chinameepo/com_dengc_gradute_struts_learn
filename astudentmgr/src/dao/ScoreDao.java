package dao; 

import java.util.List;

import model.Score;

/** 
 * 文件名：ScoreDao.java
 * All right Rserved Dengc2012
 * @author 邓超   E-mail: dengchaoccc@qq.com
 * @version 1.0,创建时间：2012-4-15 上午11:18:42 
 * @since jdk1.6
 * 考试成绩的DAO接口
 */
public interface ScoreDao
{
	/**
	 * 模块1：获得指定ID的成绩信息
	 * @param id 成绩的ID
	 * @return
	 */
	Score getsScore(int id);
	/**
	 * 模块2：添加新的成绩，并且保存到数据库
	 * @param score 被添加的成绩
	 */
	void save(Score score);
	/**
	 * 模块3：更改成绩
	 * @param score 被更改的成绩
	 */
	void update(Score score);
	/**
	 * 模块4：删除成绩
	 * @param id 成绩的序号ID
	 */
	void delete(int id);
	/**
	 * 删除成绩
	 * @param score
	 */
	void delete(Score score);
	
	/**模块5：查找某个学生的所有成绩
	 * @param studentId 学生的学号
	 * @return 该学生的所有成绩
	 */
	List<Score> findByStudent(int studentId);
}
 
