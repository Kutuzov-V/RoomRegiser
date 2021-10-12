package ru.kutuzov.roomregister.service;

import ru.kutuzov.roomregister.repository.dto.ReservationNoteDto;

import java.util.List;

public interface ReservationService {
    public ReservationNoteDto reserveRoom(ReservationNoteDto reserveNote);
    public String cancelReservation(Integer reserveNoteId);
    public ReservationNoteDto getReservation(Integer employeeId);
    public ReservationNoteDto getReservation(Long t1, Long t2);
    public List<ReservationNoteDto> getAllReservationNotes(Integer roomId);   //появляется зависимость Reservation от Room. Допустимо ли это?
    public List<ReservationNoteDto> getAllReservationNotes();  //Скорее всего надо будет указать за период, а не все записи
}
