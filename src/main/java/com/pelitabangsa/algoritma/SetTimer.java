package com.pelitabangsa.algoritma;

/**
 * @inspired by https://www.youtube.com/watch?v=36jbBSQd3eU and https://www.youtube.com/watch?v=tKSe8DAkrYk
 */
import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {
  int time = 0, limit = 0;

  public void run() {
    if (time <= limit) {
      time++;
    }

    System.out.println(time);
  }
}

public class SetTimer {
  int time = 0;

  public int run(int limit) {
    Task task = new Task();
    Timer timer = new Timer();

    timer.schedule(task, limit, 1000);
    return time++;
  }
}
