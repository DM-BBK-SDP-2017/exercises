package prototype

trait Prototype extends Cloneable {
  override def clone(): AccessControl = super.clone().asInstanceOf[AccessControl]
}