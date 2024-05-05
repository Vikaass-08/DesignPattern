package designpattern.builder;

public class ComputerSetup {
  private boolean keyboard;
  private boolean mouse;

  @Override
  public String toString() {
    return "ComputerSetup{" +
            "keyboard=" + keyboard +
            ", mouse=" + mouse +
            ", mic=" + mic +
            ", speaker=" + speaker +
            ", monitor=" + monitor +
            '}';
  }

  private boolean mic;
  private boolean speaker;
  private boolean monitor;

  private ComputerSetup(ComputerSetupBuilder computerSetupBuilder) {
    this.keyboard = computerSetupBuilder.keyboard;
    this.monitor = computerSetupBuilder.monitor;
    this.speaker = computerSetupBuilder.speaker;
    this.mic = computerSetupBuilder.mic;
    this.mouse = computerSetupBuilder.mouse;
  }

  public static class ComputerSetupBuilder {
    private boolean keyboard, mouse, mic, speaker, monitor;

    public ComputerSetupBuilder addKeyboard(boolean keyboard) {
      this.keyboard = keyboard;
      return this;
    }

    public ComputerSetupBuilder addMouse(boolean mouse) {
      this.mouse = mouse;
      return this;
    }

    public ComputerSetupBuilder addMic(boolean mic) {
      this.mic = mic;
      return this;
    }

    public ComputerSetupBuilder addSpeaker(boolean speaker) {
      this.speaker = speaker;
      return this;
    }

    public ComputerSetupBuilder addMonitor(boolean monitor) {
      this.monitor = monitor;
      return this;
    }

    public ComputerSetup assemble() {
      return new ComputerSetup(this);
    }
  }

}
