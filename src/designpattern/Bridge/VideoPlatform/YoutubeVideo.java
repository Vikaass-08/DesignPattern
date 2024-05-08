package designpattern.Bridge.VideoPlatform;

import designpattern.Bridge.VideoProcessor.*;

public class YoutubeVideo extends Video{
  public YoutubeVideo(VideoProcessor videoProcessor) {
    super(videoProcessor);
  }

  @Override
  public void play(String videoFile) {
    this.videoProcessor.process(videoFile);
  }
}
