package com.springboot.license.manager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.springboot.license.manager.model.audit.Auditable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "app_software_customer", joinColumns = {
			@JoinColumn(name = "softwareid", referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(name = "customerid", referencedColumnName = "ID") })
	private List<AppCustomer> customers = new ArrayList<>();

}
