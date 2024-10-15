package CH36.Domain.Common.DTO;

public class SessionDTO {
	private int sessionId;
	private String username;
	private String role;
	
	//  디폴트 생성자
	public SessionDTO() {}	
	
	//	모든인자 생성자
	public SessionDTO(int sessionId, String username, String role) {
		super();
		this.sessionId = sessionId;
		this.username = username;
		this.role = role;
	}
	
	//	Getter and Setter

	public int getSessionId() {
		return sessionId;
	}
	
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	//  toString
	
	@Override
	public String toString() {
		return "SessionDTO [sessionId=" + sessionId + ", username=" + username + ", role=" + role + "]";
	}

	
}
