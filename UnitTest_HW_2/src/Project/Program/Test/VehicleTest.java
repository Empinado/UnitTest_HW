
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import Project.Program.*;
import static org.assertj.core.api.Assertions.assertThat;
import static
        org.assertj.core.api.Assertions.assertThatThrownBy;

public class VehicleTest {
    //- проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void CarItsVehicleTest(){
        Car car = new Car("BMW","X5",1999);
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    //- проверка того, объект Car создается с 4-мя колесами
    @Test
    void CarNumWheelsTest(){
        Car car = new Car("BMW","X5",1999);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //- проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    void MotorcycleNumWheelsTest(){
        Motorcycle moto = new Motorcycle("HD","HD1966",1966);
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    //- проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void CarTestDriveTest(){
        Car car = new Car("BMW","X5",1999);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    //- проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void MotorcycleTestDriveTest(){
        Motorcycle moto = new Motorcycle("HD","HD1966",1966);
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void CarDriveParkTest(){
        Car car = new Car("BMW","X5",1999);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void MotorcycleDriveParkTest(){
        Motorcycle moto = new Motorcycle("HD","HD1966",1966);
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}
