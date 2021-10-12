package ru.kutuzov.roomregister.service.impl;

import org.springframework.stereotype.Service;
import ru.kutuzov.roomregister.repository.ReservationNote;
import ru.kutuzov.roomregister.repository.dto.EmployeeDto;
import ru.kutuzov.roomregister.repository.dto.ReservationNoteDto;
import ru.kutuzov.roomregister.repository.dto.RoomDto;
import ru.kutuzov.roomregister.service.ReservationService;

import java.util.Date;
import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    public ReservationNoteDto reserveRoom(ReservationNoteDto reserveNote) {
        return reserveNote;
    }

    @Override
    public String cancelReservation(Integer reserveNoteId) {
        ReservationNoteDto reserveNote = getReservation(reserveNoteId);
        return "The reserve successful canceled." + "\n Note content: \n" +
                "noteId: " + reserveNote.getNoteId() + "\n" +
                "Meeting Room: " + RoomDto.getNameFromId(reserveNote.getRoomId()) + "\n" +
                "EmployeeId: " + reserveNote.getEmployeeId() + "\n" +
                "Start meeting: " + reserveNote.getTStart() + "\n" +
                "Finish meeting: " + reserveNote.getTFinish() +  "\n" +
                "Meeting reason: " + reserveNote.getReason();
    }

    @Override
    public ReservationNoteDto getReservation(Integer noteId) {
        return new ReservationNoteDto(noteId,
                1,
                3,
                new Date(),
                new Date(new Date().getTime() + 3600000),
                "Some meeting");
    }

    @Override
    public ReservationNoteDto getReservation(Long t1, Long t2) {
        return null;
    }

    @Override
    public List<ReservationNoteDto> getAllReservationNotes(Integer roomId) {
        return null;
    }

    @Override
    public List<ReservationNoteDto> getAllReservationNotes() {
        return null;
    }
}
