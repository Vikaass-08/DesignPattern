package designpattern.bridge.videoprocessor;

public class UltraHdVideoProcessor implements VideoProcessor{
  @Override
  public void process(String videoFile) {
    System.out.println(videoFile + " is Processed in UltraHD");
  }
}
