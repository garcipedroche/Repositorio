package tresEnRaya;

public class Ficha {
	private char tipoFicha;

	Ficha(char tipoFicha) {
		this.tipoFicha = tipoFicha;
	}
	
	public void setTipoFicha(char tipoFicha) {
		this.tipoFicha = tipoFicha;
	}

	public char getTipoFicha() {
		return tipoFicha;
	}
}