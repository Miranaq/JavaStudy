package LinkList;
import java.util.function.Predicate;
public interface AfL {
    void add(int value);
    void add(int index, int value);
    void remove(int index);
    void remove(Predicate<Integer> predicate);
}
