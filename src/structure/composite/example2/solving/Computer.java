package structure.composite.example2.solving;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerDevice {

    //복수개의 ComputerDevice 객체를 가리킴
    private List<ComputerDevice> components = new ArrayList<>();

    //ComputerDevice 객체를 Computer 클래스에 추가함
    public void addComponent(ComputerDevice component) {
        this.components.add(component);
    }

    //ComputerDevice 객체를 Computer 클래스에서 제거함
    public void removeComponent(ComputerDevice component) {
        components.remove(component);
    }

    @Override
    public int getPrice() {
        return components.stream()
                .mapToInt(component -> component.getPrice())
                .sum();
    }

    @Override
    public int getPower() {
        return components.stream()
                .mapToInt(component -> component.getPower())
                .sum();
    }
}
