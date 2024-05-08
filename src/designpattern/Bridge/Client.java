package designpattern.Bridge;

import designpattern.Bridge.VideoPlatform.*;
import designpattern.Bridge.VideoProcessor.*;

/*
Bridge Design pattern is used to split large classes or set of closely related classed into separate
hierarchies using abstraction and implementations.
This Example has two important Parts
1. Platform (netflix, youtube)
2. Processor (HD, UltraHD)
 */

public class Client {
  public static void main(String[] args) {
    VideoProcessor hdProcessor = new HDVideoProcessor();
    VideoProcessor ultraHDProcessor = new UltraHdVideoProcessor();

    Video youtubeVideo = new YoutubeVideo(hdProcessor);
    Video netflixVideo = new NetflixVideo(ultraHDProcessor);

    youtubeVideo.play("youtube.MP4");

    netflixVideo.play("netflix.MOV");
  }
}
