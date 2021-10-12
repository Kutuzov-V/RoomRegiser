package ru.kutuzov.roomregister.controller;

import org.springframework.web.bind.annotation.*;
import ru.kutuzov.roomregister.repository.dto.ReservationNoteDto;
import ru.kutuzov.roomregister.repository.dto.RoomDto;
import ru.kutuzov.roomregister.service.ReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationNoteController {
    private final ReservationService reservationService;

    public ReservationNoteController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<ReservationNoteDto> getAllReserveNote() {
        return reservationService.getAllReservationNotes();
    }

    @GetMapping("/{roomId}")
    public List<ReservationNoteDto> getAllReserveNote(@PathVariable Integer roomId) {
        return reservationService.getAllReservationNotes(roomId);
    }


    @GetMapping("/?start={t_start}&finish={t_finish}")
    public ReservationNoteDto getReserveNote(@PathVariable Long t_start, @PathVariable Long t_finish) {
        return this.reservationService.getReservation(t_start, t_finish);
    }

    @PostMapping("/{noteId}")
    public ReservationNoteDto getReservationNote(@PathVariable Integer noteId) {
        return reservationService.getReservation(noteId);
    }

    @PostMapping
    public ReservationNoteDto reserveRoom(@RequestBody ReservationNoteDto reserveNote) {
        return reservationService.reserveRoom(reserveNote);
    }

    @DeleteMapping("/{noteId}")
    public String cancelReserve(@PathVariable Integer noteId) {
        return reservationService.cancelReservation(noteId);
    }

}
