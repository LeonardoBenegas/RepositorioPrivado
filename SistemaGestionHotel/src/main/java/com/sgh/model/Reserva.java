package com.sgh.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="RESERVA")
public class Reserva {
	
	private int reserva;
	private int habitacion;
	private int idcliente;
	private int idtrabajor;
	private String tipoReserva;
	private Date fechaReserva;
	private Date fechaIngresa;
	private Date fechaSalida;
	private float costoAlojamiento;
	private String estado;
	public int getReserva() {
		return reserva;
	}
	public void setReserva(int reserva) {
		this.reserva = reserva;
	}
	public int getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getIdtrabajor() {
		return idtrabajor;
	}
	public void setIdtrabajor(int idtrabajor) {
		this.idtrabajor = idtrabajor;
	}
	public String getTipoReserva() {
		return tipoReserva;
	}
	public void setTipoReserva(String tipoReserva) {
		this.tipoReserva = tipoReserva;
	}
	public Date getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public Date getFechaIngresa() {
		return fechaIngresa;
	}
	public void setFechaIngresa(Date fechaIngresa) {
		this.fechaIngresa = fechaIngresa;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public float getCostoAlojamiento() {
		return costoAlojamiento;
	}
	public void setCostoAlojamiento(float costoAlojamiento) {
		this.costoAlojamiento = costoAlojamiento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
