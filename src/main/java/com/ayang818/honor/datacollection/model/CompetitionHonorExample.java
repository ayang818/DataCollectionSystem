package com.ayang818.honor.datacollection.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompetitionHonorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public CompetitionHonorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberIsNull() {
            addCriterion("school_number is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberIsNotNull() {
            addCriterion("school_number is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberEqualTo(Integer value) {
            addCriterion("school_number =", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberNotEqualTo(Integer value) {
            addCriterion("school_number <>", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberGreaterThan(Integer value) {
            addCriterion("school_number >", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_number >=", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberLessThan(Integer value) {
            addCriterion("school_number <", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberLessThanOrEqualTo(Integer value) {
            addCriterion("school_number <=", value, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberIn(List<Integer> values) {
            addCriterion("school_number in", values, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberNotIn(List<Integer> values) {
            addCriterion("school_number not in", values, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberBetween(Integer value1, Integer value2) {
            addCriterion("school_number between", value1, value2, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andSchoolNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("school_number not between", value1, value2, "schoolNumber");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIsNull() {
            addCriterion("competition_level is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIsNotNull() {
            addCriterion("competition_level is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelEqualTo(String value) {
            addCriterion("competition_level =", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotEqualTo(String value) {
            addCriterion("competition_level <>", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelGreaterThan(String value) {
            addCriterion("competition_level >", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("competition_level >=", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelLessThan(String value) {
            addCriterion("competition_level <", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelLessThanOrEqualTo(String value) {
            addCriterion("competition_level <=", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelLike(String value) {
            addCriterion("competition_level like", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotLike(String value) {
            addCriterion("competition_level not like", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIn(List<String> values) {
            addCriterion("competition_level in", values, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotIn(List<String> values) {
            addCriterion("competition_level not in", values, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelBetween(String value1, String value2) {
            addCriterion("competition_level between", value1, value2, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotBetween(String value1, String value2) {
            addCriterion("competition_level not between", value1, value2, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameIsNull() {
            addCriterion("competition_name is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameIsNotNull() {
            addCriterion("competition_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameEqualTo(String value) {
            addCriterion("competition_name =", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameNotEqualTo(String value) {
            addCriterion("competition_name <>", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameGreaterThan(String value) {
            addCriterion("competition_name >", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameGreaterThanOrEqualTo(String value) {
            addCriterion("competition_name >=", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameLessThan(String value) {
            addCriterion("competition_name <", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameLessThanOrEqualTo(String value) {
            addCriterion("competition_name <=", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameLike(String value) {
            addCriterion("competition_name like", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameNotLike(String value) {
            addCriterion("competition_name not like", value, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameIn(List<String> values) {
            addCriterion("competition_name in", values, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameNotIn(List<String> values) {
            addCriterion("competition_name not in", values, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameBetween(String value1, String value2) {
            addCriterion("competition_name between", value1, value2, "competitionName");
            return (Criteria) this;
        }

        public Criteria andCompetitionNameNotBetween(String value1, String value2) {
            addCriterion("competition_name not between", value1, value2, "competitionName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Long value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Long value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Long value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Long value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Long value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Long> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Long> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Long value1, Long value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Long value1, Long value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andHonorLevelIsNull() {
            addCriterion("honor_level is null");
            return (Criteria) this;
        }

        public Criteria andHonorLevelIsNotNull() {
            addCriterion("honor_level is not null");
            return (Criteria) this;
        }

        public Criteria andHonorLevelEqualTo(String value) {
            addCriterion("honor_level =", value, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelNotEqualTo(String value) {
            addCriterion("honor_level <>", value, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelGreaterThan(String value) {
            addCriterion("honor_level >", value, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelGreaterThanOrEqualTo(String value) {
            addCriterion("honor_level >=", value, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelLessThan(String value) {
            addCriterion("honor_level <", value, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelLessThanOrEqualTo(String value) {
            addCriterion("honor_level <=", value, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelLike(String value) {
            addCriterion("honor_level like", value, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelNotLike(String value) {
            addCriterion("honor_level not like", value, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelIn(List<String> values) {
            addCriterion("honor_level in", values, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelNotIn(List<String> values) {
            addCriterion("honor_level not in", values, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelBetween(String value1, String value2) {
            addCriterion("honor_level between", value1, value2, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andHonorLevelNotBetween(String value1, String value2) {
            addCriterion("honor_level not between", value1, value2, "honorLevel");
            return (Criteria) this;
        }

        public Criteria andProveIsNull() {
            addCriterion("prove is null");
            return (Criteria) this;
        }

        public Criteria andProveIsNotNull() {
            addCriterion("prove is not null");
            return (Criteria) this;
        }

        public Criteria andProveEqualTo(String value) {
            addCriterion("prove =", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveNotEqualTo(String value) {
            addCriterion("prove <>", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveGreaterThan(String value) {
            addCriterion("prove >", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveGreaterThanOrEqualTo(String value) {
            addCriterion("prove >=", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveLessThan(String value) {
            addCriterion("prove <", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveLessThanOrEqualTo(String value) {
            addCriterion("prove <=", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveLike(String value) {
            addCriterion("prove like", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveNotLike(String value) {
            addCriterion("prove not like", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveIn(List<String> values) {
            addCriterion("prove in", values, "prove");
            return (Criteria) this;
        }

        public Criteria andProveNotIn(List<String> values) {
            addCriterion("prove not in", values, "prove");
            return (Criteria) this;
        }

        public Criteria andProveBetween(String value1, String value2) {
            addCriterion("prove between", value1, value2, "prove");
            return (Criteria) this;
        }

        public Criteria andProveNotBetween(String value1, String value2) {
            addCriterion("prove not between", value1, value2, "prove");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(Byte value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(Byte value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(Byte value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(Byte value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(Byte value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(Byte value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<Byte> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<Byte> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(Byte value1, Byte value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(Byte value1, Byte value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table competition_honor
     *
     * @mbg.generated do_not_delete_during_merge Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table competition_honor
     *
     * @mbg.generated Fri Oct 25 14:31:57 GMT+08:00 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}