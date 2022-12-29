public class Program {

    public static void fire() {
        System.out.println("Fire static");
    }

    public static void main(String[] args) {
        // Метод - функція прив'язана до об'єкта

        // Інтерфейс (тип даних) - набір заголовків методів.
        // Змінна цього типу може зберігати посилання на об'єкти классів реалізуючих (які реалізують методи інтерфейсу) даний інтерфейс.

        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // Event subscribe
//        sw.consumer = lamp;
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

/*      // Class
        class Fire implements ElectricityConsumer {
            @Override
            public void electricityOn() {
                System.out.println("Fire");
            }
        }
        sw.addElectricityListener(new Fire());*/

        // Анонімний клас
        /*sw.addElectricityListener(new ElectricityConsumer() {
            @Override
            public void electricityOn() {
                System.out.println("Fire");
            }
        });*/

        // Лямбда
        sw.addElectricityListener( () -> System.out.println("Fire") );

        sw.addElectricityListener( () -> Program.fire() ); // Static
        sw.addElectricityListener(Program::fire);

        sw.switchOn();
    }
}
