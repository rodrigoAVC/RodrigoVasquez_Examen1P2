/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rui
 */
public class PC_Escritorio extends PC {
    private int RAM, storage;
    private String tipoStorage;
    private boolean tarjetaGrafica;

    public PC_Escritorio() {
        super();
    }

    public PC_Escritorio(int RAM, int storage, String tipoStorage, boolean tarjetaGrafica, String ip, String mascaraRed, String hostName) {
        super(ip, mascaraRed, hostName);
        this.RAM = RAM;
        this.storage = storage;
        this.tipoStorage = tipoStorage;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getTipoStorage() {
        return tipoStorage;
    }

    public void setTipoStorage(String tipoStorage) {
        this.tipoStorage = tipoStorage;
    }

    public boolean isTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "PC de Escritorio:" 
                + "\n[Host -> " + super.getHostName() + ']'
                + "\n[IP -> " + super.getIp() + ']'
                + "\n[Mascara de Red -> " + super.getMascaraRed() + ']'
                + "\n[RAM -> " + RAM + ']'
                + "\n[Capacidad de Almacenamiento -> " + storage + ']'
                + "\n[Tipo de Almacenamiento -> " + tipoStorage + ']'
                + "\n[¿Tiene tarjeta gráfica? " + tarjetaGrafica + ']';
    }
    
}
