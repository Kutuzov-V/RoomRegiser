package ru.kutuzov.roomregister.service;

import ru.kutuzov.roomregister.repository.Employee;
import ru.kutuzov.roomregister.repository.ReservationNote;
import ru.kutuzov.roomregister.repository.Room;
import ru.kutuzov.roomregister.repository.dto.EmployeeDto;
import ru.kutuzov.roomregister.repository.dto.ReservationNoteDto;
import ru.kutuzov.roomregister.repository.dto.RoomDto;

import java.util.Date;
import java.util.List;

public interface ReservationService {
    public ReservationNoteDto reserveRoom(Date t1, Date t2, RoomDto room);
    public String cancelReservation(ReservationNote r);
    public ReservationNote getReservation(EmployeeDto employee);
    public ReservationNote getReservation(Date t1, Date t2);
    public List<ReservationNote> getAllReservationNotes(RoomDto room);   //появляется зависимость Reservation от Room. Допустимо ли это?
    public List<ReservationNote> getAllReservationNotes();  //Скорее всего надо будет указать за период, а не все записи
}
