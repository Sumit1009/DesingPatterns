package exercise2;

import exercise2.DisplayElement;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<DisplayElement> elements = new ArrayList<>();

    public void attach(DisplayElement element) {
        elements.add(element);
    }

    public void detach(DisplayElement element) {
        elements.remove(element);
    }

    public void notifyElements() {
       elements.forEach(element -> element.onUpdate(this));
    }
}
