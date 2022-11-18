package machines;

import java.util.Objects;

public class SheetBendingPress {
    private String brand;
    private String model;
    private Integer manufacturingYear;

    public SheetBendingPress (String brand, String model,Integer manufacturingYear) {
        this.brand = brand;
        this.model = model;
        this.manufacturingYear = manufacturingYear;
    }

    public String getBrand () {
        return brand;
    }

    public String getModel () {
        return model;
    }

    public Integer getManufacturingYear () {
        return manufacturingYear;
    }

    @Override
    public String toString() {
        return "SheetBendingPress{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", manufacturingYear=" + manufacturingYear +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SheetBendingPress press = (SheetBendingPress) obj;
        return !(manufacturingYear == press.getManufacturingYear() && brand.equals(getBrand()) && model.equals(getModel()));
    }

    @Override
    public int hashCode() {
        int prime = 22;
        return prime*Objects.hash(brand, model, manufacturingYear);
    }
}
