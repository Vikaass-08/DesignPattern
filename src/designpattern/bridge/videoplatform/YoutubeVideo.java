package designpattern.bridge.videoplatform;

import designpattern.bridge.videoprocessor.*;

public class YoutubeVideo extends Video{
  public YoutubeVideo(VideoProcessor videoProcessor) {
    super(videoProcessor);
  }

  @Override
  public void play(String videoFile) {
    this.videoProcessor.process(videoFile);
  }
}
