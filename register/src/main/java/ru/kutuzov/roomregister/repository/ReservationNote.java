package ru.kutuzov.roomregister.repository;

import java.util.Date;


public class ReservationNote {
    private final Integer noteId;

    public ReservationNote(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getNoteId() {
        return noteId;
    }

}
