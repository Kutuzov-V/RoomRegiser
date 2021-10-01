package ru.kutuzov.service;

import ru.kutuzov.repository.Room;

import java.util.List;

public interface RoomInformationService {
    public Room createRoom();
    public Room getRoom(int roomId);
    public List<Room> getAllRooms();
    public Room deleteRom(int roomId);   // скорее всего лишний функционал
}
