/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.AppointmentDetails.AppointmentDirectory;
import Business.AppointmentDetails.AppointmentHistory;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Organization.Organization;

import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Student.StudentDirectory;

import Business.StudentUsher.StudentUsherDirectory;
import Networks.Network;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem ecosystem;
    private ArrayList<Network> networks;
    private StudentUsherDirectory sud;
    private StudentDirectory studir;
    private AppointmentHistory ah;
    private AppointmentDirectory ad;

    public static EcoSystem getInstance() {
        if (ecosystem == null) {
            ecosystem = new EcoSystem();
        }
        return ecosystem;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networks.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networks = new ArrayList<Network>();
        this.sud = new StudentUsherDirectory();
        this.studir = new StudentDirectory();
        this.ah = new AppointmentHistory();
        this.ad = new AppointmentDirectory();
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(ArrayList<Network> networks) {
        this.networks = networks;
    }

    public StudentUsherDirectory getSud() {
        return sud;
    }

    public void setSud(StudentUsherDirectory sud) {
        this.sud = sud;
    }

//    public StudentDirectory getStudir() {
//        return studir;
//    }
//
//    public void setStudir(StudentDirectory studir) {
//        this.studir = studir;
//    }

    public AppointmentHistory getAh() {
        return ah;
    }

    public void setAh(AppointmentHistory ah) {
        this.ah = ah;
    }

    public StudentDirectory getStudir() {
        return studir;
    }

    public void setStudir(StudentDirectory studir) {
        this.studir = studir;
    }

    public AppointmentDirectory getAd() {
        return ad;
    }

    public void setAd(AppointmentDirectory ad) {
        this.ad = ad;
    }
    
    
    
    
    
    
}
