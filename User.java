public class User extends Thread {

    @Override
    public void run() {
        final int sleepTime = 2500;
        final int numOfIterations = 7;
        Tumbler tumbler = Tumbler.getTumbler();
        for (int i = 0; i < numOfIterations; i++) {
            tumbler.setTumblerCondition(true);
            System.out.println("Пользователь открыл коробку");
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                System.out.println("Обращение к спящему потоку");
                e.printStackTrace();
            }
        }
        System.out.println("******************************");
        System.out.println("Пользователь отстал от коробки");
    }
}
