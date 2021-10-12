package ru.kutuzov.roomregister.service;

import ru.kutuzov.roomregister.repository.Room;
import ru.kutuzov.roomregister.repository.dto.RoomDto;

import java.util.List;

public interface RoomInformationService {
    public RoomDto createRoom();
    public RoomDto getRoom(Integer roomId);
    public List<RoomDto> getAllRooms();
    public RoomDto deleteRom(Integer roomId);   // скорее всего лишний функционал
}
