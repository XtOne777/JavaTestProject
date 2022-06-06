package testProject;

import java.util.ArrayList;

public class BubbleSort {
    public void intCollectionSort(ArrayList<Integer[]> array_get){
        for (int f = 0; f <= array_get.size(); f++){
            for (int i = 0; i + 1 < array_get.size(); i++){
                boolean flag = false;

                int dd = Math.min(array_get.get(i).length, array_get.get(i + 1).length);

                for (int k = 0; k < dd; k++){
                    if (!array_get.get(i)[k].equals(array_get.get(i + 1)[k])){
                        if (array_get.get(i)[k] < array_get.get(i + 1)[k]) {
                            flag = true;
                        }
                        break;
                    }
                    else if (array_get.get(i).length == k + 1 && array_get.get(i).length < array_get.get(i + 1).length){
                        flag = true;
                        break;
                    }
                }

                if (flag){
                    Integer[] l = array_get.get(i + 1);
                    array_get.set(i + 1, array_get.get(i));
                    array_get.set(i, l);
                }
            }
        }
    }
}
