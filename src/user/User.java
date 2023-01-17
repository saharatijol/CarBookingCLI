package user;

import cars.Car;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class User {

    private UUID userId;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
    private int age;
    private Address address;
    private String email;
    private String phoneNumber;
    private boolean insurance;
    private Car[] cars;

    public User() {
    }

    public User(String firstName, String lastName, LocalDate birthDate, Address address, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User(String firstName,
                String lastName,
                Gender gender,
                LocalDate birthDate,
                int age,
                Address address,
                String email,
                String phoneNumber,
                boolean insurance, Car[] cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.insurance = insurance;
        this.cars = cars;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", age=" + age +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", insurance=" + insurance +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && insurance == user.insurance &&
                Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) &&
                gender == user.gender && Objects.equals(birthDate, user.birthDate) &&
                Objects.equals(address, user.address) && Objects.equals(email, user.email) &&
                Objects.equals(phoneNumber, user.phoneNumber) && Arrays.equals(cars, user.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, gender, birthDate, age, address, email, phoneNumber, insurance);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }

}
