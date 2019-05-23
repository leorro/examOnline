package com.zh.pojo;

public class Question {
	/**问题编号*/
	private Integer questionId;
	/**问题名称*/
	private String quesName;
	/**选项A*/
	private String optionA;
	/**选项B*/
	private String optionB;
	/**选项C*/
	private String optionC;
	/**选项D*/
	private String optionD;
	/**标准答案*/
	private String answer;
	/**学生答案*/
	private String userAnswer;
	/**对应课程*/
	private Integer courseId;
	/**题型*/
	private Integer typeId;
	/**难度（0：容易，1：中等，2：难）*/
	private int difficulty;
	/**备注*/
	private String remark;
	private String answerDetail;
	private String gradeId;
	private String testPointId;
	private Course course;
	private Type type;

	//记录错误的次数
	private Integer wrongCount;
	//记录该题目被选上的次数
	private Integer selectedCount;

	public Integer getWrongCount() {
		return wrongCount;
	}

	public void setWrongCount(Integer wrongCount) {
		this.wrongCount = wrongCount;
	}

	public Integer getSelectedCount() {
		return selectedCount;
	}

	public void setSelectedCount(Integer selectedCount) {
		this.selectedCount = selectedCount;
	}

	public String getTestPointId() {
		return testPointId;
	}

	public void setTestPointId(String testPointId) {
		this.testPointId = testPointId;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}



	public String getQuesName() {
		return quesName;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public void setQuesName(String quesName) {
		this.quesName = quesName;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getUserAnswer() {
		return userAnswer;
	}
	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAnswerDetail() {
		return answerDetail;
	}
	public void setAnswerDetail(String answerDetail) {
		this.answerDetail = answerDetail;
	}
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	public Question() {
		
	}
	public Question(int questionId, String quesName, String optionA,
			String optionB, String optionC, String optionD, String answer,
			String userAnswer, Integer courseId, Integer typeId, int difficulty,
			String remark, String answerDetail, String gradeId) {
		super();
		this.questionId = questionId;
		this.quesName = quesName;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
		this.userAnswer = userAnswer;
		this.courseId = courseId;
		this.typeId = typeId;
		this.difficulty = difficulty;
		this.remark = remark;
		this.answerDetail = answerDetail;
		this.gradeId = gradeId;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", quesName=" + quesName
				+ ", optionA=" + optionA + ", optionB=" + optionB
				+ ", optionC=" + optionC + ", optionD=" + optionD + ", answer="
				+ answer + ", userAnswer=" + userAnswer + ", courseId="
				+ courseId + ", typeId=" + typeId + ", difficulty="
				+ difficulty + ", remark=" + remark + ", answerDetail="
				+ answerDetail + ", gradeId=" + gradeId + "]";
	}
}
