package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas.
 * Permite gestionar el saldo, realizar ingresos y retiradas.
 * * @author josé ángel baselga
 * @version 1.0
 */
public class CCuenta {
	/** Nombre del titular de la cuenta */
    private String nombre;
    /** IBAN identificador de la cuenta */
    private String cuenta;
    /** Saldo actual en la cuenta */
    private double saldo;
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Nos devuelve el tipo de interés.
     * @return tipoInterés
     */
    private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Nos pemite establecer el tipo de interes
	 * @param tipoInterés que vamos a poner en la cuenta
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Nos devuelve el saldo de la cuenta
	 * @return saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo de la cuenta
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Nos devuelve el IBAN de la cuenta
	 * @return cuenta (IBAN)
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el número (IBAN) de la cuenta
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el nombre del titular de la cuenta
	 * @return nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Estable el nombre del titular de la cuenta
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Constructor por defecto
	 * no hace nada
	 */
	public CCuenta()
    {
    }

    /**
     * Constructor con parametros
     * Estblece los correspondientes datos de la cuenta
     * Como el nombre, número de cuenta, saldo.
     * Con el interés no hace nada
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Nos devuelve el valor actual del {@link saldo}
     * 
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Este método nos permite realiar un ingreso de dinero
     * en la cuenta
     * 
     * @see retirar
     * 
     * @param cantidad Es la cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Este método nos permite retirar una cantidad de dinero de la cuenta
     * 
     * @see ingresar
     * 
     * @param cantidad Es la cantidad a retirar
     * @throws Exception Si no hay suficiente dinerop en la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
