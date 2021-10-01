package ru.kutuzov.service;

import ru.kutuzov.repository.Employee;
import ru.kutuzov.repository.ReservationNote;
import ru.kutuzov.repository.Room;

import java.util.Date;
import java.util.List;

public interface ReservationService {
    public ReservationNote reserveRoom(Date t1, Date t2, Room room);
    public String cancelReservationRoom(ReservationNote r);
    public ReservationNote getReservationNote(Employee employee);
    public ReservationNote getReservationNote(Date t1, Date t2);
    public List<ReservationNote> getAllReservationNotesOfRoom(Room room);   //появляется зависимость Reservation от Room. Допустимо ли это?
    public List<ReservationNote> getAllReservationNotes();  //Скорее всего надо будет указать за период, а не все записи
}
