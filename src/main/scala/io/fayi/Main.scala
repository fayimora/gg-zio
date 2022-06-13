package io.fayi

import com.typesafe.config.ConfigFactory
import zio.Console.printLine
import zio.config.*, typesafe.*
import zio.config.magnolia.descriptor
import zio.{ZIO, ZIOAppDefault}

object Main extends ZIOAppDefault :
  private implicit val configDescriptor: ConfigDescriptor[CrawlerConfig] = descriptor[CrawlerConfig]

  override def run =
    val program = for
      conf <- read(
                configDescriptor.from(ConfigSource.fromTypesafeConfig(
                  ZIO.attempt(ConfigFactory.defaultApplication())
                )))
      _ <- printLine(s"Conf is $conf")
    yield ()

    program.exitCode
