package be.darkshark.parkshark.domain.entity.util;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class PhoneNumber {
    private String countryCode;
    private int phoneNumber;

    public PhoneNumber() {
    }

    public PhoneNumber(String countryCode, int phoneNumber) {
        this.countryCode = countryCode;
        this.phoneNumber = phoneNumber;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return countryCode + " " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return phoneNumber == that.phoneNumber &&
                Objects.equals(countryCode, that.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryCode, phoneNumber);
    }
}
