public class Assistent {
    Camera camera = new Camera();
    CameraRoll cameraRoll = new BaWCameraRoll();

    public Camera getCamera(){
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
