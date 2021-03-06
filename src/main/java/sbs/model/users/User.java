package sbs.model.users;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import sbs.model.bhptickets.BhpTicket;
import sbs.model.hruafiles.HrUaInfo;
import sbs.model.qualitysurveys.QualitySurvey;

@Entity
@Table(name = "users")
public class User {
    private Long id;
    private boolean active;
    private String username;
    private String name;
    private String email;
    private String password;
    private String avatarfilename;
    private Set<Role> roles;
    private Set<QualitySurvey> qualitySurveys;
    private Set<BhpTicket> createdBhpTickets;
    private Set<BhpTicket> assignedBhpTickets;
    private Set<HrUaInfo> HrUaFilesCreated;
    
    public User() {
		this.roles = new HashSet<>();
		this.qualitySurveys = new HashSet<>();
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

	public void setId(Long id) {
        this.id = id;
    }

    @NotEmpty
    @Size(min = 2, max = 25)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @NotEmpty
    @Size(min = 2, max = 50)
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@NotEmpty
	@Email
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    @ManyToMany(mappedBy = "users", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    public Set<Role> getRoles() {
        return roles;
    }
    
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", roles=" + roles + "]";
	}

	public String getAvatarfilename() {
		return avatarfilename;
	}

	public void setAvatarfilename(String avatarFileName) {
		this.avatarfilename = avatarFileName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<QualitySurvey> getQualitySurveys() {
		return qualitySurveys;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "creator")
	public Set<BhpTicket> getCreatedBhpTickets() {
		return createdBhpTickets;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assignedUser")
	public Set<BhpTicket> getAssignedBhpTickets() {
		return assignedBhpTickets;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "creator")
	public Set<HrUaInfo> getHrUaFilesCreated() {
		return HrUaFilesCreated;
	}
	
	public void setCreatedBhpTickets(Set<BhpTicket> createdBhpTickets) {
		this.createdBhpTickets = createdBhpTickets;
	}

	public void setAssignedBhpTickets(Set<BhpTicket> assignedBhpTickets) {
		this.assignedBhpTickets = assignedBhpTickets;
	}

	public void setQualitySurveys(Set<QualitySurvey> qualitySurveys) {
		this.qualitySurveys = qualitySurveys;
	}

	public void setHrUaFilesCreated(Set<HrUaInfo> hrUaFilesCreated) {
		HrUaFilesCreated = hrUaFilesCreated;
	}
	
	
	
	

}