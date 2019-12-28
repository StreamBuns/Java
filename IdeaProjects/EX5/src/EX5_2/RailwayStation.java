package EX5_2;

public class RailwayStation implements Runnable {
    int ticket;

    RailwayStation(int ticket) {
        this.ticket = ticket;
    }

    public synchronized void sell() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "销售了第" + ticket + "张票");
            this.ticket--;
        }

//        else System.out.println("销售完毕。");
    }

    public void run() {
        while (ticket > 0) {
            sell();
            try {
                Thread.sleep(100);
            } catch (InterruptedException error) {
            }
        }

    }


}
