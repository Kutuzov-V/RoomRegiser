package ru.kutuzov.roomregister.service.impl;

import org.springframework.stereotype.Service;
import ru.kutuzov.roomregister.repository.Room;
import ru.kutuzov.roomregister.repository.dto.RoomDto;
import ru.kutuzov.roomregister.service.RoomInformationService;

import java.util.List;

@Service
public class RoomInformationServiceImpl implements RoomInformationService {
    @Override
    public RoomDto createRoom() {
        return null;
    }

    @Override
    public RoomDto getRoom(Integer roomId) {
        return new RoomDto(roomId);
    }

    @Override
    public List<RoomDto> getAllRooms() {
        return List.of(new RoomDto(1),
                new RoomDto(2),
                new RoomDto(3));
    }

    @Override
    public RoomDto deleteRom(Integer roomId) {
        return null;
    }
}
