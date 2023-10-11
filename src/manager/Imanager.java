package manager;

import java.util.ArrayList;

public interface Imanager<P> {
    void add(P p);

    P findById(int id);

    boolean edit(int id, P p);

    boolean remove(int id);

    ArrayList<P> findAll();

}
