package Spring_B;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassKLM {

    @Autowired
    @Qualifier("classABC") // Can change to "classXYZ" if you want to inject ClassXYZ
    InterfacePQR pqr;

    public void doWork() {
        pqr.display();
    }
}
