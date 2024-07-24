package com.example.vega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VegaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VegaApplication.class, args);
	}
	@Entity
	@Table(name = "vegaprueba") // Nombre de la tabla en la base de datos
	public class vegaprueba {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "IDperson") // Nombre de la columna para la clave primaria
		private Integer id;

		@Column(name = "Name")
		private String name;

		@Column(name = "Last_Name")
		private String last_Name;

		@Column(name = "Age")
		private String age;

		// Constructores, getters y setters

		// Constructor vacío (necesario para JPA)
		public Usuario() {
		}

		// Constructor con parámetros
		public 	vegaprueba(String name, String last_Name, String age) {
			this.Name = name;
			this.last_Name = last_Name;
			this.age=age;
		}

		// Getters y setters
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLast_Name() {
			return last_Name;
		}

		public void setLast_Name(String last_Name) {
			this.last_Name = last_Name;
		}

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}
	}
}
