package com.travelagent.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "staffs")
public class Staff implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 255)
	private String fullname;

	@Column(name = "phone_number", nullable = false, length = 20)
	private String phoneNumber;

	@Column
	private Boolean enabled;

	@Column(nullable = false, length = 255)
	private String email;

	@Column(nullable = false, length = 64)
	private String password;

	@Column(nullable = false, length = 255)
	private String photo;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable( //
			name = "staffs_roles", //
			joinColumns = @JoinColumn(name = "staff_id"), //
			inverseJoinColumns = @JoinColumn(name = "role_id") //
	)
	private List<Role> roles = new ArrayList<>();

}
