package org.example.collection;

import java.util.Iterator;
import java.util.List;

public class DownSize {
    public static void downsize(List<String> list, int n){
        int count = 1;
        for(Iterator<String> elem = list.iterator(); elem.hasNext();){
            if(count % n == 0){
                elem.remove();
            }
            count++;
        }
    }
}
