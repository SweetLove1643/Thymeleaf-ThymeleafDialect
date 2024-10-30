package vn.sweetlove.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "categories")
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryId")
	private int categoryId;
	
	@Column(name = "CategoryName", columnDefinition = "NVARCHAR(200) NOT NULL")
	private String name;
	
	@Column(name = "Images", columnDefinition = "NVARCHAR(MAX) NULL")
	private String images;
	
	@Column(name = "Status")
	private int status;
	
	
}
