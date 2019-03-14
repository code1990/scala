import scala.collection.JavaConverters._
val ids = java.time.ZoneId.SHORT_IDS.asScala

val props = System.getProperties().asScala

import java.awt.font.TextAttribute._
val attrs = Map(FAMILY->"Serif",SIZE->12)
val front = new java.awt.Font(attrs.asJava)

