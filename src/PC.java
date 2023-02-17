/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rui
 */
public class PC {
    private String ip, mascaraRed, hostName;

    public PC() {
    }

    public PC(String ip, String mascaraRed, String hostName) {
        this.ip = ip;
        this.mascaraRed = mascaraRed;
        this.hostName = hostName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMascaraRed() {
        return mascaraRed;
    }

    public void setMascaraRed(String mascaraRed) {
        this.mascaraRed = mascaraRed;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        return "PC{" + "ip=" + ip + ", mascaraRed=" + mascaraRed + ", hostName=" + hostName + '}';
    }
        
}
