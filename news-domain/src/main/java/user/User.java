package user;

import java.time.LocalDate;
import java.util.UUID;

import account.Account;

public class User {

	private UUID id;
	private String email;
	private boolean active;
	private String username;
	private String password;
	private Account account;
	private LocalDate createdAt;
	private LocalDate updatedAt;

	private User(
			UUID id,
			String email,
			boolean active,
			String username,
			String password,
			LocalDate createdAt
	) {
		this.id = id;
		this.email = email;
		this.active = active;
		this.username = username;
		this.password = password;
		this.createdAt = createdAt;
	}

	public static User newInstance(UUID id, String email, boolean active, String username, String password,
			LocalDate createdAt) {
		return new User( id, email, active, username, password, LocalDate.now() );
	}

	public boolean isActive() {
		return this.active;
	}

}
