package ru.kutuzov.roomregister.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import ru.kutuzov.roomregister.repository.ReservationNote;

import java.util.Date;

@Getter
public class ReservationNoteDto extends ReservationNote {
    private Integer employeeId;
    private Integer roomId;
    private Date tStart;
    private Date tFinish;
    private String Reason;

    public ReservationNoteDto(Integer noteId, Integer employeeId, Integer roomId, Date tStart, Date tFinish, String reason) {
        super(noteId);
        this.employeeId = employeeId;
        this.roomId = roomId;
        this.tStart = tStart;
        this.tFinish = tFinish;
        Reason = reason;
    }
    //Для теста
    public ReservationNoteDto(@JsonProperty("noteId") Integer noteId,
                              @JsonProperty("employeeId") Integer employeeId,
                              @JsonProperty("roomId") Integer roomId,
                              @JsonProperty("reason") String reason) {
        super(noteId);
        this.employeeId = employeeId;
        this.roomId = roomId;
        this.tStart = new Date();
        this.tFinish = new Date(tStart.getTime() + 3600000);
        Reason = reason;
    }

}
