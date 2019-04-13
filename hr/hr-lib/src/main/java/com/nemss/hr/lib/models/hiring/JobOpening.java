package com.nemss.hr.lib.models.hiring;

import com.nemss.hr.lib.models.BaseEntity;
import com.nemss.hr.lib.models.Role;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Entity
@Table(name = "job_opening")
public class JobOpening extends BaseEntity {

    @NotNull
    private Role role;

    @ColumnDefault("0")
    private boolean expired;

    private Map<Integer, Interview> interviewFlow;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Map<Integer, Interview> getInterviewFlow() {
        return interviewFlow;
    }

    public void setInterviewFlow(Map<Integer, Interview> interviewFlow) {
        this.interviewFlow = interviewFlow;
    }
}
