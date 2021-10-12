package ru.kutuzov.roomregister.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import ru.kutuzov.roomregister.repository.Room;

import java.util.HashMap;
import java.util.Map;

@Getter
public class RoomDto extends Room {
    String nameRoom;

    public final static HashMap<Integer,String> roomMap;

    static {
        roomMap = new HashMap<Integer,String>();
        roomMap.put(1,"Yellow meeting room");
        roomMap.put(2,"Green meeting room");
        roomMap.put(3,"Red meeting room");
    }

    public static String getNameFromId(Integer roomId){
        if(roomId == 1 || roomId==2 || roomId==3){
            return roomMap.get(roomId);
        }else return "Unknown room Id";
    }

    public RoomDto(@JsonProperty("roomId") Integer roomId) {
        super(roomId);
        this.nameRoom = getNameFromId(roomId);
    }

    public String getNameRoom() {
        return nameRoom;
    }
}
