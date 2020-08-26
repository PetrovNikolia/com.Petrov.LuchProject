import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("camera")
public class Camera {
    CameraRoll cameraRoll;

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    @Autowired
    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void goPhotograph(){
        System.out.println("Щелк!");
        cameraRoll.processing();
    }
}
