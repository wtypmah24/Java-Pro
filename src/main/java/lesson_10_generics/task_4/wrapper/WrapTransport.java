package lesson_10_generics.task_4.wrapper;

import lesson_10_generics.task_4.fun.Entertainment;
import lesson_10_generics.task_4.transport.Ship;
import lesson_10_generics.task_4.transport.Transport;
import lesson_10_generics.task_4.transport.WarShip;

public class WrapTransport <T extends Transport> {
    private final T vehicle;

    public WrapTransport(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }
    public static <V extends Ship> void sail (V ship){
        if (ship != null){
            System.out.println("Ship sails" + ship);
        }
    }
    public static void useTransport (WrapTransport<? super WarShip> wrap){
        System.out.println(wrap.getVehicle());
    }
    public static <S extends Ship & Entertainment> void getVoyage(S ship){
        System.out.println("have fun on a ship " + ship);
    }
}
