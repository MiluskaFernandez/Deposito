package cuentas;

/**
 * Clase que representa una cuenta bancaria con métodos de ingreso y retiro.
 */
public class CCuenta {
    
    /** Nombre del titular de la cuenta */
    private String nombre;
    
    /** Número de cuenta */
    private String cuenta;
    
    /** Saldo actual de la cuenta */
    private double saldo;
    
    /** Tipo de interés aplicado a la cuenta */
    private double tipoInterés;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {}

    /**
     * Constructor con parámetros.
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return Nombre del titular
     */
    public String getNombre() { return nombre; }

    /**
     * Establece el nombre del titular de la cuenta.
     * @param nombre Nombre del titular
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Obtiene el número de cuenta.
     * @return Número de cuenta
     */
    public String getCuenta() { return cuenta; }

    /**
     * Establece el número de cuenta.
     * @param cuenta Número de cuenta
     */
    public void setCuenta(String cuenta) { this.cuenta = cuenta; }

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return Saldo actual
     */
    public double getSaldo() { return saldo; }

    /**
     * Establece el saldo de la cuenta.
     * @param saldo Nuevo saldo
     */
    public void setSaldo(double saldo) { this.saldo = saldo; }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * @return Tipo de interés
     */
    public double getTipoInteres() { return tipoInterés; }

    /**
     * Establece el tipo de interés de la cuenta.
     * @param tipoInteres Nuevo tipo de interés
     */
    public void setTipoInteres(double tipoInteres) { this.tipoInterés = tipoInteres; }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return Saldo actual
     */
    public double estado() { return saldo; }

    /**
     * Ingresa una cantidad en la cuenta.
     * @param cantidad Monto a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Retira una cantidad de la cuenta.
     * @param cantidad Monto a retirar
     * @throws Exception Si la cantidad es negativa o supera el saldo disponible
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }
}
