package designpattern.bridge.videoplatform;

import designpattern.bridge.videoprocessor.*;

public abstract class Video {
  protected VideoProcessor videoProcessor;
  public Video(VideoProcessor videoProcessor) {
    this.videoProcessor = videoProcessor;
  }

  public abstract void play(String videoFile);
}
