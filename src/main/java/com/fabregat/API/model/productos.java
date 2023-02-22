
package com.fabregat.API.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author davidfabfer
 */
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Productos {
  @Id @GeneratedValue
  private Integer id;  
  private String nombre;
  private float precio;
}
