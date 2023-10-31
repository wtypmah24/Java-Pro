package lesson_10_generics.task_4;

import lesson_10_generics.task_4.transport.PassengerVessel;
import lesson_10_generics.task_4.transport.WarShip;
import lesson_10_generics.task_4.wrapper.WrapTransport;

public class Main {
    /*
    * 1.1 Создайте иерархию классов: транспорт -> судно -> пассажирский лайнер/прогулочная яхта/военный корабль.
    * Пассажирский лайнер и прогулочная яхта должны имплементировать интерфейс Entertainment, содержащий
    * метод entertain.
    1.2 Создайте класс-обёртку для хранения транспорта.
    1.3 Создайте метод sail, который будет работать только с судами.
    1.4 Создайте метод useTransport, который будет работать только с военными кораблями и их любым предком.
    1.5 Создайте метод getVoyage, который будет работать только с пассажирскими лайнерами и яхтами.*/
    public static void main(String[] args) {
        PassengerVessel passengerVessel = new PassengerVessel();
        WarShip warShip = new WarShip();


        WrapTransport.useTransport(new WrapTransport<>(warShip));
        //WrapTransport.useTransport(new WrapTransport<PassengerVessel>(passengerVessel));
        WrapTransport.sail(passengerVessel);
        WrapTransport.getVoyage(passengerVessel);
    }
}
