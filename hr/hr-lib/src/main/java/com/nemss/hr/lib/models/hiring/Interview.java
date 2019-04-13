package com.nemss.hr.lib.models.hiring;

import com.nemss.hr.lib.enums.InterviewType;
import com.nemss.hr.lib.models.people.Applicant;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "interview")
public class Interview {

    @NotNull
    private InterviewType interviewType;

    private Applicant applicant;

    private String interviewer;

    public InterviewType getInterviewType() {
        return interviewType;
    }

    public void setInterviewType(InterviewType interviewType) {
        this.interviewType = interviewType;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public String getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer;
    }
}
