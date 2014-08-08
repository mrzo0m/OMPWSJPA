/**
 *
 */
package com.epam.training.persistence.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

//import org.apache.bval.constraints.Email;

/**
 * @author Oleg_Burshinov
 */
@Component
@Entity
@Table(name = "USERS", schema = "OMPTEST", catalog = "")
public class UserEntity implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -1360172948486494551L;


    /**
     *
     */
    public UserEntity() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @param fullName
     * @param billingAddress
     * @param login
     * @param password
     * @param email
     */
    public UserEntity(String fullName, String billingAddress,
                      String login, String password, String email) {
        super();
        this.fullName = fullName;
        this.billingAddress = billingAddress;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    /**
     * @param login
     * @param password
     */
    public UserEntity(String login, String password) {
        this.login = login;
        this.password = password;
    }

    /**
     * UserID
     */
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "USR_ID_G")
    @SequenceGenerator(name = "USR_ID_G", sequenceName = "USR_ID_GEN")
    private Integer userId;
    /**
     * UserEntity name
     */
    @NotNull
    @Basic
    @Column(name = "FULL_NAME")
    private String fullName;
    /**
     * Where user live
     */
    @NotNull
    @Size(min = 4, max = 25)
    @Basic
    @Column(name = "BILLING_ADDRESS")
    private String billingAddress;
    /**
     * LOGIN
     */
    @NotNull
    @Size(min = 3, max = 25)
    @Basic
    @Column(name = "LOGIN")
    private String login;
    /**
     * PASSWORD
     */
    @NotNull
    @Size(min = 6, max = 25)
    @Basic
    @Column(name = "PASSWORD")
    private String password;
    /**
     * E-MAIL
     */
    @NotNull
//    @Email
    @Basic
    @Column(name = "EMAIL")
    private String email;
    /**
     * phone
     */
    private String phone;

    @NotNull
    @Size(min = 6, max = 25)
    @Transient
    private String confirmPassword;


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((billingAddress == null) ? 0 : billingAddress.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result
                + ((fullName == null) ? 0 : fullName.hashCode());
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        result = prime * result
                + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof UserEntity)) {
            return false;
        }
        UserEntity other = (UserEntity) obj;
        if (billingAddress == null) {
            if (other.billingAddress != null) {
                return false;
            }
        } else if (!billingAddress.equals(other.billingAddress)) {
            return false;
        }
        if (email == null) {
            if (other.email != null) {
                return false;
            }
        } else if (!email.equals(other.email)) {
            return false;
        }
        if (fullName == null) {
            if (other.fullName != null) {
                return false;
            }
        } else if (!fullName.equals(other.fullName)) {
            return false;
        }
        if (login == null) {
            if (other.login != null) {
                return false;
            }
        } else if (!login.equals(other.login)) {
            return false;
        }
        if (password == null) {
            if (other.password != null) {
                return false;
            }
        } else if (!password.equals(other.password)) {
            return false;
        }
        if (userId == null) {
            if (other.userId != null) {
                return false;
            }
        } else if (!userId.equals(other.userId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserEntity ["
                + (billingAddress != null ? "billingAddress=" + billingAddress
                + ", " : "")
                + (email != null ? "email=" + email + ", " : "")
                + (fullName != null ? "fullName=" + fullName + ", " : "")
                + (login != null ? "login=" + login + ", " : "")
                + (password != null ? "password=" + password + ", " : "")
                + (userId != null ? "userId=" + userId : "") + "]";
    }

    /**
     * @return the userId
     */
    @JsonIgnore
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return the fullName
     */
    @JsonProperty
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the billingAddress
     */
    @JsonProperty
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * @param billingAddress the billingAddress to set
     */
    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * @return the login
     */
    @JsonProperty
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the password
     */
    @JsonProperty
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    @JsonProperty
    public String getEmail() {
        return email;
    }

    /**
     * @param emali the email to set
     */
    public void setEmail(String emali) {
        this.email = emali;
    }

    /**
     * @return phone
     */
    @JsonProperty
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone phones
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }


}
