package com.prismamp.voucher;

public class VoucherResult {

	public String getServicio() {
		return Servicio;
	}
	public void setServicio(String servicio) {
		Servicio = servicio;
	}
	public String getCUIT() {
		return CUIT;
	}
	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public String getFechaHora() {
		return FechaHora;
	}
	public void setFechaHora(String fechaHora) {
		FechaHora = fechaHora;
	}
	public byte[] getBytesArchivo() {
		return BytesArchivo;
	}
	public void setBytesArchivo(byte[] bytesArchivo) {
		BytesArchivo = bytesArchivo;
	}
	public String getNombreArchivo() {
		return NombreArchivo;
	}
	public void setNombreArchivo(String nombreArchivo) {
		NombreArchivo = nombreArchivo;
	}
	public String getPuntoVenta() {
		return PuntoVenta;
	}
	public void setPuntoVenta(String puntoVenta) {
		PuntoVenta = puntoVenta;
	}
	public String getTipoComprobanteAFIP() {
		return TipoComprobanteAFIP;
	}
	public void setTipoComprobanteAFIP(String tipoComprobanteAFIP) {
		TipoComprobanteAFIP = tipoComprobanteAFIP;
	}
	public String getTipoComprobanteDesc() {
		return TipoComprobanteDesc;
	}
	public void setTipoComprobanteDesc(String tipoComprobanteDesc) {
		TipoComprobanteDesc = tipoComprobanteDesc;
	}
	public String getNroComprobante() {
		return NroComprobante;
	}
	public void setNroComprobante(String nroComprobante) {
		NroComprobante = nroComprobante;
	}
	public String getCodigoAutorizacion() {
		return CodigoAutorizacion;
	}
	public void setCodigoAutorizacion(String codigoAutorizacion) {
		CodigoAutorizacion = codigoAutorizacion;
	}
	public String getFechaVencimientoCA() {
		return FechaVencimientoCA;
	}
	public void setFechaVencimientoCA(String fechaVencimientoCA) {
		FechaVencimientoCA = fechaVencimientoCA;
	}
	public String getResultado() {
		return Resultado;
	}
	public void setResultado(String resultado) {
		Resultado = resultado;
	}
	public String getObservacion() {
		return Observacion;
	}
	public void setObservacion(String observacion) {
		Observacion = observacion;
	}
	private String Servicio;
	private String CUIT;
	private String Tipo;
	private String FechaHora;
	private byte[] BytesArchivo;
	private String NombreArchivo;
	private String PuntoVenta;
	private String TipoComprobanteAFIP;
	private String TipoComprobanteDesc;
	private String NroComprobante;
	private String CodigoAutorizacion;
	private String FechaVencimientoCA;
	private String Resultado;
	private String Observacion;
}
