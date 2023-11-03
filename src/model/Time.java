package model;

public class Time {
	private String from;
	private String to;
	private String prono;
	private String icono;
	private String preci;
	private String max;
	private String min;
	public Time() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Time(String from, String to, String prono, String icono, String preci, String max, String min) {
		super();
		this.from = from;
		this.to = to;
		this.prono = prono;
		this.icono = icono;
		this.preci = preci;
		this.max = max;
		this.min = min;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getProno() {
		return prono;
	}
	public void setProno(String prono) {
		this.prono = prono;
	}
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}
	public String getPreci() {
		return preci;
	}
	public void setPreci(String preci) {
		this.preci = preci;
	}
	public String getMax() {
		return max;
	}
	public void setMax(String max) {
		this.max = max;
	}
	public String getMin() {
		return min;
	}
	public void setMin(String min) {
		this.min = min;
	}
	@Override
	public String toString() {
		return "Dia [from=" + from + ", to=" + to + ", prono=" + prono + ", icono=" + icono + ", preci=" + preci
				+ ", max=" + max + ", min=" + min + "]";
	}
	
}
