//package com.example.graphql.model;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
//
//@MappedSuperclass
//
//public abstract class BaseEntity {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	protected Long id;
//
//	public BaseEntity() {
//		super();
//	}
//
//	public BaseEntity(Long id) {
//		super();
//		this.id = id;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	@Override
//	public String toString() {
//		return "BaseEntity [id=" + id + "]";
//	}
//
//}
