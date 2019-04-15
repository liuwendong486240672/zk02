package com.bawei.entity;

import java.io.Serializable;

public class Crimi  implements Serializable{
	private Integer id;
	private String name;
	private String card;
	private int age;
	private String sex;
	private String descs;
	@Override
	public String toString() {
		return "Crimi [id=" + id + ", name=" + name + ", card=" + card + ", age=" + age + ", sex=" + sex + ", descs="
				+ descs + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDescs() {
		return descs;
	}
	public void setDescs(String descs) {
		this.descs = descs;
	}
	public Crimi(Integer id, String name, String card, int age, String sex, String descs) {
		super();
		this.id = id;
		this.name = name;
		this.card = card;
		this.age = age;
		this.sex = sex;
		this.descs = descs;
	}
	public Crimi() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((card == null) ? 0 : card.hashCode());
		result = prime * result + ((descs == null) ? 0 : descs.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Crimi other = (Crimi) obj;
		if (age != other.age)
			return false;
		if (card == null) {
			if (other.card != null)
				return false;
		} else if (!card.equals(other.card))
			return false;
		if (descs == null) {
			if (other.descs != null)
				return false;
		} else if (!descs.equals(other.descs))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
}
