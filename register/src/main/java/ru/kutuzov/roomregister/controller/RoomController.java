package ru.kutuzov.roomregister.controller;

import org.springframework.web.bind.annotation.*;
import ru.kutuzov.roomregister.repository.dto.ReservationNoteDto;
import ru.kutuzov.roomregister.repository.dto.RoomDto;
import ru.kutuzov.roomregister.service.ReservationService;
import ru.kutuzov.roomregister.service.RoomInformationService;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    private final RoomInformationService roomService;

    public RoomController(RoomInformationService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public List<RoomDto> getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/{roomId}")
    public RoomDto getRoom(@PathVariable Integer roomId) {
        return roomService.getRoom(roomId);
    }

    @PostMapping
    public RoomDto createRoom(@RequestBody RoomDto room) {
        return roomService.createRoom();
    }

    @DeleteMapping("/{roomId}")
    public String deleteRoom(@PathVariable Integer roomId) {
        return "Room with roomId= " + roomId + " deleted.";
    }

}
