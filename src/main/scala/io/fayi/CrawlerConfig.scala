package io.fayi

import zio.config.*
import zio.config.magnolia.*
import zio.config.typesafe.*
//import zio.*
//import zio.config.magnolia.*

case class CrawlerConfig (mainUrl: String)
//case class io.fayi.CrawlerConfig (mainUrl: String, allowedSubDomains: List[String])

object CrawlerConfig:
//  val descriptor: ConfigDescriptor[io.fayi.CrawlerConfig] =
//    string("mainUrl").to[io.fayi.CrawlerConfig]
//
  val source: ConfigSource = ConfigSource.fromHoconFilePath("src/main/resources/crawler.conf")

//  val config: ConfigDescriptor[io.fayi.CrawlerConfig] = read(descriptor.from(source))
//  val conf = read(descriptor[io.fayi.CrawlerConfig].from(source))
//  val config = TypesafeConfig.fromHoconFilePath("src/main/resources/application.conf", descriptor[io.fayi.CrawlerConfig])
//  implicit val configDescriptor: Descriptor[io.fayi.CrawlerConfig] = descriptor[io.fayi.CrawlerConfig]
//  val config = string("mainUrl").zip(list("allowedSubDomains")(string)).to[io.fayi.CrawlerConfig]
//  implicit val sss: Descriptor[io.fayi.CrawlerConfig] = descriptor[io.fayi.CrawlerConfig]
//  val gg = TypesafeConfigSource
//    .fromHoconFilePath[io.fayi.CrawlerConfig]("src/main/resources/application.conf")
//    .toHocon()
//    .getConfig("crawler")

