package pe.lib.libreria;

public class Libro {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + intAutor;
		result = prime * result + intIdLibro;
		result = prime * result + ((strAutor == null) ? 0 : strAutor.hashCode());
		result = prime * result + ((strClaBib == null) ? 0 : strClaBib.hashCode());
		result = prime * result + ((strDescri == null) ? 0 : strDescri.hashCode());
		result = prime * result + ((strFecPub == null) ? 0 : strFecPub.hashCode());
		result = prime * result + ((strTitulo == null) ? 0 : strTitulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (intAutor != other.intAutor)
			return false;
		if (intIdLibro != other.intIdLibro)
			return false;
		if (strAutor == null) {
			if (other.strAutor != null)
				return false;
		} else if (!strAutor.equals(other.strAutor))
			return false;
		if (strClaBib == null) {
			if (other.strClaBib != null)
				return false;
		} else if (!strClaBib.equals(other.strClaBib))
			return false;
		if (strDescri == null) {
			if (other.strDescri != null)
				return false;
		} else if (!strDescri.equals(other.strDescri))
			return false;
		if (strFecPub == null) {
			if (other.strFecPub != null)
				return false;
		} else if (!strFecPub.equals(other.strFecPub))
			return false;
		if (strTitulo == null) {
			if (other.strTitulo != null)
				return false;
		} else if (!strTitulo.equals(other.strTitulo))
			return false;
		return true;
	}
	public int getIntIdLibro() {
		return intIdLibro;
	}
	public void setIntIdLibro(int intIdLibro) {
		this.intIdLibro = intIdLibro;
	}
	public int getIntAutor() {
		return intAutor;
	}
	public void setIntAutor(int intAutor) {
		this.intAutor = intAutor;
	}
	public String getStrTitulo() {
		return strTitulo;
	}
	public void setStrTitulo(String strTitulo) {
		this.strTitulo = strTitulo;
	}
	public String getStrAutor() {
		return strAutor;
	}
	public void setStrAutor(String strAutor) {
		this.strAutor = strAutor;
	}
	public String getStrClaBib() {
		return strClaBib;
	}
	public void setStrClaBib(String strClaBib) {
		this.strClaBib = strClaBib;
	}
	public String getStrFecPub() {
		return strFecPub;
	}
	public void setStrFecPub(String strFecPub) {
		this.strFecPub = strFecPub;
	}
	public String getStrDescri() {
		return strDescri;
	}
	public void setStrDescri(String strDescri) {
		this.strDescri = strDescri;
	}
	private int intIdLibro;
	private int intAutor;
	private String strTitulo;
	private String strAutor;
	private String strClaBib;
	private String strFecPub;
	private String strDescri;
	
}
