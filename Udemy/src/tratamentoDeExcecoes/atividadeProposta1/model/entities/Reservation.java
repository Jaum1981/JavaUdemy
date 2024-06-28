package tratamentoDeExcecoes.atividadeProposta1.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import tratamentoDeExcecoes.atividadeProposta1.model.exception.DomainException;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
 
    public Reservation() {
    }
 
    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
 
    public LocalDate getCheckIn() {
        return checkIn;
    }
 
    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }
 
    public Integer getRoomNumber() {
        return roomNumber;
    }
 
    public LocalDate getCheckOut() {
        return checkOut;
    }
 
    public long duration() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }
 
    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
        LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Reservation dates for update must be before future dates");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
 
    @Override
    public String toString() {
        return "Room: "
                + roomNumber
                + ", checkIn: " 
                + checkIn.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ", checkOut: " 
                + checkOut.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
                + ", " + duration()
                + " nights.";
    }
 
}