package net.suncaper.hotel_manager.domain;

public class H_User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.u_id
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    private Integer uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.u_nickName
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    private String uNickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.u_name
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    private String uName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.u_account
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    private String uAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.u_password
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    private String uPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.u_tel
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    private String uTel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.u_email
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    private String uEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column h_user.u_idNumber
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    private String uIdnumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.u_id
     *
     * @return the value of h_user.u_id
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.u_id
     *
     * @param uId the value for h_user.u_id
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.u_nickName
     *
     * @return the value of h_user.u_nickName
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public String getuNickname() {
        return uNickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.u_nickName
     *
     * @param uNickname the value for h_user.u_nickName
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.u_name
     *
     * @return the value of h_user.u_name
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public String getuName() {
        return uName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.u_name
     *
     * @param uName the value for h_user.u_name
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.u_account
     *
     * @return the value of h_user.u_account
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public String getuAccount() {
        return uAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.u_account
     *
     * @param uAccount the value for h_user.u_account
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setuAccount(String uAccount) {
        this.uAccount = uAccount == null ? null : uAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.u_password
     *
     * @return the value of h_user.u_password
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.u_password
     *
     * @param uPassword the value for h_user.u_password
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.u_tel
     *
     * @return the value of h_user.u_tel
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public String getuTel() {
        return uTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.u_tel
     *
     * @param uTel the value for h_user.u_tel
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setuTel(String uTel) {
        this.uTel = uTel == null ? null : uTel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.u_email
     *
     * @return the value of h_user.u_email
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public String getuEmail() {
        return uEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.u_email
     *
     * @param uEmail the value for h_user.u_email
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column h_user.u_idNumber
     *
     * @return the value of h_user.u_idNumber
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public String getuIdnumber() {
        return uIdnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column h_user.u_idNumber
     *
     * @param uIdnumber the value for h_user.u_idNumber
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    public void setuIdnumber(String uIdnumber) {
        this.uIdnumber = uIdnumber == null ? null : uIdnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        H_User other = (H_User) that;
        return (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
            && (this.getuNickname() == null ? other.getuNickname() == null : this.getuNickname().equals(other.getuNickname()))
            && (this.getuName() == null ? other.getuName() == null : this.getuName().equals(other.getuName()))
            && (this.getuAccount() == null ? other.getuAccount() == null : this.getuAccount().equals(other.getuAccount()))
            && (this.getuPassword() == null ? other.getuPassword() == null : this.getuPassword().equals(other.getuPassword()))
            && (this.getuTel() == null ? other.getuTel() == null : this.getuTel().equals(other.getuTel()))
            && (this.getuEmail() == null ? other.getuEmail() == null : this.getuEmail().equals(other.getuEmail()))
            && (this.getuIdnumber() == null ? other.getuIdnumber() == null : this.getuIdnumber().equals(other.getuIdnumber()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        result = prime * result + ((getuNickname() == null) ? 0 : getuNickname().hashCode());
        result = prime * result + ((getuName() == null) ? 0 : getuName().hashCode());
        result = prime * result + ((getuAccount() == null) ? 0 : getuAccount().hashCode());
        result = prime * result + ((getuPassword() == null) ? 0 : getuPassword().hashCode());
        result = prime * result + ((getuTel() == null) ? 0 : getuTel().hashCode());
        result = prime * result + ((getuEmail() == null) ? 0 : getuEmail().hashCode());
        result = prime * result + ((getuIdnumber() == null) ? 0 : getuIdnumber().hashCode());
        return result;
    }
}