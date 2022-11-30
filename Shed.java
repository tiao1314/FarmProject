/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author tiao
 */
public class Shed {

    // id / room
    private int id;
    private String room;


    public Shed(int id, String room) {
        this.id = id;
        this.room = room;
    }

    public Shed() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Shed{" + "id=" + id + ", room=" + room + '}';
    }
    


    



}
