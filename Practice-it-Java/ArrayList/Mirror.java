import java.util.ArrayList;

public class Mirror {
    public void ArrayList<Strings> mirror(ArrayList<String> list) {
        int pointer = list.size()-1;
        for (int i = 0; i< list.size(); i++) {
            list.add(pointer,list.get(i));
            pointer--;

        }
        return list;
    }
}
