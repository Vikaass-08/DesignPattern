package designpattern.bridge.videoplatform;

import designpattern.bridge.videoprocessor.*;

public class NetflixVideo extends Video{
  public NetflixVideo(VideoProcessor videoProcessor) {
    super(videoProcessor);
  }

  @Override
  public void play(String videoFile) {
    this.videoProcessor.process(videoFile);
  }
}
