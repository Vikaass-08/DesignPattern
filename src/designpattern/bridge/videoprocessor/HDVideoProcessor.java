package designpattern.bridge.videoprocessor;

public class HDVideoProcessor implements VideoProcessor{
  @Override
  public void process(String videoFile) {
    System.out.println(videoFile + " is processed in HD");
  }
}
