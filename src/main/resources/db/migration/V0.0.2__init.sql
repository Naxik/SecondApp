CREATE SEQUENCE celestial_objects_id_seq;
CREATE SEQUENCE celestial_objects_category_id_seq;

CREATE TABLE celestial_objects (
  id          BIGINT       NOT NULL PRIMARY KEY,
  title       VARCHAR(200) NOT NULL DEFAULT 'CELESTIAL OBJECT',
  category_id BIGINT       NULL
);

CREATE TABLE celestial_object_category (
  id    BIGINT       NOT NULL PRIMARY KEY,
  title VARCHAR(200) NOT NULL DEFAULT 'CELESTIAL OBJECT CATEGORY'
);

ALTER TABLE celestial_objects
  ADD CONSTRAINT celestial_objects_category_id_fk FOREIGN KEY (category_id) REFERENCES celestial_object_category (id);