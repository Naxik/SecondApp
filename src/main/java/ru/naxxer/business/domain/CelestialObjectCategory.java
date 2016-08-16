package ru.naxxer.business.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

/**
 * @author naxxer
 *         date: 04.07.16.
 */
@Getter
@Setter
@Entity
@Table
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CelestialObjectCategory {
	@Id
	@Column
	@GeneratedValue(generator = "seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq", sequenceName = "celestial_objects_category_id_seq", allocationSize = 1)
	private Long id;

	@Column
	private String title;
}
