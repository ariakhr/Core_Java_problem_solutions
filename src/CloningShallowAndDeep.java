import org.apache.commons.lang3.SerializationUtils;

import java.io.Serializable;
import java.util.Arrays;

public class CloningShallowAndDeep {
    public static void main(String[] args) {
        //Shallow Copy
        System.out.println("Shallow Copy");
        int[] originalVals = {8, 5, 12};
        ShallowCopyEx e = new ShallowCopyEx(originalVals);
        e.showData(); // prints out [8, 5, 12]
        originalVals[0] = 13;
        e.showData(); // prints out [13, 5, 12]

        //Deep Copy
        System.out.println("Deep Copy");
        int[] originalValArray = {8, 5, 12};
        DeepCopyEx ex = new DeepCopyEx(originalValArray);
        ex.showData(); // prints out [8, 5, 12]
        originalValArray[0] = 13;
        ex.showData(); // prints out [13, 5, 12]

        //Using Apache Commons Lang SerializationUtils#clone
        System.out.println("Deep Copy Using Apache Utils");
        int[] originalValArray1 = {8, 5, 12};
        ShallowCopyEx ex2 = new ShallowCopyEx(originalValArray1);
        ex2.showData(); // prints out [8, 5, 12]
        ShallowCopyEx ex3 = (ShallowCopyEx) SerializationUtils.clone(ex2);
        originalValArray1[0] = 13;
        ex3.showData(); // prints out [8, 5, 12]

    }
}

class ShallowCopyEx implements Serializable {

    private int[] data;

    // makes a shallow copy of values
    public ShallowCopyEx(int[] values) {
        data = values;
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}

class DeepCopyEx {

    private int[] data;

    // altered to make a deep copy of values
    public DeepCopyEx(int[] values) {
        data = new int[values.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = values[i];
        }
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}

