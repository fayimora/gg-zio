import zio.config.*, typesafe.*, magnolia.*, ConfigSource.*, ConfigDescriptor.*
import typesafe.*
//import zio.*
//import zio.config.magnolia.*

case class CrawlerConfig (mainUrl: String)
//case class CrawlerConfig (mainUrl: String, allowedSubDomains: List[String])

object CrawlerConfig:
//  val descriptor: ConfigDescriptor[CrawlerConfig] =
//    string("mainUrl").to[CrawlerConfig]
//
  val source: _root_.zio.config.ConfigSource = ConfigSource.fromHoconFilePath("src/main/resources/crawler.conf")

//  val config: ConfigDescriptor[CrawlerConfig] = read(descriptor.from(source))
//  val conf = read(descriptor[CrawlerConfig].from(source))
//  val config = TypesafeConfig.fromHoconFilePath("src/main/resources/application.conf", descriptor[CrawlerConfig])
//  implicit val configDescriptor: Descriptor[CrawlerConfig] = descriptor[CrawlerConfig]
//  val config = string("mainUrl").zip(list("allowedSubDomains")(string)).to[CrawlerConfig]
//  implicit val sss: Descriptor[CrawlerConfig] = descriptor[CrawlerConfig]
//  val gg = TypesafeConfigSource
//    .fromHoconFilePath[CrawlerConfig]("src/main/resources/application.conf")
//    .toHocon()
//    .getConfig("crawler")

