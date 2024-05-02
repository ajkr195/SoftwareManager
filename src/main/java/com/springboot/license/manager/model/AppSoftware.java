package com.springboot.license.manager.model;

import java.io.Serializable;

import com.springboot.license.manager.model.audit.Auditable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "AppSoftware")
@Table(name = "app_software")

public class AppSoftware extends Auditable<String> implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "softwarename", nullable = false)
	private String softwarename;

	@Column(name = "softwareprovider", nullable = false)
	private String softwareprovider;

	@Column(name = "softwareprovidercontactemail", nullable = false) //, unique = true
	private String softwareprovidercontactemail;

}
