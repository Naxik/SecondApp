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
@Table(name = "celestial_objects")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CelestialObject {
	@Id
	@Column
	@GeneratedValue(generator = "seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq", sequenceName = "celestial_objects_id_seq", allocationSize = 1)
	private Long id;

	@Column
	private String title;

	@OneToOne
	@JoinColumn(name = "category_id")
	private CelestialObjectCategory category;
}
