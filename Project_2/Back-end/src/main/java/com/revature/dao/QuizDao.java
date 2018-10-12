package com.revature.dao;

import java.util.List;

import com.revature.beans.Quiz;

public interface QuizDao {

	public List<Quiz> getQuizzesByUserId(int id);
	public Quiz getQuizByQuizId(int id);
	public Quiz getQuizByQuizName(String n);
	public List<Quiz> getQuizList();
	public int createQuiz(Quiz q);
	public void updateQuiz(Quiz q);
	public void deleteQuiz(Quiz q);
	void deleteQuizById(int id);
	List<Quiz> getQuizzesByLockStatus(int lockStatus);
	List<Quiz> getLockedQuizzesByUserId(int id);
	List<Quiz> getUnlockedQuizzesByUserId(int id);
}
