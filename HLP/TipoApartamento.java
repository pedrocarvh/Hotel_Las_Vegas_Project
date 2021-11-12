package lasvegas;

public class TipoApartamento {

    private double dayPrice;
    private String typeApartment;
    private int numbersOfRoom;
    private int roomFree;

    public double getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(double dayPrice) {
        this.dayPrice = dayPrice;
    }

    public String getTypeApartment() {
        return typeApartment;
    }

    public void setTypeApartment(String typeApartment) {
        this.typeApartment = typeApartment;
    }

    public int getNumbersOfRoom() {
        return numbersOfRoom;
    }

    public void setNumbersOfRoom(int numbersOfRoom) {
        this.numbersOfRoom = numbersOfRoom;
    }

    public int getRoomFree() {
        return roomFree;
    }

    public void setRoomFree(int roomFree) {
        this.roomFree = roomFree;
    }
}
