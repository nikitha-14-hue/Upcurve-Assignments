package target.programs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Cylinder extends Circle {
    private double height=1.0;
    Cylinder(double radius)
    {
        super(radius);

    }
    Cylinder(double radius,double height)
    {
           super(radius);
           this.height=height;
    }
    Cylinder(double radius,double height,String color)
    {
        super(radius,color);
        this.height=height;

    }
    public double getVolume()
    {
        return getArea()*height;
    }
}


