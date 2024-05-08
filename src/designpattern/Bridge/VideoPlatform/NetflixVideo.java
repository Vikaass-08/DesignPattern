package designpattern.Bridge.VideoPlatform;

import designpattern.Bridge.VideoProcessor.*;

public class NetflixVideo extends Video{
  public NetflixVideo(VideoProcessor videoProcessor) {
    super(videoProcessor);
  }

  @Override
  public void play(String videoFile) {
    this.videoProcessor.process(videoFile);
  }
}
