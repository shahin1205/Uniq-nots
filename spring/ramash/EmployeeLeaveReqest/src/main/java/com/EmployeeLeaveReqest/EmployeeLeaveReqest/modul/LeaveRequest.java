package com.EmployeeLeaveReqest.EmployeeLeaveReqest.modul;
 enum LeaveStats{
    APPROVED,
    REJECT,
    BENDING
        }

public class LeaveRequest {
    private int leaveId;
    private String leaveReason;
    private LeaveStats status;
    private int leaveDays;

    public LeaveRequest() {
    }

    public LeaveStats getStatus() {
        return status;
    }

    public void setStatus(LeaveStats status) {
        this.status = status;
    }

    public int getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(int leaveId) {
        this.leaveId = leaveId;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }


    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
