package model.entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Seller implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private Date dataDeNascimento;
	private double salarioBase;

	private Department department;
	
	public Seller() {}

	public Seller(Integer id, String name, String email, Date dataDeNascimento, double salarioBase,
			Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
		this.salarioBase = salarioBase;
		this.department = department;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataDeNascimento == null) ? 0 : dataDeNascimento.hashCode());
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
		Seller other = (Seller) obj;
		if (dataDeNascimento == null) {
			if (other.dataDeNascimento != null)
				return false;
		} else if (!dataDeNascimento.equals(other.dataDeNascimento))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", dataDeNascimento=" + dataDeNascimento
				+ ", salarioBase=" + salarioBase + ", department=" + department + "]";
	}
	
	
}
