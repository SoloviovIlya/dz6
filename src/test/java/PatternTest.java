import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;

@Epic(value = "Тестирование паттерна")
@Feature(value = "Домашнее задание")
public class PatternTest {
    @Test
    @DisplayName("SingleCompositeTest")
    @Description("")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Соловьёв Илья")
    @Story(value = "Тестирование единственного composite")
    void singleTest() {
        Composite composite = new Composite();
        composite.add(new Component(100L));
        composite.add(new Component(200L));
        composite.add(new Component(300L));
        Long result = composite.getS();
        Assertions.assertEquals(600L, result);
    }
    @Test
    @DisplayName("MultipleCompositesTest")
    @Description("")
    @Link("")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Соловьёв Илья")
    @Story(value = "Тестирование нескольких composite")
    void multipleTest() {
        //given
        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        composite.add(composite1);
        composite.add(composite2);
        composite1.add(new Component(100L));
        composite1.add(new Component(200L));
        composite1.add(new Component(300L));
        composite2.add(new Component(100L));
        composite2.add(new Component(200L));
        composite2.add(new Component(300L));
        Long result = composite.getS();
        Assertions.assertEquals(1200L, result);
    }
}
