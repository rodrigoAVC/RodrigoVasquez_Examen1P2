/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rui
 */
public class Laptop extends PC {
    private String marca, definicionPantalla;
    private boolean RGB;

    public Laptop() {
        super();
    }

    public Laptop(String marca, String definicionPantalla, boolean RGB, String ip, String mascaraRed, String hostName) {
        super(ip, mascaraRed, hostName);
        this.marca = marca;
        this.definicionPantalla = definicionPantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefinicionPantalla() {
        return definicionPantalla;
    }

    public void setDefinicionPantalla(String definicionPantalla) {
        this.definicionPantalla = definicionPantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        return "Laptop:" 
                + "\n[Host -> " + super.getHostName() + ']'
                + "\n[IP -> " + super.getIp() + ']'
                + "\n[Mascara de Red -> " + super.getMascaraRed() + ']'
                + "\n[Marca -> " + marca + ']'
                + "\n[Definicion de Pantalla -> " + definicionPantalla + ']'
                + "\n[¿Tiene teclado RGB? " + RGB + ']';
    }
    
}
