import heap.Heap;
import java.util.Random;

public class zyzf {
    public static void main(String[] args) {
        final int kolvo_proverok = 50000000;
        for (int kolvo = 0; kolvo < 2000000; kolvo += 100000) {
            long memObjNow = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            Heap hea = new Heap(kolvo);
            //BinaryHeap<Integer> binaryHeap = new BinaryHeap<Integer>();
            long memObj = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

            //long time;

            int[] massZn = new int[kolvo];
            Random rand = new Random();

            for (int i = 0; i < kolvo; i++) {
                massZn[i] = rand.nextInt(100);
            }

            //long timeNow = System.currentTimeMillis();
            long memNow = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            for (int i = 0; i < kolvo; i++) {
                hea.insertNode(massZn[i]);
                //binaryHeap.insert(massZn[i]);
            }
            long mem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            //time = System.currentTimeMillis() - timeNow;

            // long timeNow = System.currentTimeMillis();
            // for (int i = kolvo-1; i >= 0; i--) {
            //     //hea.removeNode(massZn[i]);
            //     binaryHeap.delete();
            // }
            // time = System.currentTimeMillis() - timeNow;

            //System.out.println(time);
            System.out.println(((mem-memNow)/1024) + ((memObj-memObjNow)/1024));
        }
    }   
}
