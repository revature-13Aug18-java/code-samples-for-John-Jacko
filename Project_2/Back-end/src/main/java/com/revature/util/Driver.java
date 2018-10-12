package com.revature.util;

import com.revature.beans.Quiz;
import com.revature.beans.User;
import com.revature.dao.QuestionDao;
import com.revature.dao.QuestionDaoImpl;
import com.revature.dao.QuizDao;
import com.revature.dao.QuizDaoImpl;
import com.revature.dao.UserDao;
import com.revature.dao.UserDaoImpl;

public class Driver {

	public static void main(String[] args) {

		UserDao udi = new UserDaoImpl();
//		System.out.println(udi.getUserById(22));
//		udi.createUser(new User("username", "pwd"));
//		udi.createUser(new User("username1", "pwd1"));
//		udi.createUser(new User("username2", "pwd2"));
//		udi.createUser(new User("username3", "pwd3"));
//		udi.createUser(new User("username4", "pwd4"));
//		udi.createUser(new User("username5", "pwd5"));
//		udi.createUser(new User("username6", "pwd6"));
//		udi.createUser(new User("username7", "pwd7"));

		QuestionDao qd = new QuestionDaoImpl();

//		qd.createQuestion(new Question(1, "What is the capital of the Alabama?", "A. Montgomery, B. Mobile, C. Birmingham", "A"));
//		qd.createQuestion(new Question(9, "True/False: Transcription is the process of DNA replication.", "True/False", "True"));
//		qd.createQuestion(new Question(6, "True/False: Math is fun!", "True/False", "True"));
//		qd.createQuestion(new Question(4, "True/False: Peanuts are a type of treenut.", "True/False", "False"));
//		qd.createQuestion(new Question(5, "True/False: Prince was the greatest artist of all time", "True/False", "True"));
//		qd.createQuestion(new Question(5, "True/False: David Bowie was the greatest artist of all time", "True/False", "True"));
//		qd.createQuestion(new Question(5, "True/False: Tom Waits is the greatest artist of all time", "True/False", "True"));
//		qd.createQuestion(new Question(5, "True/False: Whitney deserved better than Bobby Brown", "True/False", "True"));
//		qd.createQuestion(new Question(5, "True/False: Sterling K. Brown deserves an Oscar. For TV.", "True/False", "True"));
//
		/*
		 * qd.deleteQuestion(new Question(5, 5,
		 * "True/False: Prince was the greatest artist of all time", "True/False",
		 * "True")); qd.deleteQuestionById(7);
		 * System.out.println(qd.getQuestionByCat(5));
		 * System.out.println(qd.getQuestionById(12)); qd.updateQuestion(new Question(4,
		 * 4, "True/False: Peanuts are a type of legume.", "True/False", "True"));
		 * System.out.println(qd.getQuestionList());
		 */

		QuizDao qzd = new QuizDaoImpl();
//		System.out.println(qzd.createQuiz(new Quiz("1, 2, 3, 4, 5", udi.getUserById(1))));
//		System.out.println(qzd.createQuiz(new Quiz("1, 2, 3, 4, 5", udi.getUserById(2))));
//		System.out.println(qzd.createQuiz(new Quiz("1, 2, 3, 4, 5", udi.getUserById(3))));
//		System.out.println(qzd.createQuiz(new Quiz("1, 2, 3, 4, 5", udi.getUserById(4))));
//		System.out.println(qzd.createQuiz(new Quiz("1, 2, 3, 4, 5", udi.getUserById(5))));
//		System.out.println(qzd.createQuiz(new Quiz("1, 2, 3, 4, 5", udi.getUserById(6))));
//		System.out.println(qzd.createQuiz(new Quiz("1, 2, 3, 4, 5", udi.getUserById(7))));
				
		//qzd.deleteQuizById(1);
		System.out.println(qzd.getQuizByQuizId(2));
	}

}
