package models;

import java.util.List;

public class Producto {
  private String nombre;
  private String codigo;
  private int[] precios;

  public Producto(String nombre, String codigo, List<Double> precios) {
    this.nombre = nombre;
    this.codigo = codigo;
    this.precios = precios;
  }

  public String getNombre() {
    return nombre;
  }

  public String getCodigo() {
    return codigo;
  }

  public int[] getPrecios() {
    return precios;
  }

  @Override
  public String toString() {
    return "Producto [nombre=" + nombre + ", codigo=" + codigo + ", precios=" + precios + "]";
  }

  public static void porcentajeCaracteresUnidos() {
    int carcteres = 0;
    getNombre.IgnoreCase();
    
  }

  public static void cantidadPreciosRepetidos() {
    int repetidos = 0;
    if (getPrecios.CompareTo) {
      repetidos = repetidos + 1;
    }
  }
}
