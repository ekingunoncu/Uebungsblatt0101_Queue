package Queue;

/**
 * Ekin Gün Öncü
 * */
 public class QueueMain {
    public static void main(String[] args) {

        ArrayQueue<String> stringArrayQueue = new ArrayQueue<String>(); /** initialize with default size value 5 **/

        for(int i = 0 ; i < 7  ; i++){
            stringArrayQueue.enqueue("Number für Array Queue before  " + i); /** filling queue with numbers 0 to 14 **/
        }

        System.out.println("\n Queue before size change :: ");
        while (!stringArrayQueue.isEmpty()){
            System.out.println(stringArrayQueue.dequeue()); /** printing queue  **/
        }

        stringArrayQueue.increaseQueueSize(15); /** change size 7 to  7 + 15 **/

        System.out.println("\n Queue after size change :: ");
        for(int i = 0 ; i < 15 ; i++){
            stringArrayQueue.enqueue("Number für Array Queue after " + i); /** filling queue with numbers 0 to 14 **/
        }

        while (!stringArrayQueue.isEmpty()){
            System.out.println(stringArrayQueue.dequeue()); /** printing queue  **/
        }

        System.out.println("\n Linkedlist Queue :: ");

        QueueLinkedList<String> stringQueueLinkedList = new QueueLinkedList<String>();
        for(int i = 0 ; i < 15 ; i++){
            stringQueueLinkedList.enqueue("Number für Queue with Linkedlist " + i);
        }

        while (!stringQueueLinkedList.isEmpty()){
            System.out.println(stringQueueLinkedList.dequeue());
        }

    }
}
