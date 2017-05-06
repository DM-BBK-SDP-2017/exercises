package mediator

class Heater extends Colleague {

  private var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit = {
    this.mediator = mediator
  }
  def on(temp: Int): Unit = {
    println(s"Heater is on...\nTemperature is set to $temp")
    while (!mediator.checkTemperature(temp)) {Thread.sleep(1000)}
    println(s"Temperature reached $temp C")
    mediator.off
  }

  def off(): Unit = {
    println("Heater is off...")
    mediator.wash
  }
}