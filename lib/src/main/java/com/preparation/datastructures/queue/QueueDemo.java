package com.preparation.datastructures.queue;

/**
 * Created by chaitanya.ak on 11/06/16.
 */
public class QueueDemo {

  public static void main(String[] args) {
    QueueDemo queueDemo = new QueueDemo();
    //queueDemo.standardQueueTest();
    //queueDemo.priorityQueueTest();
    queueDemo.doubleEndedQueue();
  }

  private void standardQueueTest() {
    Queue queue = new Queue();
    queue.enQueue(29);
    queue.enQueue(9);
    queue.deQueue();
    queue.enQueue(11);
    queue.enQueue(1);
    queue.deQueue();
    queue.enQueue(45);
    queue.enQueue(15);
    queue.deQueue();

    queue.traverse();
  }

  private void priorityQueueTest() {
    //1 -->highest priority
    PriorityQueue priorityQueue = new PriorityQueue();

    priorityQueue.enQueuePriority(29, 1);
    priorityQueue.enQueuePriority(9, 2);
    priorityQueue.enQueuePriority(11, 4);
    priorityQueue.enQueuePriority(1, 1);
    priorityQueue.enQueuePriority(45, 3);
    priorityQueue.enQueuePriority(15, 1);
    priorityQueue.dequeuePriority();

    priorityQueue.traverse();
  }

  private void doubleEndedQueue() {
    DoubleEndedQueue doubleEndedQueue = new DoubleEndedQueue();

    doubleEndedQueue.enQueueFirst(21);
    doubleEndedQueue.deQueueFirst();
    doubleEndedQueue.enQueueFirst(19);
    doubleEndedQueue.enQueueBack(54);
    doubleEndedQueue.enQueueFirst(13);
    doubleEndedQueue.deQueueBack();
    doubleEndedQueue.enQueueBack(14);
    doubleEndedQueue.enQueueFirst(38);
    doubleEndedQueue.deQueueBack();
    doubleEndedQueue.enQueueBack(82);
    doubleEndedQueue.enQueueFirst(98);

    doubleEndedQueue.traverseFront();
    //doubleEndedQueue.traverseBack();
  }
}
