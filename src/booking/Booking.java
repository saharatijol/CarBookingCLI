package booking;

import cars.Car;
import user.User;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Booking {

    private User user;
    private LocalDate bookingDate;
    private Car bookedCar;
    private Car[] availableCars;
    private long bookingId;

    public Booking() {
    }

    public Booking(User user, LocalDate bookingDate, Car bookedCar, Car[] availableCars, long bookingId) {
        this.user = user;
        this.bookingDate = bookingDate;
        this.bookedCar = bookedCar;
        this.availableCars = availableCars;
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Car getBookedCar() {
        return bookedCar;
    }

    public void setBookedCar(Car bookedCar) {
        this.bookedCar = bookedCar;
    }

    public Car[] getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(Car[] availableCars) {
        this.availableCars = availableCars;
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingId == booking.bookingId && Objects.equals(user, booking.user) && Objects.equals(bookingDate, booking.bookingDate) && Objects.equals(bookedCar, booking.bookedCar) && Arrays.equals(availableCars, booking.availableCars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(user, bookingDate, bookedCar, bookingId);
        result = 31 * result + Arrays.hashCode(availableCars);
        return result;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "user=" + user +
                ", bookingDate=" + bookingDate +
                ", bookedCar=" + bookedCar +
                ", availableCars=" + Arrays.toString(availableCars) +
                ", bookingId=" + bookingId +
                '}';
    }
}
